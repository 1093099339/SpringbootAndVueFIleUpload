package com.springboot.file_upload.enums;

/**
 * @program: SpringbootAndVueFIleUpload
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 09 - 24 01:03
 **/
public enum JobStatusEnum implements EnumCodeList.CodeListItem {

    /**
     * 0=停止
     */
    STOP("0", "停止"),
    /**
     * 1=运行
     */
    RUNNING("1", "运行");

    private String value = null;
    private String code = null;

    private JobStatusEnum(String _code, String _value) {
        this.value = _value;
        this.code = _code;
    }

    public static JobStatusEnum getEnumByKey(String key) {
        for (JobStatusEnum e : JobStatusEnum.values()) {
            if (e.getCode().equals(key)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取value
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * 获取code
     */
    @Override
    public String getCode() {
        return code;
    }
}