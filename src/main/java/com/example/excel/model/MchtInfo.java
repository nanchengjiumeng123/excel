package com.example.excel.model;

import java.io.Serializable;

/**
 * @class: MchtInfo
 * @desc:
 * @author: yx
 * @date: 2020/9/27 22:13
 */
public class MchtInfo implements Serializable {

    private String 序号;

    private String 商户名称;

    private String 商户编号;

    private String 协议编号;

    private String 户名;

    private String 账号;

    private String 商户号;

    public String get序号() {
        return 序号;
    }

    public void set序号(String 序号) {
        this.序号 = 序号;
    }

    public String get商户名称() {
        return 商户名称;
    }

    public void set商户名称(String 商户名称) {
        this.商户名称 = 商户名称;
    }

    public String get商户编号() {
        return 商户编号;
    }

    public void set商户编号(String 商户编号) {
        this.商户编号 = 商户编号;
    }

    public String get协议编号() {
        return 协议编号;
    }

    public void set协议编号(String 协议编号) {
        this.协议编号 = 协议编号;
    }

    public String get户名() {
        return 户名;
    }

    public void set户名(String 户名) {
        this.户名 = 户名;
    }

    public String get账号() {
        return 账号;
    }

    public void set账号(String 账号) {
        this.账号 = 账号;
    }

    public String get商户号() {
        return 商户号;
    }

    public void set商户号(String 商户号) {
        this.商户号 = 商户号;
    }

    @Override
    public String toString() {
        return "MchtInfo{" +
                "序号='" + 序号 + '\'' +
                ", 商户名称='" + 商户名称 + '\'' +
                ", 商户编号='" + 商户编号 + '\'' +
                ", 协议编号='" + 协议编号 + '\'' +
                ", 户名='" + 户名 + '\'' +
                ", 账号='" + 账号 + '\'' +
                ", 商户号='" + 商户号 + '\'' +
                '}';
    }
}
