package fr.diginamic.xml;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="dateDeReleve")
public class DateDeReleve {
	
	@XmlAttribute
	protected String format; 
	@XmlValue
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected LocalDate value;
	
	public String getFormat() {
		return format;
	}
	public LocalDate getValue() {
		return value;
	}

}
