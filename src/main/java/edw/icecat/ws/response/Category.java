
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryFeatureGroup" type="{}CategoryFeatureGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Feature" type="{}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Names" type="{}Names" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentCategory" type="{}ParentCategory" minOccurs="0"/>
 *         &lt;element name="UNCATID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VirtualCategories" type="{}VirtualCategories" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UNCATID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Searchable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ThumbPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "categoryFeatureGroup",
    "description",
    "feature",
    "keywords",
    "name",
    "names",
    "parentCategory",
    "uncatid",
    "virtualCategories"
})
public class Category
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CategoryFeatureGroup")
    protected List<CategoryFeatureGroup> categoryFeatureGroup;
    @XmlElement(name = "Description")
    protected List<Description> description;
    @XmlElement(name = "Feature")
    protected List<Feature> feature;
    @XmlElement(name = "Keywords")
    protected List<Keywords> keywords;
    @XmlElement(name = "Name")
    protected List<Name> name;
    @XmlElement(name = "Names")
    protected List<Names> names;
    @XmlElement(name = "ParentCategory")
    protected ParentCategory parentCategory;
    @XmlElement(name = "UNCATID")
    protected List<String> uncatid;
    @XmlElement(name = "VirtualCategories")
    protected VirtualCategories virtualCategories;
    @XmlAttribute(name = "UNCATID")
    protected String uncatidAttr;
    @XmlAttribute(name = "Searchable")
    protected Boolean searchable;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Score")
    protected BigInteger score;
    @XmlAttribute(name = "ThumbPic")
    @XmlSchemaType(name = "anyURI")
    protected String thumbPic;
    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "LowPic")
    @XmlSchemaType(name = "anyURI")
    protected String lowPic;

    /**
     * Gets the value of the categoryFeatureGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryFeatureGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryFeatureGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryFeatureGroup }
     * 
     * 
     */
    public List<CategoryFeatureGroup> getCategoryFeatureGroup() {
        if (categoryFeatureGroup == null) {
            categoryFeatureGroup = new ArrayList<CategoryFeatureGroup>();
        }
        return this.categoryFeatureGroup;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Description>();
        }
        return this.description;
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
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keywords }
     * 
     * 
     */
    public List<Keywords> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return this.keywords;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Names }
     * 
     * 
     */
    public List<Names> getNames() {
        if (names == null) {
            names = new ArrayList<Names>();
        }
        return this.names;
    }

    /**
     * Gets the value of the parentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCategory }
     *     
     */
    public ParentCategory getParentCategory() {
        return parentCategory;
    }

    /**
     * Sets the value of the parentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCategory }
     *     
     */
    public void setParentCategory(ParentCategory value) {
        this.parentCategory = value;
    }

    /**
     * Gets the value of the uncatid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncatid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNCATID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUNCATID() {
        if (uncatid == null) {
            uncatid = new ArrayList<String>();
        }
        return this.uncatid;
    }

    /**
     * Gets the value of the virtualCategories property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCategories }
     *     
     */
    public VirtualCategories getVirtualCategories() {
        return virtualCategories;
    }

    /**
     * Sets the value of the virtualCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCategories }
     *     
     */
    public void setVirtualCategories(VirtualCategories value) {
        this.virtualCategories = value;
    }

    /**
     * Gets the value of the uncatidAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNCATIDAttr() {
        return uncatidAttr;
    }

    /**
     * Sets the value of the uncatidAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNCATIDAttr(String value) {
        this.uncatidAttr = value;
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
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScore(BigInteger value) {
        this.score = value;
    }

    /**
     * Gets the value of the thumbPic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbPic() {
        return thumbPic;
    }

    /**
     * Sets the value of the thumbPic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbPic(String value) {
        this.thumbPic = value;
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
     * Gets the value of the lowPic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowPic() {
        return lowPic;
    }

    /**
     * Sets the value of the lowPic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowPic(String value) {
        this.lowPic = value;
    }

}
