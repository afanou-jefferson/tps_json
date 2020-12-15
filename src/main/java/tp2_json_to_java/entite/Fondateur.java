package tp2_json_to_java.entite;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Fondateur {

	String nom;

	@JsonProperty("prénom")
	String prenom;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonProperty("date de naissance")
	LocalDate dateDeNaissance;

	@JsonProperty("lieu de naissance")
	LieuDeNaissance lieuDeNaissance;

	public Fondateur() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public LieuDeNaissance getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	public void setLieuDeNaissance(LieuDeNaissance lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}

	@Override
	public String toString() {
		return "Fondateur [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", lieuDeNaissance=" + lieuDeNaissance + "]";
	}

}
