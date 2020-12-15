package executables;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import tp2_json_to_java.entite.Societe;

public class Main_TP4 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		// Try Lists plutôt que Tableau
		ObjectMapper mapper = new ObjectMapper();

		// On créer notre type sur mesure avant de faire la lecture
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);

		// On transforme ce qui est lu en objet Java
		List<Societe> listeSocietes = mapper.readValue(new File(
				"C:\\Users\\Exost\\Documents\\workspace-spring-tool-suite-4-4.6.2.RELEASE\\TPS_JSON_to_Java\\src\\main\\resources\\societes.json"),
				collType);

		// Je réécris en Json mon objet java en fichier Json
		mapper.writeValue(new File(
				"C:\\Users\\Exost\\Documents\\workspace-spring-tool-suite-4-4.6.2.RELEASE\\tp_json\\src\\main\\resources\\TP4_Java_to_JSON_test.json"),
				listeSocietes);

	}

}
