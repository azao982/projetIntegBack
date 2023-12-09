package com.example.demo.classes;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cours implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant enseignant;

    private String nomDuCours;
    
    private String description;
    private String coursFormatPdf;
    private String coursFormatVideo;
    private String nomProfesseur;
	public String getNomDuCours() {
		return nomDuCours;
	}
	public void setNomDuCours(String nomDuCours) {
		this.nomDuCours = nomDuCours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCoursFormatPdf() {
		return coursFormatPdf;
	}
	public void setCoursFormatPdf(String coursFormatPdf) {
		this.coursFormatPdf = coursFormatPdf;
	}
	public String getCoursFormatVideo() {
		return coursFormatVideo;
	}
	public void setCoursFormatVideo(String coursFormatVideo) {
		this.coursFormatVideo = coursFormatVideo;
	}
	public String getNomProfesseur() {
		return nomProfesseur;
	}
	public void setNomProfesseur(String nomProfesseur) {
		this.nomProfesseur = nomProfesseur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
