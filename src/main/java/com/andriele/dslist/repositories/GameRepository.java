package com.andriele.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andriele.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
