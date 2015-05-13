
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
 * <p>Java class for Feature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descriptions" type="{}Descriptions" minOccurs="0"/>
 *         &lt;element name="Measure" type="{}Measure" minOccurs="0"/>
 *         &lt;element name="Name" type="{}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Names" type="{}Names" minOccurs="0"/>
 *         &lt;element name="RestrictedValue" type="{}RestrictedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RestrictedValues" type="{}RestrictedValues" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LimitDirection" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Searchable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CategoryFeatureGroup_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="No" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CategoryFeature_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Use_Dropdown_Input" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValueSorting" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feature", propOrder = {
    "descriptions",
    "measure",
    "name",
    "names",
    "restrictedValue",
    "restrictedValues"
})
public class Feature
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "Measure")
    protected Measure measure;
    @XmlElement(name = "Name")
    protected List<Name> name;
    @XmlElement(name = "Names")
    protected Names names;
    @XmlElement(name = "RestrictedValue")
    protected List<RestrictedValue> restrictedValue;
    @XmlElement(name = "RestrictedValues")
    protected RestrictedValues restrictedValues;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "LimitDirection")
    protected BigInteger limitDirection;
    @XmlAttribute(name = "Searchable")
    protected Boolean searchable;
    @XmlAttribute(name = "CategoryFeatureGroup_ID")
    protected BigInteger categoryFeatureGroupID;
    @XmlAttribute(name = "No")
    protected BigInteger no;
    @XmlAttribute(name = "Class")
    protected Boolean clazz;
    @XmlAttribute(name = "CategoryFeature_ID")
    protected BigInteger categoryFeatureID;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Mandatory")
    protected BigInteger mandatory;
    @XmlAttribute(name = "Use_Dropdown_Input")
    protected String useDropdownInput;
    @XmlAttribute(name = "ValueSorting")
    protected BigInteger valueSorting;

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
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setMeasure(Measure value) {
        this.measure = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link Names }
     *     
     */
    public Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link Names }
     *     
     */
    public void setNames(Names value) {
        this.names = value;
    }

    /**
     * Gets the value of the restrictedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictedValue }
     * 
     * 
     */
    public List<RestrictedValue> getRestrictedValue() {
        if (restrictedValue == null) {
            restrictedValue = new ArrayList<RestrictedValue>();
        }
        return this.restrictedValue;
    }

    /**
     * Gets the value of the restrictedValues property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedValues }
     *     
     */
    public RestrictedValues getRestrictedValues() {
        return restrictedValues;
    }

    /**
     * Sets the value of the restrictedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedValues }
     *     
     */
    public void setRestrictedValues(RestrictedValues value) {
        this.restrictedValues = value;
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
     * Gets the value of the limitDirection property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitDirection() {
        return limitDirection;
    }

    /**
     * Sets the value of the limitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitDirection(BigInteger value) {
        this.limitDirection = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClazz(Boolean value) {
        this.clazz = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMandatory(BigInteger value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the useDropdownInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDropdownInput() {
        return useDropdownInput;
    }

    /**
     * Sets the value of the useDropdownInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDropdownInput(String value) {
        this.useDropdownInput = value;
    }

    /**
     * Gets the value of the valueSorting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValueSorting() {
        return valueSorting;
    }

    /**
     * Sets the value of the valueSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValueSorting(BigInteger value) {
        this.valueSorting = value;
    }

}
