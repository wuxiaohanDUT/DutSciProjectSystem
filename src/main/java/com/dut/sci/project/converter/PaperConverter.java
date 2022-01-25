package com.dut.sci.project.converter;

import com.dut.sci.project.domain.PaperDO;
import com.dut.sci.project.dto.PaperDTO;
import org.springframework.util.CollectionUtils;

import javax.xml.stream.events.DTD;
import java.util.List;

public class PaperConverter {

    public static PaperDO paperDTO2DO(PaperDTO paperDTO) {
        if (paperDTO == null) {
            return null;
        }
        PaperDO paperDO = new PaperDO();
        paperDO.setPaperId(paperDTO.getPaperId());
        paperDO.setPaperName(paperDTO.getPaperName());
        paperDO.setCollection(paperDTO.getCollection());
        paperDO.setPublicationPeriodical(paperDTO.getPublicationPeriodical());
        paperDO.setPublicationTime(paperDTO.getPublicationTime());
        List<String> authorIds = paperDTO.getAuthorIds();
        if (!CollectionUtils.isEmpty(authorIds)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < authorIds.size() - 1; i++) {
                stringBuilder.append(authorIds.get(i));
                stringBuilder.append("_");
            }
            stringBuilder.append(authorIds.get(authorIds.size() - 1));
            paperDO.setAuthorIds(stringBuilder.toString());
        }
        return paperDO;
    }

    public static PaperDTO paperDO2DTO(PaperDO paperDO) {
        if (paperDO == null) {
            return null;
        }
        PaperDTO paperDTO = new PaperDTO();
        paperDTO.setPaperId(paperDO.getPaperId());
        paperDTO.setPaperName(paperDO.getPaperName());
        paperDTO.setCollection(paperDO.getCollection());
        paperDTO.setPublicationPeriodical(paperDO.getPublicationPeriodical());
        paperDTO.setPublicationTime(paperDO.getPublicationTime());
        String[] authorIds = paperDO.getAuthorIds().split("_");
        paperDTO.setAuthorIds(List.of(authorIds));
        return paperDTO;
    }
}
