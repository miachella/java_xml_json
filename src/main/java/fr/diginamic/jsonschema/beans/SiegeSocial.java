
package fr.diginamic.jsonschema.beans;

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
    "localisation",
    "ville",
    "etat",
    "pays"
})
public class SiegeSocial {

    @JsonProperty("localisation")
    private String localisation;
    @JsonProperty("ville")
    private String ville;
    @JsonProperty("etat")
    private String etat;
    @JsonProperty("pays")
    private String pays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("localisation")
    public String getLocalisation() {
        return localisation;
    }

    @JsonProperty("localisation")
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @JsonProperty("ville")
    public String getVille() {
        return ville;
    }

    @JsonProperty("ville")
    public void setVille(String ville) {
        this.ville = ville;
    }

    @JsonProperty("etat")
    public String getEtat() {
        return etat;
    }

    @JsonProperty("etat")
    public void setEtat(String etat) {
        this.etat = etat;
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
        sb.append(SiegeSocial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localisation");
        sb.append('=');
        sb.append(((this.localisation == null)?"<null>":this.localisation));
        sb.append(',');
        sb.append("ville");
        sb.append('=');
        sb.append(((this.ville == null)?"<null>":this.ville));
        sb.append(',');
        sb.append("etat");
        sb.append('=');
        sb.append(((this.etat == null)?"<null>":this.etat));
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
        result = ((result* 31)+((this.ville == null)? 0 :this.ville.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.etat == null)? 0 :this.etat.hashCode()));
        result = ((result* 31)+((this.localisation == null)? 0 :this.localisation.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiegeSocial) == false) {
            return false;
        }
        SiegeSocial rhs = ((SiegeSocial) other);
        return ((((((this.ville == rhs.ville)||((this.ville!= null)&&this.ville.equals(rhs.ville)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.etat == rhs.etat)||((this.etat!= null)&&this.etat.equals(rhs.etat))))&&((this.localisation == rhs.localisation)||((this.localisation!= null)&&this.localisation.equals(rhs.localisation))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))));
    }

}
