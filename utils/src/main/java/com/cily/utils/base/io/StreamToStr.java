package com.cily.utils.base.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * user:cily
 * time:2017/6/13
 * desc:Stream转字符串工具类
 */

public class StreamToStr {
    /**
     * 异常转String
     * @param e
     * @return
     */
    public static String throwableToStr(Throwable e){
        if (e == null){
            return null;
        }
//        try{
//            Writer result = new StringWriter();
//            PrintWriter printWriter = new PrintWriter(result);
//            e.printStackTrace(printWriter);
//            String s = result.toString();
//            result.close();
//            printWriter.close();
//            System.out.println("exc = " + e.toString());
//            System.out.println("exception = " + s);
//            return s;
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        e.printStackTrace(new PrintStream(bos));
        if (bos != null){
            try {
                bos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            String s = bos.toString();
            System.out.println("exception = " + s);
            return bos.toString();
        }
        return null;
    }
}
