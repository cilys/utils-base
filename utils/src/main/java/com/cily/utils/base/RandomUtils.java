package com.cily.utils.base;

import com.cily.utils.base.log.Logs;

import java.util.Random;

/**
 * @author cily
 * @version 1.0.0   2017-01-3  随机数生成工具类
 */
public class RandomUtils {
	private final static String TAG = "RandomUtils";

	/**数字型*/
	public final static String NUM = "0123456789";
	/**小写字母型*/
	public final static String CHAR_SMALL = "abcdefghijklmnopqrstuvwxyz";
	/**混合型，数字大小写字母*/
	public final static String MIX = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * 生成随机数
	 * @param length 	随机数长度
	 * @param base		随机数类型（数字型、字母型、混合型），默认混合型
     * @return			随机数
     */
	public final static String getRandomStr(int length, String base){
		Logs.sysOut(StrUtils.join(TAG, ":", "getRandomStr: length = ", length, "<---> base = ", base));
		if(StrUtils.isEmpty(base)){
			base = MIX;
		}
		
		if(length < 1){
			length = 1;
		}else if(length > 100){
			length = 10;
		}
		
		Random r = getRandom();
		StringBuilder su = StrUtils.getStringBuilder();
		for(int i = 0; i < length; i++){
			int num = getInt(r, base.length());
			su.append(base.charAt(num));
		}
		return su.toString();
	}

	/**
	 * 随机int型随机数
	 * @param bound	范围
	 * @return		int类型随机数
     */
	public final static int getRandomInt(int bound){
		return getInt(getRandom(), bound);
	}

	/**
	 * 生成Random对象
	 * @return		random对象
     */
	public final static Random getRandom(){
		return new Random();
	}

	/**
	 * 生成int型随机数
	 * @param r		random对象
	 * @param bound	范围
     * @return
     */
	private final static int getInt(Random r, int bound){
		if(r == null){
			return -1;
		}
		
		if(bound < 1){
			bound = 1;
		}
		
		return r.nextInt(bound);
	}
}