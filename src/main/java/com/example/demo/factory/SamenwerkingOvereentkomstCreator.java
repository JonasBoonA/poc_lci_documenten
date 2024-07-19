package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.factory.products.SamenWerkingsOvereenkomst;

public class SamenwerkingOvereentkomstCreator extends DocumentRequestFactory {

    @Override
    public DocumentRequest apply(DocumentRequestDTO requestDTO) {
        return SamenWerkingsOvereenkomst.mapFromDTO(requestDTO);
    }

}
