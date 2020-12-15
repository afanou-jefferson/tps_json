package tp2_json_to_java.entite;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SiegeSocial {

	@JsonProperty("adresse/ville")
	String adresseVille;

	@JsonProperty("état/région")
	String etatRegion;

	String pays;

	// Constructeur vide obligatoire pour les beans
	public SiegeSocial() {
	}

	public String getAdresseVille() {
		return adresseVille;
	}

	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	public String getEtatRegion() {
		return etatRegion;
	}

	public void setEtatRegion(String etatRegion) {
		this.etatRegion = etatRegion;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "SiegeSocial [adresseVille=" + adresseVille + ", etatRegion=" + etatRegion + ", pays=" + pays + "]";
	}

}
