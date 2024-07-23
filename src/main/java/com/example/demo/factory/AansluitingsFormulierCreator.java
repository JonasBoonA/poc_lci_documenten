package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;
import com.example.demo.factory.products.AansluitingGeneratedFromXSD;
import com.example.demo.factory.products.Geadresseerde;


public class AansluitingsFormulierCreator extends DocumentRequestFactory<AansluitingGeneratedFromXSD> {

    @Override
    AansluitingGeneratedFromXSD mapFromDTO(DocumentRequestDTO dto) {
        AansluitingGeneratedFromXSD aansluitingGeneratedFromXSD = new AansluitingGeneratedFromXSD();
        aansluitingGeneratedFromXSD.setGeadresseerde(createAdress());
        return aansluitingGeneratedFromXSD;
    }

    private Geadresseerde createAdress() {
        Geadresseerde geadresseerde = new Geadresseerde();
        geadresseerde.setStraat("Sesamstraat");
        return geadresseerde;
    }
}
