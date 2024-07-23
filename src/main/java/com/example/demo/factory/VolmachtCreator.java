package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.factory.products.VolmachtGeneratedFromXSD;

public class VolmachtCreator extends DocumentRequestFactory<VolmachtGeneratedFromXSD> {

    @Override
    VolmachtGeneratedFromXSD mapFromDTO(DocumentRequestDTO dto) {
        return new VolmachtGeneratedFromXSD();
    }

}
