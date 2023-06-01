package demo.common;

import java.util.HashMap;

public class CommonResponse extends HashMap<String, Object> {
    public static final String Status = "status";
    public static final String Msg = "msg";
    public static final String Data = "data";

    public CommonResponse() {

    }

    /**
     * 
     * @param status
     * @param msg
     */
    public CommonResponse(int status, String msg) {
        super.put(Status, status);
        super.put(Msg, msg);
    }

    /**
     * 
     * @param status
     * @param msg
     * @param data
     */
    public CommonResponse(int status, String msg, Object data) {
        super.put(Status, status);
        super.put(Msg, msg);
        // TODO 判断缺陷
        if (data != null) {
            super.put(Data, data);
        }
    }

    // public static CommonResponse success() {
    // return CommonResponse.success("success");
    // }

    // public static CommonResponse success(String msg) {
    // return CommonResponse.success(msg, null);
    // }

    // public static CommonResponse success(Object data) {
    // return CommonResponse.success("success", data);
    // }

    // public static CommonResponse success(String msg, Object data) {
    // return new CommonResponse(609, msg, data);
    // }

    public static CommonResponse success(Object data) {
        return new CommonResponse(609, "success", data);
    }

    // public static CommonResponse fail(String msg) {
    // return CommonResponse.fail(msg, null);
    // }

    // public static CommonResponse fail(int status, String msg) {
    // return new CommonResponse(status, msg, null);
    // }

    // public static CommonResponse fail(String msg, Object data) {
    // return new CommonResponse(716, msg, data);
    // }

    public static CommonResponse fail() {
        return new CommonResponse(716, "fail", null);
    }
}
