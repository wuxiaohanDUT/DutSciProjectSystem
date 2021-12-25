package com.dut.sci.project.response;

public abstract class Response<T> {

    private T data;
    private Boolean success;

    public Response() {}

    public Response(T data, Boolean success) {
        this.data = data;
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
