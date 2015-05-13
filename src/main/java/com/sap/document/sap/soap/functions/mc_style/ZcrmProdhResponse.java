
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
 *         &lt;element name="Ierarhie" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZcrmProdhTt"/>
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
    "ierarhie"
})
@XmlRootElement(name = "ZcrmProdhResponse")
public class ZcrmProdhResponse {

    @XmlElement(name = "Ierarhie", required = true)
    protected ZcrmProdhTt ierarhie;

    /**
     * Gets the value of the ierarhie property.
     * 
     * @return
     *     possible object is
     *     {@link ZcrmProdhTt }
     *     
     */
    public ZcrmProdhTt getIerarhie() {
        return ierarhie;
    }

    /**
     * Sets the value of the ierarhie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZcrmProdhTt }
     *     
     */
    public void setIerarhie(ZcrmProdhTt value) {
        this.ierarhie = value;
    }

}
