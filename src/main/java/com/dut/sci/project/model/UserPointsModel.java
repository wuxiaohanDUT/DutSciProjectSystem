package com.dut.sci.project.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class UserPointsModel extends BaseRowModel {

    @ExcelProperty(value = {"学号"}, index = 0)
    private Long userId;

    @ExcelProperty(value = {"姓名"}, index = 1)
    private String userName;

    @ExcelProperty(value = {"班级"}, index = 2)
    private String userClass;

    @ExcelProperty(value = {"积分数量"}, index = 3)
    private Integer points;
}
