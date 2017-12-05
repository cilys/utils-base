package com.cily.utils.base.integer;

/**
 * @author cily
 * @version 1.0.0   2017-01-02  int工具类
 */
public class IntUtils {

    private final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    /**
     * 获取int变量的位数
     * @param x     int变量
     * @return      int变量的长度
     */
    public static int stringSize(int x) {
        if (x < 0){
            x = Math.abs(x);
        }
        for (int i=0; ; i++)
            if (x <= sizeTable[i])
                return i+1;
    }

//    public static void main(String[] args){
//        System.out.println("***" + stringSize(-1999999999));
//    }
}