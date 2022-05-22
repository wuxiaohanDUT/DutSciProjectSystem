package com.dut.sci.project.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class AddPaperRequet {

    private Long applicantId;
    private List<String> participantIds;
    private String publicationPeriodical;
    private String paperName;
    private String collection;
    private Date publicationTime;
    private String contentDescription;

}
