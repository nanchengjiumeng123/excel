package com.example.excel.template;

/**
 * @class: SettleBatchSQL
 * @desc:
 * @author: yx
 * @date: 2020/9/30 11:29
 */
public class SettleBatchSQL {

    public  static String querySettleBatch (String mchtNo, String orderFlag, String orderNos ,int size, int money) {

        String content = "当前xls的行数为:["+size+"] \n当前xls的总金额为:["+money+"]\n\n" +
                "select * from tbl_pay_order_txn_info where mcht_no='"+mchtNo+"' and order_flag='"+orderFlag+"' and order_state='00'\n" +
                "and order_no not in ("+orderNos+");";
        return content;
    }

    public  static String querySettleBatch2 (String mchtNo, String orderFlag, String orderNos ,int size, int money) {

        String content = "当前xls的行数为:["+size+"] \n当前xls的总金额为:["+money+"]\n\n" +
                "select order_flag from tbl_pay_order_txn_info where order_no=''\n\n"+
                "select * from tbl_pay_order_txn_info where mcht_no='"+mchtNo+"' and order_flag='' and order_state='00'\n" +
                "and order_no not in ("+orderNos+");";
        return content;
    }

//    public  static String querySettleBatch2 (String mchtNo, String orderFlag, String orderNos ,int size, int money) {
//
//        String content = "select * from tbl_pay_order_txn_info where order_no = '' and order_amt != ''";
//        return content;
//    }

}
