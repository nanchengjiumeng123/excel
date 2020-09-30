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

//    public static void main(String[] args) {
//        ParseExcelUtil.parseExcel("D:\\dingding\\9-27\\石化建档2个-0927-1.xls","H:\\zip\\460\\alipayBill\\sql.txt", 9);
//    }

    public static void main(String[] args) {
        ParseSettleBatch.parseExcel("C:\\Users\\yx\\Desktop\\查询党委清算费用清单(17016201040011302-1-2020-09).xlsx"
        ,"C:\\Users\\yx\\Desktop\\mine.txt");
    }
}
