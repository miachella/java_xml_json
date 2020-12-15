package fr.diginamic.jackson;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Fondateur {
	
	protected String nom;
	protected String prenom;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	protected LocalDate dateNaissance;
	protected String villeNaissance;
	protected String etatNaissance;
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public String getVilleNaissance() {
		return villeNaissance;
	}
	public String getEtatNaissance() {
		return etatNaissance;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public void setVilleNaissance(String villeNaissance) {
		this.villeNaissance = villeNaissance;
	}
	public void setEtatNaissance(String etatNaissance) {
		this.etatNaissance = etatNaissance;
	}

}
