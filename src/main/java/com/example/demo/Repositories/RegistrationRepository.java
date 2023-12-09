package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.Visiteur;

public interface RegistrationRepository extends JpaRepository<Visiteur,Integer> {
	public Visiteur findByEmailId(String email);
	public Visiteur findByEmailIdAndPassword (String tempEmail,String tempPassword);

}
