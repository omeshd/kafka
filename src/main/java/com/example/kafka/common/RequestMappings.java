package com.example.kafka.common;

public interface RequestMappings {

    public static String CONTEXT_PATH = "";

    public static String CONTEXT_PATH_ROOT = "/";

    public static String CREATE_USER = "/user";

    public static String UPDATE_USER = "/user/{userid}";

    public static String RETRIEVE_USER_BY_ID = "/user/{userid}";
}
