package com.example.excel.util;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.example.excel.model.MchtInfo;
import com.example.excel.template.SettleBatchSQL;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @class: ParseSettleBatch
 * @desc:
 * @author: yx
 * @date: 2020/9/30 11:29
 */
public class ParseSettleBatch {

    public static void parseExcel(String localPath , String writePath) {
        ExcelReader reader = ExcelUtil.getReader(localPath);
        List<List<Object>> read = reader.read();
        List<Object> objects1 = read.get(0);
        String mchtNo = (String)objects1.get(1);
        String orderFlag = (String)objects1.get(3);
        int money =0;
        List<String> strs = new ArrayList<>();
        for (List<Object> objects : read) {
            strs.add((String) objects.get(0));
            Double aDouble = new Double((String) objects.get(7))*100;
            money=money+aDouble.intValue();
        }
        System.out.println("当前xls的行数为:["+read.size()+"]");
        System.out.println("当前xls的总金额为:["+money+"]");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strs.size() ; i++) {
            if (strs.size() == i+1){
                stringBuilder.append("'"+strs.get(i)+"'");
            } else {
                stringBuilder.append("'"+strs.get(i)+"',");
            }
        }
        String mchtBatchSQL = SettleBatchSQL.querySettleBatch(mchtNo, orderFlag, stringBuilder.toString());
        saveAsFileWriter(writePath, mchtBatchSQL);
    }

    private static void saveAsFileWriter(String filePath, String content) {
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(filePath);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
