package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="dateDeReleve")
public class DateDeReleve {
	
	@XmlElement
	protected String format; 
	@XmlElement
	protected String value;
	
	public String getFormat() {
		return format;
	}
	public String getValue() {
		return value;
	}

}
