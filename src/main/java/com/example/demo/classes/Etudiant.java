package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant extends Visiteur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
}
