package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.ComRepository;
import com.example.demo.classes.Commentaire;

@Service
public class ComService {

    private final ComRepository comRepository;

    @Autowired
    public ComService(ComRepository comRepository) {
        this.comRepository = comRepository;
    }

    public Commentaire ajouterCom(Commentaire commentaire) {
        return comRepository.save(commentaire);
    }

    public List<Commentaire> getAllCom() {
        return comRepository.findAll();
    }
}
