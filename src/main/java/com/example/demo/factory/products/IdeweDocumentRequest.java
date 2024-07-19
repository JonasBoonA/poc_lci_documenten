package com.example.demo.factory.products;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.enums.DocumentTypes;
import com.example.demo.factory.DocumentRequestFactory;
import com.example.demo.factory.DocumentRequestFactory.DocumentRequest;
import lombok.*;

import java.io.Serializable;

@ToString
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class IdeweDocumentRequest implements DocumentRequest, Serializable {
    private String name;
    private DocumentTypes type;

    public static DocumentRequest mapFromDTO(DocumentRequestDTO dto) {
        return IdeweDocumentRequest.builder()
                .withName(dto.getName())
                .withType(DocumentTypes.IDEWE)
                .build();
    }

}
