package com.example.labo3.service;

import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;

public interface ClubService {
    ClubResponse createClub(ClubRequest request);
}

