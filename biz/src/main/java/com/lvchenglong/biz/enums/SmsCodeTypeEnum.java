package com.lvchenglong.biz.enums;

/**
 * 短信类型
 */
public enum SmsCodeTypeEnum {
    REG("REG","注册"),
    LOGIN("LOGIN","登录");

    private String message;
    private String code;

    SmsCodeTypeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
