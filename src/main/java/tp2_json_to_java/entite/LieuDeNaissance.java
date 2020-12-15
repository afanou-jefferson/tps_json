package tp2_json_to_java.entite;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LieuDeNaissance {

	@JsonProperty("adresse/ville")
	String adresseVille;

	@JsonProperty("état/région")
	String etatRegion;

	String pays;

	public LieuDeNaissance() {
		// TODO Auto-generated constructor stub
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
		return "LieuDeNaissance [adresseVille=" + adresseVille + ", etatRegion=" + etatRegion + ", pays=" + pays + "]";
	}

}
