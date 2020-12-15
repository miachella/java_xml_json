package fr.diginamic.jackson;

import java.util.List;

public class ChiffreAffaires {
	
	protected String unite;
	protected List<Chiffre> chiffres;
	
	public String getUnite() {
		return unite;
	}
	public List<Chiffre> getChiffres() {
		return chiffres;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public void setChiffres(List<Chiffre> chiffres) {
		this.chiffres = chiffres;
	}

}
