package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="population")
public class Population {
	
	@XmlElement
	protected String unite; 
	@XmlElement
	protected double value;
	
	public String getUnite() {
		return unite;
	}
	public double getValue() {
		return value;
	}

}
