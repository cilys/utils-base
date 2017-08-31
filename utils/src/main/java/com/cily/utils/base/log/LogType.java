package com.cily.utils.base.log;

/**
 * user:cily
 * time:2017/6/13
 * desc:
 */

public interface LogType {
    /**无log*/
    int NONE = -1;
    /**所有log*/
    int ALL = 6;
    int VERBOSE = 6;
    int DEBUG = 5;
    int INFO = 4;
    int WARN = 3;
    int ERROR = 2;
    int EXCEPTION = 1;
    int CRASH = 0;

    String TYPE_ALL = "ALL";
    String TYPE_VERBOSE = "VERBOSE";
    String TYPE_DEBUG = "DEBUG";
    String TYPE_INFO = "INFO";
    String TYPE_WARN = "WARN";
    String TYPE_ERROR = "ERROR";
    String TYPE_EXCEPTION = "EXCEPTION";
    String TYPE_CRASH = "CRASH";
    
    String TAG_SYS_OUT = "System.out.println";
    String TAG_SYS_ERR = "System.err.println";
    String TAG_THROWABLE = "Throwable";
    String TAG_CRASH = "Crash";
}
