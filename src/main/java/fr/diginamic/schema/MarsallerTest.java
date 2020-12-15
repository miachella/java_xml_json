package fr.diginamic.schema;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import fr.diginamic.schema.ListePays.Pays;

public class MarsallerTest {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jc = JAXBContext.newInstance(ListePays.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		ListePays listePays = new ListePays();
		
		Pays pays = new Pays("Boulangerie");
		listePays.getPays().add(pays);
		
		File os = new File("src\\main\\resources\\TestMarsh.xml");
		marshaller.marshal(listePays, os);
		
	}

}
