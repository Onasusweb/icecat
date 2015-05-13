
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
 * <p>Java class for RestrictedValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictedValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestrictedValue" type="{}RestrictedValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValueSorting" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedValues", propOrder = {
    "restrictedValue"
})
public class RestrictedValues
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RestrictedValue", required = true)
    protected List<RestrictedValue> restrictedValue;
    @XmlAttribute(name = "ValueSorting")
    protected BigInteger valueSorting;

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
