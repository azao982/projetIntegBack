/*package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.AdminRepository;
import com.example.demo.classes.Admin;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin register(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin fetchByEmail(String email) {
        return adminRepository.findByEmailId(email);
    }

    public Admin fetchByEmailAndPassword(String tempEmail, String tempPass) {
        return adminRepository.findByEmailIdAndPassword(tempEmail, tempPass);
    }
}*/
