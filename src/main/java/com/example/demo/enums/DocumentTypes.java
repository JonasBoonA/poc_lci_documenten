package com.example.demo.enums;

import java.util.Arrays;

public enum DocumentTypes {

    AANSLUITING("aansluiting"),
    VOLMACHT("volmacht");

    private String incomingType;

    DocumentTypes(String incomingType) {
        this.incomingType = incomingType;
    }

    public String getIncomingType() {
        return incomingType;
    }

    public static DocumentTypes getTypeFromInput(String input) {
        return Arrays.stream(DocumentTypes.values())
                .filter(t -> t.getIncomingType().equals(input))
                .findFirst().orElseThrow(() -> new NullPointerException("No such type available"));
    }
}
