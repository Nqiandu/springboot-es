package com.xxx.springboot.es.status;

/**
 * @Author JN
 * @Date 2020/5/3 17:49
 * @Version 1.0
 * @Description
 **/
public enum  StatusEnum {

    /**
     * 成功
     * 失败
     * 存在
     * 不存在
     */
    SUCCESS("1", "操作成功"),
    FAILED("2", "操作失败"),
    EXIST("3", "存在"),
    NOT_EXIST("4", "不存在");

    StatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getMsg(String code) {
        for(StatusEnum statusEnum : StatusEnum.values()) {
            if(statusEnum.getCode().equals(code)) {
                return statusEnum.getMsg();
            }
        }
        return "null";
    }
}
