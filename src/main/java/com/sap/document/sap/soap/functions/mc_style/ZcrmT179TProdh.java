
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZcrmT179tProdh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZcrmT179tProdh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Spras" type="{urn:sap-com:document:sap:rfc:functions}lang"/>
 *         &lt;element name="Prodh" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Vtext" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZcrmT179tProdh", propOrder = {
    "spras",
    "prodh",
    "vtext"
})
public class ZcrmT179TProdh {

    @XmlElement(name = "Spras", required = true)
    protected String spras;
    @XmlElement(name = "Prodh", required = true)
    protected String prodh;
    @XmlElement(name = "Vtext", required = true)
    protected String vtext;

    /**
     * Gets the value of the spras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpras() {
        return spras;
    }

    /**
     * Sets the value of the spras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpras(String value) {
        this.spras = value;
    }

    /**
     * Gets the value of the prodh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdh() {
        return prodh;
    }

    /**
     * Sets the value of the prodh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdh(String value) {
        this.prodh = value;
    }

    /**
     * Gets the value of the vtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtext() {
        return vtext;
    }

    /**
     * Sets the value of the vtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtext(String value) {
        this.vtext = value;
    }

}
