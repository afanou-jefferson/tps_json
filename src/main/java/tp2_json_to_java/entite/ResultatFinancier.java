package tp2_json_to_java.entite;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultatFinancier {

	@JsonProperty("année")
	int anneeResulat;

	@JsonProperty("montant")
	double montantEnMilliards;

	public ResultatFinancier() {
		// TODO Auto-generated constructor stub
	}

	public int getAnneeResulat() {
		return anneeResulat;
	}

	public void setAnneeResulat(int anneeResulat) {
		this.anneeResulat = anneeResulat;
	}

	public double getMontantEnMilliards() {
		return montantEnMilliards;
	}

	public void setMontantEnMilliards(double montantEnMilliards) {
		this.montantEnMilliards = montantEnMilliards;
	}

	@Override
	public String toString() {
		return "ResultatFinancier [anneeResulat=" + anneeResulat + ", montantEnMilliards=" + montantEnMilliards + "]";
	}

}
