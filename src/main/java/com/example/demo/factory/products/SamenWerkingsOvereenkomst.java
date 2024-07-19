package com.example.demo.factory.products;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.enums.DocumentTypes;
import com.example.demo.factory.DocumentRequestFactory;
import com.example.demo.factory.DocumentRequestFactory.DocumentRequest;
import com.example.demo.factory.SamenwerkingOvereentkomstCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class SamenWerkingsOvereenkomst implements DocumentRequest, Serializable {
    private String surname;
    private DocumentTypes type;

    public static DocumentRequest mapFromDTO(DocumentRequestDTO dto) {
        return SamenWerkingsOvereenkomst.builder()
                .withSurname(dto.getSurrname())
                .withType(DocumentTypes.SAMENWERKINGS_OVEREENTKOMST)
                .build();
    }
}
