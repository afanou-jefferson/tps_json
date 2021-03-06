package executables;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import tp2_json_to_java.entite.Fondateur;
import tp2_json_to_java.entite.ResultatFinancier;
import tp2_json_to_java.entite.Societe;

public class Main_TP2 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		/*
		 * ObjectMapper mapper = new ObjectMapper(); Societe[] societe =
		 * mapper.readValue(new
		 * File("/TPS_JSON_to_Java/src/main/resources/societes.json"), Societe[].class);
		 * // On a un tableau de societe dans le XML, on [] pour signaler qu'on veut
		 * créer // un tableau de Societe
		 */

		// Try Lists plutôt que Tableau
		ObjectMapper mapper = new ObjectMapper();

		// On créer notre type sur mesure avant de faire la lecture
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);

		List<Societe> listeSocietes = mapper.readValue(new File(
				"C:\\Users\\Exost\\Documents\\workspace-spring-tool-suite-4-4.6.2.RELEASE\\TPS_JSON_to_Java\\src\\main\\resources\\societes.json"),
				collType);

		for (Societe s : listeSocietes) {
			System.out.println(s.getNom());

			System.out.println(s.getSiegeSocial().toString());

			for (Fondateur f : s.getFondateurs()) {
				System.out.println(f.toString());
			}

			for (ResultatFinancier r : s.getChiffresAffaires()) {
				System.out.println(r.toString());
			}

			System.out.println("");
		}
	}

}
