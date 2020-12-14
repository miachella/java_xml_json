package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="donneesEconomiques")
public class DonneesEconomiques {
	
	@XmlElement(name="PIB")
	protected PIB pib; 
	@XmlElement
	protected String monnaie;
	
	public PIB getPib() {
		return pib;
	}
	public String getMonnaie() {
		return monnaie;
	}

}
