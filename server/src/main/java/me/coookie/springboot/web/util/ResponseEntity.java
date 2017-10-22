package me.coookie.springboot.web.util;


/**
 * Created by cookie on 2017/10/5.
 */
public class ResponseEntity<T> {
    private T data;
    private String msg;
    private String code;

    private ResponseEntity(T data, String msg, String code){
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static <T> ResponseEntity<T> onSuccess(T data){
        return new ResponseEntity<T>(data,null,"200");
    }

    public static <T> ResponseEntity<T> onFailure(String msg,String code){
        return new ResponseEntity<T>(null, msg, code);
    }
}
