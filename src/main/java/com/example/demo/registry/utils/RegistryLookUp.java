package com.example.demo.registry.utils;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.enums.DocumentTypes;
import com.example.demo.factory.DocumentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.example.demo.registry.Registry.register;


@Component
@Slf4j

public class RegistryLookUp {

    /**
     * @description This class will be the place for configuring what to do after finding a creator in the register.
     * @param documentRequest incoming request from controller
     * @return A list of payloads
     */
    public List<DocumentRequest> lookup(DocumentRequestDTO documentRequest) {
        return documentRequest.getDocumentTypes().stream()
                .map(DocumentTypes::getTypeFromInput)
                    .peek(documentType -> log.info("Incoming types: {}", documentType))
                .map(register::get)
                .map(creator -> creator.create(documentRequest))
                   .peek(payload -> log.info("Document Request: {}", payload.toString()))
                .toList();
    }
}
