package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.classes.Commentaire;

@Repository
public interface ComRepository extends JpaRepository<Commentaire, Long> {

}
