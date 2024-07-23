package com.example.demo.registry;

import com.example.demo.enums.DocumentTypes;
import com.example.demo.factory.AansluitingsFormulierCreator;
import com.example.demo.factory.DocumentRequestFactory;
import com.example.demo.factory.VolmachtCreator;

import java.util.Map;

import static com.example.demo.enums.DocumentTypes.AANSLUITING;
import static com.example.demo.enums.DocumentTypes.VOLMACHT;

public class Registry {

    public static final Map<DocumentTypes, DocumentRequestFactory> register = Map.ofEntries(
            Map.entry(AANSLUITING, new AansluitingsFormulierCreator()),
            Map.entry(VOLMACHT, new VolmachtCreator())
    );

}
