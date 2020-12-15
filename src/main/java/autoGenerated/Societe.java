
package autoGenerated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nom",
    "siege-social",
    "fondateurs",
    "chiffres d'affaires"
})
public class Societe {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("siege-social")
    private SiegeSocial siegeSocial;
    @JsonProperty("fondateurs")
    private List<Fondateur> fondateurs = new ArrayList<Fondateur>();
    @JsonProperty("chiffres d'affaires")
    private List<ChiffresDAffaire> chiffresDAffaires = new ArrayList<ChiffresDAffaire>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonProperty("siege-social")
    public SiegeSocial getSiegeSocial() {
        return siegeSocial;
    }

    @JsonProperty("siege-social")
    public void setSiegeSocial(SiegeSocial siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    @JsonProperty("fondateurs")
    public List<Fondateur> getFondateurs() {
        return fondateurs;
    }

    @JsonProperty("fondateurs")
    public void setFondateurs(List<Fondateur> fondateurs) {
        this.fondateurs = fondateurs;
    }

    @JsonProperty("chiffres d'affaires")
    public List<ChiffresDAffaire> getChiffresDAffaires() {
        return chiffresDAffaires;
    }

    @JsonProperty("chiffres d'affaires")
    public void setChiffresDAffaires(List<ChiffresDAffaire> chiffresDAffaires) {
        this.chiffresDAffaires = chiffresDAffaires;
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
        sb.append(Societe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("siegeSocial");
        sb.append('=');
        sb.append(((this.siegeSocial == null)?"<null>":this.siegeSocial));
        sb.append(',');
        sb.append("fondateurs");
        sb.append('=');
        sb.append(((this.fondateurs == null)?"<null>":this.fondateurs));
        sb.append(',');
        sb.append("chiffresDAffaires");
        sb.append('=');
        sb.append(((this.chiffresDAffaires == null)?"<null>":this.chiffresDAffaires));
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
        result = ((result* 31)+((this.fondateurs == null)? 0 :this.fondateurs.hashCode()));
        result = ((result* 31)+((this.chiffresDAffaires == null)? 0 :this.chiffresDAffaires.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.siegeSocial == null)? 0 :this.siegeSocial.hashCode()));
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Societe) == false) {
            return false;
        }
        Societe rhs = ((Societe) other);
        return ((((((this.fondateurs == rhs.fondateurs)||((this.fondateurs!= null)&&this.fondateurs.equals(rhs.fondateurs)))&&((this.chiffresDAffaires == rhs.chiffresDAffaires)||((this.chiffresDAffaires!= null)&&this.chiffresDAffaires.equals(rhs.chiffresDAffaires))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.siegeSocial == rhs.siegeSocial)||((this.siegeSocial!= null)&&this.siegeSocial.equals(rhs.siegeSocial))))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))));
    }

}
