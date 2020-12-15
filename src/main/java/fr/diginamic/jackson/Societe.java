package fr.diginamic.jackson;

import java.util.List;

public class Societe {
	
	protected String nom;
	protected SiegeSocial siegeSocial;
	protected List<Fondateur> fondateurs;
	protected ChiffreAffaires chiffreAffaires;
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	public void setFondateurs(List<Fondateur> fondateurs) {
		this.fondateurs = fondateurs;
	}
	public void setChiffreAffaires(ChiffreAffaires chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}
	public String getNom() {
		return nom;
	}
	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}
	public List<Fondateur> getFondateurs() {
		return fondateurs;
	}
	public ChiffreAffaires getChiffreAffaires() {
		return chiffreAffaires;
	}

}
