package com.example.labo3.dto.request;

import lombok.Data;

@Data
public class ClubRequest {
    private String name;
    private String country;
    private String coach;
    private int titles;
}
