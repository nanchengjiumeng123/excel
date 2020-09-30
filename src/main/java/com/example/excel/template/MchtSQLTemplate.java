package com.example.excel.template;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @class: MchtSQLTemplate
 * @desc:
 * @author: yx
 * @date: 2020/9/16 9:25
 */
public class MchtSQLTemplate {

    public  static String insertIcbcSQl (String mchtNo, String pagyMchtNo, String protocolNo) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "insert into tbl_pagy_mcht_info (seq_id, chl_no, mcht_no, pagy_no, super_pagy_mcht_no, pagy_mcht_no, protocol_no, app_id, open_id, union_id, pay_limit, pagy_mcht_state, create_time, create_user, update_time, update_user, version) " +
                "values ('"+mchtNo+"4301', '1001', '"+mchtNo+"', '4301', null, '"+pagyMchtNo+"', '"+protocolNo+"', 'wxd04e2ca96fc2b191', null, null, null, '00', '"+format+" 12:12:12', 'admin', '"+format+" 12:12:12', 'admin', 0);";
    }

    public  static String insertAcctSQl (String mchtNo, String pagyMchtNo, String protocolNo) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "insert into tbl_pagy_mcht_info (seq_id, chl_no, mcht_no, pagy_no, super_pagy_mcht_no, pagy_mcht_no, protocol_no, app_id, open_id, union_id, pay_limit, pagy_mcht_state, create_time, create_user, update_time, update_user, version) " +
                "values ('"+mchtNo+"5101', '1001', '"+mchtNo+"', '5101', null, '"+pagyMchtNo+"', '"+protocolNo+"', 'wxd04e2ca96fc2b191', null, null, null, '00', '"+format+" 12:12:12', 'admin', '"+format+" 12:12:12', 'admin', 0);";
    }


    public  static String insertMchtBindSQL (String mchtNo) {
        Date date = new Date();
        UUID uuid = UUID.randomUUID();
        String uuids = uuid.toString();
        String seq = uuid.toString().substring(uuids.length() - 12, uuids.length());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);

        return "insert into `tbl_pay_mcht_sec_bind_info` values (" +
                "'"+seq+mchtNo+"', '"+mchtNo+"', '02', '01', '1202224512262352898', '00', '"+format+" 12:12:12', 'admin', '"+format+" 12:12:12', 'admin', '0');";
    }

    public  static String insertP0106 (String mchtNo) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "insert  into `tbl_pay_core_mcht_rel_prod_info`(`bind_no`,`mcht_no`,`pay_prod_id`,`data_state`,`create_time`,`create_user`,`update_time`,`update_user`,`version`) values (" +
                "'"+mchtNo+"0106','"+mchtNo+"','P0106','00','"+format+" 12:12:12',NULL,'"+format+" 12:12:12',NULL,0);";
    }

    public  static String insertP0206 (String mchtNo) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "insert  into `tbl_pay_core_mcht_rel_prod_info`(`bind_no`,`mcht_no`,`pay_prod_id`,`data_state`,`create_time`,`create_user`,`update_time`,`update_user`,`version`) values (" +
                "'"+mchtNo+"0206','"+mchtNo+"','P0206','00','"+format+" 12:12:12',NULL,'"+format+" 12:12:12',NULL,0);";
    }

    public  static String insertP0306 (String mchtNo) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "insert  into `tbl_pay_core_mcht_rel_prod_info`(`bind_no`,`mcht_no`,`pay_prod_id`,`data_state`,`create_time`,`create_user`,`update_time`,`update_user`,`version`) values (" +
                "'"+mchtNo+"0306','"+mchtNo+"','P0306','00','"+format+" 12:12:12',NULL,'"+format+" 12:12:12',NULL,0);";
    }

    public  static String insertMchtBase (String mchtNo, String mchtName) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return "INSERT INTO \"TBL_MCHT_BASE_INFO\" VALUES (" +
                "'"+mchtNo+"', '"+mchtName+"', '"+mchtName+"', '1001', null, null, null, null, null, null, null, null, '01', 'admin', TO_DATE('"+format+" 12:12:12', 'YYYY-MM-DD HH24:MI:SS'), 'admin', TO_DATE('"+format+" 12:12:12', 'YYYY-MM-DD HH24:MI:SS'), '0');";
    }



}
