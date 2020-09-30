package com.example.excel.util;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.example.excel.model.MchtInfo;
import com.example.excel.template.MchtSQLTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @class: PraseExcelUtil
 * @desc:
 * @author: yx
 * @date: 2020/9/27 23:13
 */
public class ParseExcelUtil {

    public static void parseExcel(String localPath , String writePath, int sheetIndex){
        StringBuilder mchtSql = new StringBuilder();
        ExcelReader reader = ExcelUtil.getReader(localPath,sheetIndex);
        List<MchtInfo> mchtInfos = reader.readAll(MchtInfo.class);
        System.out.println("解析到excel个数:["+mchtInfos.size()+"]个");

        for (MchtInfo mchtInfo : mchtInfos) {
            mchtSql.append("/**----------------------------支付中心执行----------------------------**/");
            mchtSql.append("\n");
            String icbcSQl = MchtSQLTemplate.insertIcbcSQl(mchtInfo.get商户号(), mchtInfo.get商户编号(), mchtInfo.get协议编号());
            mchtSql.append(icbcSQl);
            mchtSql.append("\n");
            String acctSQl = MchtSQLTemplate.insertAcctSQl(mchtInfo.get商户号(), mchtInfo.get商户编号(), mchtInfo.get协议编号());
            mchtSql.append(acctSQl);
            mchtSql.append("\n");
            String mchtBindSQL = MchtSQLTemplate.insertMchtBindSQL(mchtInfo.get商户号());
            mchtSql.append(mchtBindSQL);
            mchtSql.append("\n");
            String p0106SQL = MchtSQLTemplate.insertP0106(mchtInfo.get商户号());
            mchtSql.append(p0106SQL);
            mchtSql.append("\n");
            String p0206SQL = MchtSQLTemplate.insertP0206(mchtInfo.get商户号());
            mchtSql.append(p0206SQL);
            mchtSql.append("\n");
            String p0306SQL = MchtSQLTemplate.insertP0306(mchtInfo.get商户号());
            mchtSql.append(p0306SQL);
            mchtSql.append("\n");
            mchtSql.append("\n");
        }
        mchtSql.append("\n");
        mchtSql.append("/**----------------------------商户中心执行----------------------------**/");
        mchtSql.append("\n");
        for (MchtInfo mchtInfo : mchtInfos) {
            String mchtBaseSQl = MchtSQLTemplate.insertMchtBase(mchtInfo.get商户号(), mchtInfo.get商户名称());
            mchtSql.append(mchtBaseSQl);
            mchtSql.append("\n");
        }
        mchtSql.append("\n");
        saveAsFileWriter(writePath,mchtSql.toString());
    }

    private static void saveAsFileWriter(String filePath, String content) {
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(filePath, true);
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

