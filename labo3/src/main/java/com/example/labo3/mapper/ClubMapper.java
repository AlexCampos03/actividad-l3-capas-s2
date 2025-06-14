package com.example.labo3.mapper;


import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;
import com.example.labo3.entities.Club;
import org.springframework.stereotype.Component;

@Component
public class ClubMapper {
    public Club toEntity(ClubRequest request) {
        Club club = new Club();
        club.setName(request.getName());
        club.setCountry(request.getCountry());
        club.setCoach(request.getCoach());
        club.setTitles(request.getTitles());
        return club;
    }

    public ClubResponse toResponse(Club club) {
        ClubResponse response = new ClubResponse();
        response.setId(club.getId());
        response.setName(club.getName());
        response.setCountry(club.getCountry());
        response.setCoach(club.getCoach());
        response.setTitles(club.getTitles());
        return response;
    }
}
