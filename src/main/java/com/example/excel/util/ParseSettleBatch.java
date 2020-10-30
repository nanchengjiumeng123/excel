package com.example.excel.util;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.example.excel.model.MchtInfo;
import com.example.excel.template.SettleBatchSQL;
import org.springframework.util.ObjectUtils;

import java.io.File;
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
            Double aDouble = new Double((String) objects.get(8))*100;
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
        String mchtBatchSQL = SettleBatchSQL.querySettleBatch(mchtNo, orderFlag, stringBuilder.toString(),read.size(),money);
        saveAsFileWriter(writePath, mchtBatchSQL);
    }

    public static void parseExcel2(String localPath ) {
        File files = new File(localPath);
        StringBuilder nullXlsBuilder = new StringBuilder();
        nullXlsBuilder.append("当前xls内容为空：");
        String _path = "";
        for (File file : files.listFiles()) {
            _path = file.getParentFile().getParentFile().getAbsolutePath()+"/空的xls.txt";
            System.out.println("当前文件:"+file.getName());
            String writePath = file.getParentFile().getParentFile().getAbsolutePath()+"/"+file.getName().substring(0,file.getName().lastIndexOf('.'))+".txt";
            String path = file.getAbsolutePath();
            ExcelReader reader = ExcelUtil.getReader(path);
            StringBuilder stringBuilder = new StringBuilder();

            List<List<Object>> read = reader.read();
            if (read.get(3).get(0).equals("合    计")){
                nullXlsBuilder.append(file.getName());
                nullXlsBuilder.append("\n");
                continue;
            }
            List<Object> objects1 = read.get(4);
            String mchtNo = (String)objects1.get(5);
            String orderFlag = (String)objects1.get(3);
            int money =0;
            List<String> strs = new ArrayList<>();
            for (int i = 0; i < read.size(); i++) {
                if (i<=2 || i == read.size()-1){
                    continue;
                }
                strs.add((String)read.get(i).get(1));
                String s = (String)read.get(i).get(8);
                Double aDouble = 0.00;
                if(!ObjectUtils.isEmpty(s)){
                    aDouble = Double.parseDouble(s) * 100;
                }
                money=money+aDouble.intValue();
            }

            System.out.println("当前xls的行数为:["+read.size()+"]");
            System.out.println("当前xls的总金额为:["+money+"]");
            for (int i = 0; i < strs.size() ; i++) {
                if (strs.size() == i+1){
                    stringBuilder.append("'"+strs.get(i)+"'");
                } else {
                    stringBuilder.append("'"+strs.get(i)+"',\n");
                }
            }
            String mchtBatchSQL = SettleBatchSQL.querySettleBatch2(mchtNo, orderFlag, stringBuilder.toString(),read.size(),money);
            saveAsFileWriter(writePath, mchtBatchSQL);
        }
            saveAsFileWriter(_path, nullXlsBuilder.toString());

    }

    public static void parseExcel3(String localPath ) {
        File files = new File(localPath);
        StringBuilder nullXlsBuilder = new StringBuilder();
        nullXlsBuilder.append("当前xls内容为空：");
        String _path = "";
        for (File file : files.listFiles()) {
            _path = file.getParentFile().getParentFile().getAbsolutePath()+"/空的xls.txt";
            System.out.println("当前文件:"+file.getName());
            String writePath = file.getParentFile().getParentFile().getAbsolutePath()+"/"+file.getName().substring(0,file.getName().lastIndexOf('.'))+".txt";
            String path = file.getAbsolutePath();
            ExcelReader reader = ExcelUtil.getReader(path);
            StringBuilder stringBuilder = new StringBuilder();

            List<List<Object>> read = reader.read();
            if (read.get(3).get(0).equals("合    计")){
                nullXlsBuilder.append(file.getName());
                nullXlsBuilder.append("\n");
                continue;
            }
            List<Object> objects1 = read.get(4);
            String mchtNo = (String)objects1.get(5);
            String orderFlag = (String)objects1.get(3);
            int money =0;
            List<String> strs = new ArrayList<>();
            for (int i = 0; i < read.size(); i++) {
                if (i<=2 || i == read.size()-1){
                    continue;
                }
                strs.add((String)read.get(i).get(1));
                String s = (String)read.get(i).get(8);
                Double aDouble = 0.00;
                if(!ObjectUtils.isEmpty(s)){
                    aDouble = Double.parseDouble(s) * 100;
                }
                money=money+aDouble.intValue();
            }

            System.out.println("当前xls的行数为:["+read.size()+"]");
            System.out.println("当前xls的总金额为:["+money+"]");
            for (int i = 0; i < strs.size() ; i++) {
                if (strs.size() == i+1){
                    stringBuilder.append("'"+strs.get(i)+"'");
                } else {
                    stringBuilder.append("'"+strs.get(i)+"',\n");
                }
            }
            String mchtBatchSQL = SettleBatchSQL.querySettleBatch2(mchtNo, orderFlag, stringBuilder.toString(),read.size(),money);
            saveAsFileWriter(writePath, mchtBatchSQL);
        }
        saveAsFileWriter(_path, nullXlsBuilder.toString());

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
