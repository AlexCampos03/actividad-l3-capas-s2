package com.example.labo3.repository;

import com.example.labo3.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {
    List<Club> findByTitlesGreaterThanEqual(Integer titles);

}

