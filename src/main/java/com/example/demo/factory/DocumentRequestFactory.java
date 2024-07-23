package com.example.demo.factory;

import com.example.demo.DTO.DocumentRequestDTO;

/**
 * This is the place where the data will be searched.
 * Afterwards some Payload will be made with that data.
 */
public abstract  class DocumentRequestFactory<OUTPUT extends DocumentRequest> {

    /**
     * Relevant data should be searched and mapped in this method
     * @param dto incoming request
     * @return A payload filled with relevant data
     */
    abstract OUTPUT mapFromDTO(DocumentRequestDTO dto);

    public OUTPUT create(DocumentRequestDTO dto) {
        return mapFromDTO(dto);
    }

}
