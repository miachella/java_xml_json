package fr.diginamic.xml;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerTest {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jc = JAXBContext.newInstance(ListePays2.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		
		ListePays2 racine = (ListePays2) unmarshaller.unmarshal(new File("src\\main\\resources\\TP01.xml"));
		
		System.out.println("Dans le fichier il y a " + racine.getPays().size() + " pays");
		
		String nomPays = racine.getPays().get(0).getNom();
		
		double fecondite = racine.getPays().get(0).getDonneesDemographiques().getFecondite().getValue();
		String uniteFec = racine.getPays().get(0).getDonneesDemographiques().getFecondite().getUnite();
		
		System.out.println("Parmi les habitants de " + nomPays + " la f�condit� est de " + fecondite + " " + uniteFec);
		
		String monnaie = racine.getPays().get(0).getDonneesEconomiques().getMonnaie();
		
		System.out.println("Parmi les habitants de " + nomPays + " la monnaie est " + monnaie);
		
		LocalDate dateReleve = racine.getPays().get(0).getDateDeReleve().getValue();
		
		System.out.println("Le derniere relev� du pays " + nomPays + " date de " + dateReleve);
		
	}

}
