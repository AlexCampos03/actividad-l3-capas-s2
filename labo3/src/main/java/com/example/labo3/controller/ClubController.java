package com.example.labo3.controller;

import com.example.labo3.dto.request.ClubRequest;
import com.example.labo3.dto.response.ClubResponse;
import com.example.labo3.service.ClubService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @PostMapping
    public ResponseEntity<ClubResponse> createClub(@RequestBody ClubRequest request) {
        ClubResponse response = clubService.createClub(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<ClubResponse>> getClubsByTitles(@RequestParam Integer titles) {
        return ResponseEntity.ok(clubService.getClubsByTitles(titles));
    }
}