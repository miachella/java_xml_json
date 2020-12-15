
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
    "nom",
    "prenom",
    "dateNaissance",
    "villeNaissance",
    "etatNaissance"
})
public class Fondateur {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("prenom")
    private String prenom;
    @JsonProperty("dateNaissance")
    private String dateNaissance;
    @JsonProperty("villeNaissance")
    private String villeNaissance;
    @JsonProperty("etatNaissance")
    private String etatNaissance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Fondateur() {
		super();
	}
    
    public Fondateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Fondateur(String nom, String prenom, String dateNaissance, String villeNaissance, String etatNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.villeNaissance = villeNaissance;
		this.etatNaissance = etatNaissance;
	}

	@JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonProperty("prenom")
    public String getPrenom() {
        return prenom;
    }

    @JsonProperty("prenom")
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @JsonProperty("dateNaissance")
    public String getDateNaissance() {
        return dateNaissance;
    }

    @JsonProperty("dateNaissance")
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @JsonProperty("villeNaissance")
    public String getVilleNaissance() {
        return villeNaissance;
    }

    @JsonProperty("villeNaissance")
    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    @JsonProperty("etatNaissance")
    public String getEtatNaissance() {
        return etatNaissance;
    }

    @JsonProperty("etatNaissance")
    public void setEtatNaissance(String etatNaissance) {
        this.etatNaissance = etatNaissance;
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
        sb.append(Fondateur.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("prenom");
        sb.append('=');
        sb.append(((this.prenom == null)?"<null>":this.prenom));
        sb.append(',');
        sb.append("dateNaissance");
        sb.append('=');
        sb.append(((this.dateNaissance == null)?"<null>":this.dateNaissance));
        sb.append(',');
        sb.append("villeNaissance");
        sb.append('=');
        sb.append(((this.villeNaissance == null)?"<null>":this.villeNaissance));
        sb.append(',');
        sb.append("etatNaissance");
        sb.append('=');
        sb.append(((this.etatNaissance == null)?"<null>":this.etatNaissance));
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
        result = ((result* 31)+((this.dateNaissance == null)? 0 :this.dateNaissance.hashCode()));
        result = ((result* 31)+((this.villeNaissance == null)? 0 :this.villeNaissance.hashCode()));
        result = ((result* 31)+((this.etatNaissance == null)? 0 :this.etatNaissance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        result = ((result* 31)+((this.prenom == null)? 0 :this.prenom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fondateur) == false) {
            return false;
        }
        Fondateur rhs = ((Fondateur) other);
        return (((((((this.dateNaissance == rhs.dateNaissance)||((this.dateNaissance!= null)&&this.dateNaissance.equals(rhs.dateNaissance)))&&((this.villeNaissance == rhs.villeNaissance)||((this.villeNaissance!= null)&&this.villeNaissance.equals(rhs.villeNaissance))))&&((this.etatNaissance == rhs.etatNaissance)||((this.etatNaissance!= null)&&this.etatNaissance.equals(rhs.etatNaissance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))))&&((this.prenom == rhs.prenom)||((this.prenom!= null)&&this.prenom.equals(rhs.prenom))));
    }

}
