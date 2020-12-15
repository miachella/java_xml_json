package fr.diginamic.jsonschema.beans;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonMapperTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
	ObjectMapper monmapper = new ObjectMapper();
	Tp06Json s = new Tp06Json("MaSociété");
	List<Fondateur> fondateurs = new ArrayList<>();
	fondateurs.add(new Fondateur("IACHELLA", "Mathilde"));
	s.setFondateurs(fondateurs);
	
	monmapper.writeValue(new File("src\\main\\resources\\schemajson\\TP09.json"), s);
	
	}
	
}
