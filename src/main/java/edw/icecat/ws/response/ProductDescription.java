
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="WarrantyInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PDFURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="PDFSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ManualPDFURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="ManualPDFSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="langid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LongDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShortDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDescription")
public class ProductDescription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "WarrantyInfo")
    protected String warrantyInfo;
    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "PDFURL")
    @XmlSchemaType(name = "anyURI")
    protected String pdfurl;
    @XmlAttribute(name = "PDFSize")
    protected BigInteger pdfSize;
    @XmlAttribute(name = "ManualPDFURL")
    @XmlSchemaType(name = "anyURI")
    protected String manualPDFURL;
    @XmlAttribute(name = "ManualPDFSize")
    protected BigInteger manualPDFSize;
    @XmlAttribute(name = "langid")
    protected BigInteger langid;
    @XmlAttribute(name = "LongDesc")
    protected String longDesc;
    @XmlAttribute(name = "ShortDesc")
    protected String shortDesc;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the warrantyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyInfo() {
        return warrantyInfo;
    }

    /**
     * Sets the value of the warrantyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyInfo(String value) {
        this.warrantyInfo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the pdfurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFURL() {
        return pdfurl;
    }

    /**
     * Sets the value of the pdfurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFURL(String value) {
        this.pdfurl = value;
    }

    /**
     * Gets the value of the pdfSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPDFSize() {
        return pdfSize;
    }

    /**
     * Sets the value of the pdfSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPDFSize(BigInteger value) {
        this.pdfSize = value;
    }

    /**
     * Gets the value of the manualPDFURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualPDFURL() {
        return manualPDFURL;
    }

    /**
     * Sets the value of the manualPDFURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualPDFURL(String value) {
        this.manualPDFURL = value;
    }

    /**
     * Gets the value of the manualPDFSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManualPDFSize() {
        return manualPDFSize;
    }

    /**
     * Sets the value of the manualPDFSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManualPDFSize(BigInteger value) {
        this.manualPDFSize = value;
    }

    /**
     * Gets the value of the langid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLangid() {
        return langid;
    }

    /**
     * Sets the value of the langid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLangid(BigInteger value) {
        this.langid = value;
    }

    /**
     * Gets the value of the longDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Sets the value of the longDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDesc(String value) {
        this.longDesc = value;
    }

    /**
     * Gets the value of the shortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Sets the value of the shortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }

}
