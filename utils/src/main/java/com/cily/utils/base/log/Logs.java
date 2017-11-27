package com.cily.utils.base.log;

/**
 * @author cily
 * @version 1.0.1   2017-01-08  日志工具类
 */
public class Logs {
	/**默认全部log*/
	private static int level = LogType.ALL;
	/**是否写log到日志文件里*/
	private static boolean writeLog = false;
	/**是否输出log到控制台*/
	private static boolean consoleLog = true;

	/**
	 * System.out.println
	 * @param msg
     */
	public static void sysOut(String msg){
		if(getLevel() >= LogType.DEBUG && msg != null){
			if (consoleLog) {
				System.out.println(msg);
			}
		}
	}

	/**
	 * 输出异常
	 * @param e		异常
     */
	public static void printException(Throwable e){
		if(getLevel() >= LogType.EXCEPTION && e != null){
			if (consoleLog) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * System.err.println
	 * @param msg	输出内容
     */
	public static void sysErr(String msg){
		if (getLevel() >= LogType.ERROR && msg != null){
			if (consoleLog) {
				System.err.println(msg);
			}
		}
	}

	/**
	 * 日志等级
	 * @return		输出日志的等级
     */
	public static int getLevel() {
		return level;
	}

	/**
	 * 设置log等级
	 * @param l		日志等级
     */
	public static void setLevel(int l) {
		if(l < LogType.NONE){
			l = LogType.NONE;
		}else if(l > LogType.ALL){
			l = LogType.ALL;
		}
	}

	/**
	 * 是否写log文件
	 * @return
     */
	public static boolean isWriteLog(){
		return writeLog;
	}

	/**
	 * 设置是否输出log到控制台
	 * @param c
     */
	public static void setConsoleLog(boolean c){
		consoleLog = c;
	}

	/**
	 * 是否输出log到控制台
	 * @return
     */
	public static boolean isConsoleLog(){
		return consoleLog;
	}
	/**app包名*/
	protected static String appName;
	/**app签名*/
	protected static String  appSign;
	/**app包名*/
	protected static String appVersion;
	/**系统版本*/
	protected static String sysVersion;
	/**设备唯一串码*/
	protected static String imei;
	/**厂商*/
	protected static String deviceBrand;
	/**手机型号*/
	protected static String sysModel;
	/**系统sdk版本*/
	protected static String sysSDK;
	//sysModel手机型号，deviceBrand厂商，sysVersion系统版本，sdk版本
	public static void setSysInfo(String appName, String appSign, String appVersion, String sysVersion,
								  String imei, String deviceBrand, String sysModel, String sdk){
		Logs.appName = appName;
		Logs.appSign = appSign;
		Logs.appVersion = appVersion;
		Logs.sysVersion = sysVersion;
		Logs.imei = imei;
		Logs.deviceBrand = deviceBrand;
		Logs.sysModel = sysModel;
		Logs.sysSDK = sdk;
	}
}