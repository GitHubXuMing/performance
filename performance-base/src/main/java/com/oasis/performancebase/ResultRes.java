package com.oasis.performancebase;

import java.io.Serializable;

public class ResultRes<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private ResultRes(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static<T> ResultRes<T> success(T data){
        return new ResultRes<T>(200,"SUCCESS",data);
    }
    public static ResultRes success(){
        return success(null);
    }
    public static ResultRes error(int code,String msg){
        return new ResultRes(code,msg,null);
    }

}
