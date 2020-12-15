package fr.diginamic.jackson;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class JacksonMapperTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> l = mapper.readValue(new File("src\\main\\resources\\TP06-JSON.json"), collType);
		
		System.out.println("Il y a " + l.size() + " sociétés dans le document entré");
		System.out.println("\n");
		
		for(int i=0; i<l.size(); i++) {
			String nomSociete = l.get(i).getNom();
			
			String adresseSociete = l.get(i).getSiegeSocial().getVille();
			
			System.out.println("La ville où est situé le siège social de l'entreprise " + nomSociete + " est " + adresseSociete);
			
			for(int j=0; j<l.get(i).getFondateurs().size(); j++) {
				String prenomFonda = l.get(i).getFondateurs().get(j).getPrenom(); 
				String nomFonda = l.get(i).getFondateurs().get(j).getNom();
				LocalDate dateNaissance = l.get(i).getFondateurs().get(j).getDateNaissance();
				String lieuNaissance = l.get(i).getFondateurs().get(j).getVilleNaissance();
				
				System.out.println("Le fondateur de la société " + nomSociete + " s'appelle " + prenomFonda + " " + nomFonda + 
						" et est né le " + dateNaissance + " à " + lieuNaissance);
			}
			
			System.out.println("\n");
			
			for(int k=0; k<l.get(i).getChiffreAffaires().getChiffres().size(); k++) {
				int annee = l.get(i).getChiffreAffaires().getChiffres().get(k).getAnnee();
				double CA = l.get(i).getChiffreAffaires().getChiffres().get(k).getMontant();
				String unite = l.get(i).getChiffreAffaires().getUnite();

				System.out.println("Le CA de l'année " + annee + " s'élève à " + CA + " " + unite);
			}
			
			System.out.println("\n");
			System.out.println("------------------------------------");
			System.out.println("\n");
		}
		
		
		
		

	}

}
