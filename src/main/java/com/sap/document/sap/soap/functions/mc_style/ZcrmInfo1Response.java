
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
 *         &lt;element name="Einfo" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZcrmProdusTt"/>
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
    "einfo"
})
@XmlRootElement(name = "ZcrmInfo1Response")
public class ZcrmInfo1Response {

    @XmlElement(name = "Einfo", required = true)
    protected ZcrmProdusTt einfo;

    /**
     * Gets the value of the einfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZcrmProdusTt }
     *     
     */
    public ZcrmProdusTt getEinfo() {
        return einfo;
    }

    /**
     * Sets the value of the einfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZcrmProdusTt }
     *     
     */
    public void setEinfo(ZcrmProdusTt value) {
        this.einfo = value;
    }

}
