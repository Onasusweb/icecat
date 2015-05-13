
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
 * <p>Java class for ProductFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFamily">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentProductFamily" type="{}ParentProductFamily" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{}Supplier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Series" type="{}Series" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ThumbPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Category_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFamily", propOrder = {
    "description",
    "name",
    "parentProductFamily",
    "supplier",
    "series"
})
public class ProductFamily
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description")
    protected List<Description> description;
    @XmlElement(name = "Name")
    protected List<Name> name;
    @XmlElement(name = "ParentProductFamily")
    protected List<ParentProductFamily> parentProductFamily;
    @XmlElement(name = "Supplier")
    protected List<Supplier> supplier;
    @XmlElement(name = "Series")
    protected List<Series> series;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "ThumbPic")
    @XmlSchemaType(name = "anyURI")
    protected String thumbPic;
    @XmlAttribute(name = "LowPic")
    @XmlSchemaType(name = "anyURI")
    protected String lowPic;
    @XmlAttribute(name = "Category_ID")
    protected BigInteger categoryID;
    @XmlAttribute(name = "Name")
    protected String nameAttr;

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
     * Gets the value of the parentProductFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentProductFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentProductFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentProductFamily }
     * 
     * 
     */
    public List<ParentProductFamily> getParentProductFamily() {
        if (parentProductFamily == null) {
            parentProductFamily = new ArrayList<ParentProductFamily>();
        }
        return this.parentProductFamily;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplier }
     * 
     * 
     */
    public List<Supplier> getSupplier() {
        if (supplier == null) {
            supplier = new ArrayList<Supplier>();
        }
        return this.supplier;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Series }
     * 
     * 
     */
    public List<Series> getSeries() {
        if (series == null) {
            series = new ArrayList<Series>();
        }
        return this.series;
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

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryID(BigInteger value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the nameAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAttr() {
        return nameAttr;
    }

    /**
     * Sets the value of the nameAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAttr(String value) {
        this.nameAttr = value;
    }

}
