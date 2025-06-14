package com.example.labo3.service;

import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;

import java.util.List;

public interface ClubService {
    ClubResponse createClub(ClubRequest request);
    List<ClubResponse> getClubsByTitles(Integer titles);
}