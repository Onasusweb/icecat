
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Measure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Measure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Signs" type="{}Signs" minOccurs="0"/>
 *         &lt;element name="Names" type="{}Names" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{}Descriptions" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure", propOrder = {

})
public class Measure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Sign")
    protected String sign;
    @XmlElement(name = "Signs")
    protected Signs signs;
    @XmlElement(name = "Names")
    protected Names names;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Sign")
    protected String signAttr;

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Gets the value of the signs property.
     * 
     * @return
     *     possible object is
     *     {@link Signs }
     *     
     */
    public Signs getSigns() {
        return signs;
    }

    /**
     * Sets the value of the signs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signs }
     *     
     */
    public void setSigns(Signs value) {
        this.signs = value;
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
     * Gets the value of the signAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignAttr() {
        return signAttr;
    }

    /**
     * Sets the value of the signAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignAttr(String value) {
        this.signAttr = value;
    }

}
