
package fr.diginamic.jsonschema.beans;

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
    "unite",
    "chiffres"
})
public class ChiffreAffaires {

    @JsonProperty("unite")
    private String unite;
    @JsonProperty("chiffres")
    private List<Chiffre> chiffres = new ArrayList<Chiffre>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unite")
    public String getUnite() {
        return unite;
    }

    @JsonProperty("unite")
    public void setUnite(String unite) {
        this.unite = unite;
    }

    @JsonProperty("chiffres")
    public List<Chiffre> getChiffres() {
        return chiffres;
    }

    @JsonProperty("chiffres")
    public void setChiffres(List<Chiffre> chiffres) {
        this.chiffres = chiffres;
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
        sb.append(ChiffreAffaires.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unite");
        sb.append('=');
        sb.append(((this.unite == null)?"<null>":this.unite));
        sb.append(',');
        sb.append("chiffres");
        sb.append('=');
        sb.append(((this.chiffres == null)?"<null>":this.chiffres));
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
        result = ((result* 31)+((this.chiffres == null)? 0 :this.chiffres.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.unite == null)? 0 :this.unite.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChiffreAffaires) == false) {
            return false;
        }
        ChiffreAffaires rhs = ((ChiffreAffaires) other);
        return ((((this.chiffres == rhs.chiffres)||((this.chiffres!= null)&&this.chiffres.equals(rhs.chiffres)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.unite == rhs.unite)||((this.unite!= null)&&this.unite.equals(rhs.unite))));
    }

}
