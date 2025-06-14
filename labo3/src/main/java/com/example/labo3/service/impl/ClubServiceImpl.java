package com.example.labo3.service.impl;


import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;
import com.example.labo3.entities.Club;
import com.example.labo3.mapper.ClubMapper;
import com.example.labo3.repository.ClubRepository;
import com.example.labo3.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private ClubMapper clubMapper;

    @Override
    public ClubResponse createClub(ClubRequest request) {
        Club club = clubMapper.toEntity(request);
        Club saved = clubRepository.save(club);
        return clubMapper.toResponse(saved);
    }
}
