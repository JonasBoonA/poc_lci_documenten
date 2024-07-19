package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;

import java.util.function.Function;

import static com.example.demo.factory.DocumentRequestFactory.DocumentRequest;

public abstract class DocumentRequestFactory implements Function<DocumentRequestDTO, DocumentRequest> {

    public interface DocumentRequest { }
}
