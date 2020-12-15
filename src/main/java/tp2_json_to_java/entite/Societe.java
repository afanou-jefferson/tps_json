package tp2_json_to_java.entite;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Societe {

	String nom;

	@JsonProperty("siege-social")
	SiegeSocial siegeSocial;

	@JsonProperty("fondateurs")
	Fondateur[] fondateurs;

	@JsonProperty("chiffres d'affaires")
	ResultatFinancier[] chiffresAffaires;

	public Societe() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}

	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}

	public Fondateur[] getFondateurs() {
		return fondateurs;
	}

	public void setFondateurs(Fondateur[] fondateurs) {
		this.fondateurs = fondateurs;
	}

	public ResultatFinancier[] getChiffresAffaires() {
		return chiffresAffaires;
	}

	public void setChiffresAffaires(ResultatFinancier[] chiffresAffaires) {
		this.chiffresAffaires = chiffresAffaires;
	}

	@Override
	public String toString() {
		return "Societe [nom=" + nom + ", siegeSocial=" + siegeSocial + ", fondateurs=" + Arrays.toString(fondateurs)
				+ ", chiffresAffaires=" + Arrays.toString(chiffresAffaires) + "]";
	}

}
