package com.example.demo.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.CoursService;
import com.example.demo.classes.Cours;
@RestController
@RequestMapping("/api/cours")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CoursController {

 CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }
    @PostMapping("/ajouterCours")
    public void ajouterCours(@RequestBody Cours cours) {
    	coursService.ajouterCours(cours);
    	
    }
    @GetMapping("/ConsulterCours")
    public List<Cours> getCours() {
        return coursService.getAllCours();
    }
    @GetMapping("/SearchCours")
    public List<Cours> searchCours(@RequestParam String keyword) {
        return coursService.searchCours(keyword);
  }
    @DeleteMapping("/supprimerCours/{coursId}")
    public ResponseEntity<Map<String, String>> supprimerCours(@PathVariable Long coursId) {
        Map<String, String> response = new HashMap<>();
        try {
            coursService.supprimerCours(coursId);
            response.put("message", "Course deleted successfully");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("message", "Failed to delete course");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cours> getById(@PathVariable Long id) {

        Cours entity = coursService.getById(id);

        if (entity != null) {

            return new ResponseEntity<>(entity, HttpStatus.OK);
        } else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/ModifierCours/{id}")
    public void updateCours (@RequestBody Cours cours, @PathVariable long id){
    	coursService.updateCours(cours,id);
    }
    
}