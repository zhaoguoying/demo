package com.example.demo.exception;
/*
 * 作者：赵国应
 * 时间：2018-12-31 15:38
 * 描述：异常处理
 */
public class MyException extends Exception {
    private static final long serialVersionUID = -5519743897907627214L;

    public MyException(String message){
        super(message);
    }
}
