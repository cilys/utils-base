package com.cily.utils.base.time;

import com.cily.utils.base.StrUtils;
import com.cily.utils.base.log.Logs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author cily
 * @version 1.0.1   2017-01-10  时间格式处理工具
 */
public class TimeUtils {
	private final static String TAG = "TimeUtils";

	/**
	 * 长整型转String格式
	 * @param time		长整型时间
	 * @param format	时间格式
     * @return
     */
	public final static String milToStr(long time, String format){
//		Logs.sysOut(StrUtils.join(TAG, "-->", "milToStr: time = ", time, "<--->format = ", format));
		if(StrUtils.isEmpty(format)){
			format = TimeType.SECONDLINE_COLON;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try{
			return sdf.format(time);
		}catch (IllegalArgumentException e) {
			Logs.printException(e);
		}
		return null;
	}

	/**
	 * 生成SimpleDateFormat对象
	 * @param format	时间格式
	 * @return
     */
	public final static SimpleDateFormat getSdf(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf;
	}

	/**
	 * 字符串转长整型
	 * @param d			时间
	 * @param format	格式
	 * @param defValue	默认
     * @return
     */
	public final static long strToMil(String d, String format, long defValue){
//		Logs.sysOut(StrUtils.join(TAG, "-->", "milToStr: date = ", d, "<--->format = ", format, "<--->defValue = ", defValue));
		
		if(StrUtils.isEmpty(format)){
			format = TimeType.SECONDLINE_COLON;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try{
			return sdf.parse(d).getTime();
		}catch (ParseException e) {
			Logs.printException(e);
		}
		return defValue;
	}
}