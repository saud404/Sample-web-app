package com.ironyeard.repositories;

import com.ironyeard.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findByGener(String gener);
    List<Game> findByReleaseYear(int year);
    List<Game> findByGenerAndReleaseYear(String gener,  int year);
    Game findFirstByGener(String gener);
   // int ciuntByGener(String gener);
    List<Game> findByGenerOrderByNameAsc(String gener);
    @Query("SELECT g FROM Game g WHERE g.name LIKE ?1%")
    List<Game> findbyNameStartWith(String name);
}
