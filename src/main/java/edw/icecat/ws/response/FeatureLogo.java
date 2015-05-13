
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureLogo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureLogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Descriptions" type="{}Descriptions" minOccurs="0"/>
 *         &lt;element name="FeatureLogoValues" type="{}FeatureValuesList" minOccurs="0"/>
 *         &lt;element name="FeatureLogoCategories" type="{}FeatureLogoCategoriesList" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Feature_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LogoPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureLogo", propOrder = {

})
public class FeatureLogo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "FeatureLogoValues")
    protected FeatureValuesList featureLogoValues;
    @XmlElement(name = "FeatureLogoCategories")
    protected FeatureLogoCategoriesList featureLogoCategories;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Feature_ID", required = true)
    protected BigInteger featureID;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "LogoPic")
    @XmlSchemaType(name = "anyURI")
    protected String logoPic;
    @XmlAttribute(name = "Link")
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlAttribute(name = "Width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "Height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "Size", required = true)
    protected BigInteger size;

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the featureLogoValues property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureValuesList }
     *     
     */
    public FeatureValuesList getFeatureLogoValues() {
        return featureLogoValues;
    }

    /**
     * Sets the value of the featureLogoValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureValuesList }
     *     
     */
    public void setFeatureLogoValues(FeatureValuesList value) {
        this.featureLogoValues = value;
    }

    /**
     * Gets the value of the featureLogoCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureLogoCategoriesList }
     *     
     */
    public FeatureLogoCategoriesList getFeatureLogoCategories() {
        return featureLogoCategories;
    }

    /**
     * Sets the value of the featureLogoCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureLogoCategoriesList }
     *     
     */
    public void setFeatureLogoCategories(FeatureLogoCategoriesList value) {
        this.featureLogoCategories = value;
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
     * Gets the value of the featureID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeatureID() {
        return featureID;
    }

    /**
     * Sets the value of the featureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeatureID(BigInteger value) {
        this.featureID = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the logoPic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoPic() {
        return logoPic;
    }

    /**
     * Sets the value of the logoPic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoPic(String value) {
        this.logoPic = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

}
