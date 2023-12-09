package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.classes.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {

}
