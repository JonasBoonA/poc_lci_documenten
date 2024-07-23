package com.example.demo.controller;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.factory.DocumentRequest;
import com.example.demo.registry.utils.RegistryLookUp;
import jakarta.xml.bind.JAXBContext;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("document")
@AllArgsConstructor
@Slf4j
public class RestController {

    RegistryLookUp registryLookUp;

    @PostMapping
    public ResponseEntity makeDocumentRequest(@RequestBody final DocumentRequestDTO documentRequest) {
        List<DocumentRequest> lookup = registryLookUp.lookup(documentRequest);
        return ResponseEntity.ok().build();
    }
}
