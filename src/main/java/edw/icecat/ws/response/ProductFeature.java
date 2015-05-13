
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalValue" type="{}LocalValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Feature" type="{}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CategoryFeatureGroup_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="CategoryFeature_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Local_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Presentation_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Local_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Localized" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Translated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Searchable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFeature", propOrder = {
    "localValue",
    "feature"
})
public class ProductFeature
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocalValue")
    protected List<LocalValue> localValue;
    @XmlElement(name = "Feature")
    protected List<Feature> feature;
    @XmlAttribute(name = "CategoryFeatureGroup_ID", required = true)
    protected BigInteger categoryFeatureGroupID;
    @XmlAttribute(name = "CategoryFeature_ID", required = true)
    protected BigInteger categoryFeatureID;
    @XmlAttribute(name = "Value", required = true)
    protected String value;
    @XmlAttribute(name = "Local_Value")
    protected String localValueAttr;
    @XmlAttribute(name = "Presentation_Value")
    protected String presentationValue;
    @XmlAttribute(name = "No", required = true)
    protected BigInteger no;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Local_ID")
    protected BigInteger localID;
    @XmlAttribute(name = "Localized", required = true)
    protected boolean localized;
    @XmlAttribute(name = "Translated")
    protected Boolean translated;
    @XmlAttribute(name = "Mandatory")
    protected Boolean mandatory;
    @XmlAttribute(name = "Searchable")
    protected Boolean searchable;

    /**
     * Gets the value of the localValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalValue }
     * 
     * 
     */
    public List<LocalValue> getLocalValue() {
        if (localValue == null) {
            localValue = new ArrayList<LocalValue>();
        }
        return this.localValue;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the categoryFeatureGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryFeatureGroupID() {
        return categoryFeatureGroupID;
    }

    /**
     * Sets the value of the categoryFeatureGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryFeatureGroupID(BigInteger value) {
        this.categoryFeatureGroupID = value;
    }

    /**
     * Gets the value of the categoryFeatureID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryFeatureID() {
        return categoryFeatureID;
    }

    /**
     * Sets the value of the categoryFeatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryFeatureID(BigInteger value) {
        this.categoryFeatureID = value;
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
     * Gets the value of the localValueAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalValueAttr() {
        return localValueAttr;
    }

    /**
     * Sets the value of the localValueAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalValueAttr(String value) {
        this.localValueAttr = value;
    }

    /**
     * Gets the value of the presentationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationValue() {
        return presentationValue;
    }

    /**
     * Sets the value of the presentationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationValue(String value) {
        this.presentationValue = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNo(BigInteger value) {
        this.no = value;
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
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalID(BigInteger value) {
        this.localID = value;
    }

    /**
     * Gets the value of the localized property.
     * 
     */
    public boolean isLocalized() {
        return localized;
    }

    /**
     * Sets the value of the localized property.
     * 
     */
    public void setLocalized(boolean value) {
        this.localized = value;
    }

    /**
     * Gets the value of the translated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranslated() {
        return translated;
    }

    /**
     * Sets the value of the translated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranslated(Boolean value) {
        this.translated = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchable(Boolean value) {
        this.searchable = value;
    }

}
