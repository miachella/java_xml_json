package fr.diginamic.jackson;

public class SiegeSocial {
	
	protected String localisation;
	protected String ville;
	protected String etat;
	protected String pays;
	
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getLocalisation() {
		return localisation;
	}
	public String getVille() {
		return ville;
	}
	public String getEtat() {
		return etat;
	}
	public String getPays() {
		return pays;
	}

}
