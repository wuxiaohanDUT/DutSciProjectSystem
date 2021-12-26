package com.dut.sci.project.response;

import lombok.Data;

@Data
public abstract class Response<T> {

    private T data;
    private Boolean success;
    private String description;

}
