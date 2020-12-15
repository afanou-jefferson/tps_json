
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
    "adresse/ville",
    "\u00e9tat/r\u00e9gion",
    "pays"
})
public class LieuDeNaissance {

    @JsonProperty("adresse/ville")
    private String adresseVille;
    @JsonProperty("\u00e9tat/r\u00e9gion")
    private String tatRGion;
    @JsonProperty("pays")
    private String pays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adresse/ville")
    public String getAdresseVille() {
        return adresseVille;
    }

    @JsonProperty("adresse/ville")
    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }

    @JsonProperty("\u00e9tat/r\u00e9gion")
    public String getTatRGion() {
        return tatRGion;
    }

    @JsonProperty("\u00e9tat/r\u00e9gion")
    public void setTatRGion(String tatRGion) {
        this.tatRGion = tatRGion;
    }

    @JsonProperty("pays")
    public String getPays() {
        return pays;
    }

    @JsonProperty("pays")
    public void setPays(String pays) {
        this.pays = pays;
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
        sb.append(LieuDeNaissance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adresseVille");
        sb.append('=');
        sb.append(((this.adresseVille == null)?"<null>":this.adresseVille));
        sb.append(',');
        sb.append("tatRGion");
        sb.append('=');
        sb.append(((this.tatRGion == null)?"<null>":this.tatRGion));
        sb.append(',');
        sb.append("pays");
        sb.append('=');
        sb.append(((this.pays == null)?"<null>":this.pays));
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
        result = ((result* 31)+((this.tatRGion == null)? 0 :this.tatRGion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.adresseVille == null)? 0 :this.adresseVille.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LieuDeNaissance) == false) {
            return false;
        }
        LieuDeNaissance rhs = ((LieuDeNaissance) other);
        return (((((this.tatRGion == rhs.tatRGion)||((this.tatRGion!= null)&&this.tatRGion.equals(rhs.tatRGion)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.adresseVille == rhs.adresseVille)||((this.adresseVille!= null)&&this.adresseVille.equals(rhs.adresseVille))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))));
    }

}
