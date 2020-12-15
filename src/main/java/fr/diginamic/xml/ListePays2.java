package fr.diginamic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="listePays")
public class ListePays {
	
	@XmlElement
	protected List<Pays> pays;
	
	public List<Pays> getPays() {
		return pays;
	}
	
	

}
