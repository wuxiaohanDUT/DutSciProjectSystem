package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PaperDTO {

    private Long paperId;

    private List<String> authorIds;

    private List<String> authorNames;

    private String publicationPeriodical;

    private String paperName;

    private String collection;

    private Date publicationTime;

}
