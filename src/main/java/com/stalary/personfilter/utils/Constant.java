package com.stalary.personfilter.utils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Constant
 * 存储常量
 * @author lirongqian
 * @since 2018/04/14
 */
public class Constant {

    public static final String SPLIT = ":";

    public static final String OK = "OK";

    /**
     * 用户相关
     */
    public static final String Authorization = "Authorization";

    public static final String LOGIN = "login";

    public static final String LOGOUT = "logout";

    public static final String REGISTER = "register";

    public static final String UPDATE = "update";

    public static final String PASSWORD = "password";

    public static final String UPDATE_PASSWORD = "update/password";



    public static final String SENDINFO = "sendInfo";

    public static final String PICTURE = "picture";

    /**
     * kafka通知
     */
    public static final String NOTIFY = "notify";

    /**
     * 投递简历
     */
    public static final String SEND_RESUME = "send_resume";

    /**
     * 处理简历
     */
    public static final String HANDLE_RESUME = "handle";

    /**
     * 投递方
     */
    public static final String SEND = "send";

    /**
     * 接受方
     */
    public static final String RECEIVE = "receive";

    /**
     * 查看简历
     */
    public static final String LOOK = "look";

    public static final List<String> ORIGIN_LIST = Lists.newArrayList("120.24.5.178", "localhost");

    public static final Joiner JOINER = Joiner.on(SPLIT);

    public static String getKey(String... keys) {
        return JOINER.join(keys);
    }
}