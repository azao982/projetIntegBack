package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ComService;
import com.example.demo.classes.Commentaire;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CommentController {

    private final ComService comService;

    @Autowired
    public CommentController(ComService comService) {
        this.comService = comService;
    }

    @PostMapping("/ajouterCom")
    public void ajouterCom(@RequestBody Commentaire commentaire) {
        comService.ajouterCom(commentaire);
    }

    @GetMapping("/ConsulterCom")
    public List<Commentaire> getCom() {
        return comService.getAllCom();
    }
}
