package com.example.labo3.service.impl;

import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;
import com.example.labo3.entities.Club;
import com.example.labo3.mapper.ClubMapper;
import com.example.labo3.repository.ClubRepository;
import com.example.labo3.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

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

    @Override
    public List<ClubResponse> getClubsByTitles(Integer titles) {
        return clubRepository.findByTitlesGreaterThanEqual(titles)
                .stream()
                .map(clubMapper::toResponse)
                .toList();
    }

    @Override
    public ClubResponse deleteClub(Long id) {
        Club club = clubRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Club no encontrado con id " + id
                ));
        clubRepository.delete(club);
        return clubMapper.toResponse(club);
    }

}