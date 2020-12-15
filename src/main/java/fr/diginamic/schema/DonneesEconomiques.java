//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 10:12:17 AM CET 
//


package fr.diginamic.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PIB"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *                 &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pib",
    "monnaie"
})
@XmlRootElement(name = "donneesEconomiques")
public class DonneesEconomiques {

    @XmlElement(name = "PIB", required = true)
    protected DonneesEconomiques.PIB pib;
    @XmlElement(required = true)
    protected String monnaie;

    /**
     * Gets the value of the pib property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesEconomiques.PIB }
     *     
     */
    public DonneesEconomiques.PIB getPIB() {
        return pib;
    }

    /**
     * Sets the value of the pib property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesEconomiques.PIB }
     *     
     */
    public void setPIB(DonneesEconomiques.PIB value) {
        this.pib = value;
    }

    /**
     * Gets the value of the monnaie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonnaie() {
        return monnaie;
    }

    /**
     * Sets the value of the monnaie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonnaie(String value) {
        this.monnaie = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *       &lt;attribute name="unite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PIB {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "unite")
        protected String unite;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the unite property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnite() {
            return unite;
        }

        /**
         * Sets the value of the unite property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnite(String value) {
            this.unite = value;
        }

    }

}