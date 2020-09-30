package com.example.excel.template;

/**
 * @class: SettleBatchSQL
 * @desc:
 * @author: yx
 * @date: 2020/9/30 11:29
 */
public class SettleBatchSQL {

    public  static String querySettleBatch (String mchtNo, String orderFlag, String orderNos ) {
        return "select * from tbl_pay_order_txn_info where mcht_no='"+mchtNo+"' and order_flag='"+orderFlag+"' and order_state='00'\n" +
                "and order_no not in ("+orderNos+");";
    }
}
