package com.matheus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
