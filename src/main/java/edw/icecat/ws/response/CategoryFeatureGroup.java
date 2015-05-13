
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
 * <p>Java class for CategoryFeatureGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryFeatureGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureGroup" type="{}FeatureGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="No" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="FeatureGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryFeatureGroup", propOrder = {
    "featureGroup"
})
public class CategoryFeatureGroup
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeatureGroup")
    protected List<FeatureGroup> featureGroup;
    @XmlAttribute(name = "No")
    protected BigInteger no;
    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "FeatureGroup")
    protected String featureGroupAttr;

    /**
     * Gets the value of the featureGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureGroup }
     * 
     * 
     */
    public List<FeatureGroup> getFeatureGroup() {
        if (featureGroup == null) {
            featureGroup = new ArrayList<FeatureGroup>();
        }
        return this.featureGroup;
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
     * Gets the value of the featureGroupAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureGroupAttr() {
        return featureGroupAttr;
    }

    /**
     * Sets the value of the featureGroupAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureGroupAttr(String value) {
        this.featureGroupAttr = value;
    }

}
