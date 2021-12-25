package com.dut.sci.project.response;

public class LoginResponse<T> extends Response {

    public LoginResponse(T data, Boolean success) {
        super(data, success);
    }

    public LoginResponse() {
        super();
    }

}
