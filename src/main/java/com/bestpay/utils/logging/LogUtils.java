/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2018 All Rights Reserved.
 */
package com.bestpay.utils.logging;

import lombok.extern.slf4j.Slf4j;

/**
 * 日志工具类
 *
 * @author hujie
 * @version Id: LogUtils.java, v 0.1 2018/1/8 14:23 hujie Exp $$
 */
@Slf4j
public class LogUtils{

    public static void log_info(String msgKey,String msgVal){
        log.info(msgKey,msgVal);
    }
}