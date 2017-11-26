package com.cily.utils.base.integer;

/**
 * Created by 13218 on 2017/8/1.
 */
public class IntUtils {

    private final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
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