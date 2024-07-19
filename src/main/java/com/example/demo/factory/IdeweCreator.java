package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.factory.products.IdeweDocumentRequest;

public class IdeweCreator extends DocumentRequestFactory {

    @Override
    public DocumentRequest apply(DocumentRequestDTO documentRequestDTO) {
        return IdeweDocumentRequest.mapFromDTO(documentRequestDTO);
    }

}
