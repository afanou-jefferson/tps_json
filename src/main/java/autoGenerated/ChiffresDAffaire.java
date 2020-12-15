
package autoGenerated;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ann\u00e9e",
    "montant"
})
public class ChiffresDAffaire {

    @JsonProperty("ann\u00e9e")
    private Integer annE;
    @JsonProperty("montant")
    private Double montant;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ann\u00e9e")
    public Integer getAnnE() {
        return annE;
    }

    @JsonProperty("ann\u00e9e")
    public void setAnnE(Integer annE) {
        this.annE = annE;
    }

    @JsonProperty("montant")
    public Double getMontant() {
        return montant;
    }

    @JsonProperty("montant")
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChiffresDAffaire.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annE");
        sb.append('=');
        sb.append(((this.annE == null)?"<null>":this.annE));
        sb.append(',');
        sb.append("montant");
        sb.append('=');
        sb.append(((this.montant == null)?"<null>":this.montant));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.annE == null)? 0 :this.annE.hashCode()));
        result = ((result* 31)+((this.montant == null)? 0 :this.montant.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChiffresDAffaire) == false) {
            return false;
        }
        ChiffresDAffaire rhs = ((ChiffresDAffaire) other);
        return ((((this.annE == rhs.annE)||((this.annE!= null)&&this.annE.equals(rhs.annE)))&&((this.montant == rhs.montant)||((this.montant!= null)&&this.montant.equals(rhs.montant))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}