package com.example.jsonplaceholder.dto;

public record UserResponseDTO(
        Long id,
        String name,
        String username,
        String email,
        AddressDTO address,
        String phone,
        String website,
        CompanyDTO company) {
}
