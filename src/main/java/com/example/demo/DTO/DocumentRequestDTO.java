package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentRequestDTO implements Serializable, IncomingDocumentRequestDTO {

    private String name;
    private String surrname;
    private List<String> documentTypes;

}
