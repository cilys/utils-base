package com.cily.utils.base;

/**
 * user:cily
 * time:2017/8/28
 * desc:字符串处理工具
 */
public class StrUtils {

	/**
	 * 字符串拼接
	 * @param os
	 * @return
     */
	public final static String join(Object... os){
		if(os != null){
			StringBuilder su = getStringBuilder();
			for(Object o : os){
				su.append(o);
			}
			return su.toString();
		}
		return null;
	}

	/**
	 * 生成StringBuilder
	 * @return
     */
	public final static StringBuilder getStringBuilder(){
		return new StringBuilder();
	}

	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
     */
	public final static boolean isEmpty(String str){
		return isNull(str) || "".equals(str.trim());
	}

	/**
	 * 判断字符串是否为空对象
	 * @param str
	 * @return
     */
	public final static boolean isNull(String str){
		return str == null;
	}
}