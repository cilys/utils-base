package com.cily.utils.base;

import java.util.UUID;

/**
 * user:cily
 * time:2017/8/28
 * desc:UUID随机数生成工具类
 */
public class UUIDUtils {

	/**
	 * 生成不带-的UUID随机数
	 * @return
     */
	public final static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}