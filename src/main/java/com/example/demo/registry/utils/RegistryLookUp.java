package com.example.demo.registry.utils;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.enums.DocumentTypes;
import com.example.demo.factory.DocumentRequestFactory;
import com.example.demo.factory.DocumentRequestFactory.DocumentRequest;
import com.example.demo.factory.IdeweCreator;
import com.example.demo.factory.SamenwerkingOvereentkomstCreator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static com.example.demo.enums.DocumentTypes.IDEWE;
import static com.example.demo.enums.DocumentTypes.SAMENWERKINGS_OVEREENTKOMST;

@Component
@Slf4j
public class RegistryLookUp {

    private static final Map<DocumentTypes, DocumentRequestFactory> register = Map.ofEntries(
            Map.entry(SAMENWERKINGS_OVEREENTKOMST, new SamenwerkingOvereentkomstCreator()),
            Map.entry(IDEWE, new IdeweCreator())
    );

    public List<DocumentRequest> lookup(DocumentRequestDTO documentRequest) {
        return documentRequest.getDocumentTypes().stream()
                .map(DocumentTypes::getTypeFromInput)
                    .peek(t -> log.info("Incoming types: {}", t.getIncomingType()))
                .map(register::get)
                .map(creator -> creator.apply(documentRequest))
                    .peek(t -> log.info("Document Request: {}", t.toString()))
                .toList();
    }
}
