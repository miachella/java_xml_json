package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="fecondite")
public class Fecondite {
	
	@XmlAttribute
	protected String unite; 
	@XmlValue
	protected double value;
	
	public String getUnite() {
		return unite;
	}
	public double getValue() {
		return value;
	}

}
