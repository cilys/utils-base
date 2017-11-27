package com.cily.utils.base;

import java.util.UUID;

/**
 * @author cily
 * @version 1.0.0   2017-01-3  UID随机数生成工具类
 */
public class UUIDUtils {

	/**
	 * 生成不带-的UUID随机数
	 * @return		不带-的UUID随机数
     */
	public final static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}