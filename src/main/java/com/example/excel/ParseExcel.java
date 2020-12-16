package com.example.excel;


import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.example.excel.model.MchtInfo;
import com.example.excel.template.MchtSQLTemplate;
import com.example.excel.util.ParseExcelUtil;
import com.example.excel.util.ParseSettleBatch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @class: main
 * @desc:
 * @author: yx
 * @date: 2020/9/27 23:15
 */
public class ParseExcel {

//    public static void main1(String[] args) {
//        ParseExcelUtil.parseExcel("D:\\dingding\\11月份\\11-10\\820200914000018-2020-10.xls","D:\\dingding\\11月份\\11-10\\sql.txt", 0);
//    }

    public static void main(String[] args) {
            ParseSettleBatch.parseExcel2("D:\\dingding\\12月份\\12-11");
        }

//    public static void main(String[] args) {
//        ParseSettleBatch.parseExcel3("D:\\dingding\\11月份\\11-10\\820200914000018-2020-10.xls","D:\\dingding\\11月份\\11-10\\sql.txt");
//    }

//        ParseSettleBatch.parseExcel2("D:\\dingding\\10-10\\滨州社会化服务协调中心党委清算党费缴纳明细对账单.xls"
//        ,"D:\\dingding\\10-10\\mine.txt");

//        File file = new File("D:\\dingding\\10-10\\滨州社会化服务协调中心党委清算党费缴纳明细对账单.xls");
//        ParseSettleBatch.parseExcel2(file.getAbsolutePath(),file.getParentFile().getAbsolutePath()+"/"+file.getName().substring(0,file.getName().lastIndexOf('.'))+".txt");

}
