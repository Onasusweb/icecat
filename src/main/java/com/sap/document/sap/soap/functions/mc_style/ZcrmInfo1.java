
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Imatnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Ivkorg" type="{urn:sap-com:document:sap:rfc:functions}char4" minOccurs="0"/>
 *         &lt;element name="Ivtweg" type="{urn:sap-com:document:sap:rfc:functions}char2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imatnr",
    "ivkorg",
    "ivtweg"
})
@XmlRootElement(name = "ZcrmInfo1")
public class ZcrmInfo1 {

    @XmlElement(name = "Imatnr", required = true)
    protected String imatnr;
    @XmlElement(name = "Ivkorg")
    protected String ivkorg;
    @XmlElement(name = "Ivtweg")
    protected String ivtweg;

    /**
     * Gets the value of the imatnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImatnr() {
        return imatnr;
    }

    /**
     * Sets the value of the imatnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImatnr(String value) {
        this.imatnr = value;
    }

    /**
     * Gets the value of the ivkorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvkorg() {
        return ivkorg;
    }

    /**
     * Sets the value of the ivkorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvkorg(String value) {
        this.ivkorg = value;
    }

    /**
     * Gets the value of the ivtweg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvtweg() {
        return ivtweg;
    }

    /**
     * Sets the value of the ivtweg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvtweg(String value) {
        this.ivtweg = value;
    }

}
