package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="pays")
public class Pays {
	
	@XmlElement
	protected String nom; 
	@XmlElement
	protected DateDeReleve dateDeReleve;
	@XmlElement
	protected DonneesDemographiques donneesDemographiques;
	
	public String getNom() {
		return nom;
	}
	public DateDeReleve getDateDeReleve() {
		return dateDeReleve;
	}
	public DonneesDemographiques getDonneesDemographiques() {
		return donneesDemographiques;
	}
	public DonneesEconomiques getDonneesEconomiques() {
		return donneesEconomiques;
	}
	@XmlElement
	protected DonneesEconomiques donneesEconomiques;
	
}
