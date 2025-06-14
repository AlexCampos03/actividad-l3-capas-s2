package com.example.labo3.dto.response;

import lombok.Data;

@Data
public class ClubResponse {
    private Long id;
    private String name;
    private String country;
    private String coach;
    private int titles;
}
