package com.example.jsonplaceholder.dto;

public record AddressDTO(
        String street,
        String suite,
        GeoDTO geo) {
}