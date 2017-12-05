package com.cily.utils.base.time;

/**
 * @author cily
 * @version 1.0.1   2017-01-08  时间格式类型
 */
public interface TimeType {
    /**年月日*/
    String DAY = "yyyyMMdd";
    /**年月日时*/
    String HOUR = "yyyyMMddHH";
    /**年月日时分*/
    String MINUTE = "yyyyMMddHHmm";
    /**年月日时分秒*/
    String SECOND = "yyyyMMddHHmmss";

    /**年月日，中划线分割*/
    String DAY_LINE = "yyyy-MM-dd";
    /**年月日时，中划线分割*/
    String HOUR_LINE = "yyyy-MM-dd-HH";
    /**年月日时分，中划线分割*/
    String MINUTE_LINE = "yyyy-MM-dd-HH-mm";
    /**年月日时分秒，中划线分割*/
    String SECOND_LINE = "yyyy-MM-dd-HH-mm-ss";

    /**年月日，下划线分割*/
    String DAY_LINE_UNDER = "yyyy_MM_dd";
    /**年月日时，下划线分割*/
    String HOUR_LIND_UNDER = "yyyy_MM_dd_HH";
    /**年月日时分，下划线分割*/
    String MINUTE_LIND_UNDER = "yyyy_MM_dd_HH_mm";
    /**年月日时分秒，下划线分割*/
    String SECOND_LINE_UNDER = "yyyy_MM_dd_HH_mm_ss";

    /**年月日时分，下划线分割年月日，空格分割时，冒号分割时分*/
    String MINUTE_LINE_COLON = "yyyy-MM-dd HH:mm";
    /**年月日时分秒，下划线分割年月日，空格分割时，冒号分割时分秒*/
    String SECONDLINE_COLON = "yyyy-MM-dd HH:mm:ss";
}
