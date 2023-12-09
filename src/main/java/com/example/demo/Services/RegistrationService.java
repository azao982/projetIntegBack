package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.RegistrationRepository;
import com.example.demo.classes.Visiteur;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public Visiteur getById(int id) {
        return registrationRepository.findById(id).orElse(null);
    }

    public boolean updateVisiteur(Visiteur visiteur, int id) {
        Optional<Visiteur> visiteurOptional = registrationRepository.findById(id);

        if (visiteurOptional.isPresent()) {
            Visiteur visiteurToUpdate = visiteurOptional.get();

            // Mettre à jour les champs du visiteur avec les nouvelles valeurs
            visiteurToUpdate.setEmailId(visiteur.getEmailId());
            visiteurToUpdate.setUserName(visiteur.getUserName());
            visiteurToUpdate.setPassword(visiteur.getPassword());
            visiteurToUpdate.setRole(visiteur.getRole());

            // Enregistrer les modifications dans la base de données
            registrationRepository.save(visiteurToUpdate);
            return true;
        } else {
            return false;
        }
    }


    public Visiteur register(Visiteur visiteur) {
        return registrationRepository.save(visiteur);
    }

    public Visiteur fetchByEmail(String email) {
        return registrationRepository.findByEmailId(email);
    }

    public Visiteur fetchByEmailAndPassword(String tempEmail, String tempPass) {
        return registrationRepository.findByEmailIdAndPassword(tempEmail, tempPass);
    }

    public List<Visiteur> getAllVisiteurs() {
        return registrationRepository.findAll();
    }

    public void deleteVisiteur(int id) {
        registrationRepository.deleteById(id);
    }
}
