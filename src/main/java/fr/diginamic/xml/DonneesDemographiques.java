package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="donneesDemographiques")
public class DonneesDemographiques {
	
	@XmlElement
	protected Population population; 
	@XmlElement
	protected Fecondite fecondite;
	
	public Population getPopulation() {
		return population;
	}
	public Fecondite getFecondite() {
		return fecondite;
	}

}
