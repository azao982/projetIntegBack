/*package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.AdminService;
import com.example.demo.classes.Admin;

@RestController
public class AdminController {

    // Assurez-vous que AdminService est correctement injecté
    @Autowired
    private AdminService adminService;

    @PostMapping(path = "/register/admin")
    public Admin registerAdmin(@RequestBody Admin admin) throws Exception {
        // Ajoutez ici la logique spécifique pour l'inscription d'un administrateur

        String tempEmailId = admin.getEmailId();
        if (tempEmailId != null && !"".equals(tempEmailId)) {
            Admin adminObj = adminService.fetchByEmail(tempEmailId);
            if (adminObj != null) {
                throw new Exception("This admin with email " + tempEmailId + " already exists");
            }
        }
        // Vous pouvez définir un rôle spécifique pour l'administrateur, par exemple "admin"
        admin.setRole("admin");

        // Exécutez le service d'inscription avec l'admin mis à jour
        Admin adminObj = adminService.register(admin);

        // Retournez l'admin enregistré
        return adminObj;
    }
}*/
