
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Sign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sign">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="langid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sign", propOrder = {
    "value"
})
public class Sign
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "ID")
    protected BigInteger id;
    @XmlAttribute(name = "langid")
    protected BigInteger langid;
    @XmlAttribute(name = "Value")
    protected String valueAttr;

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
     * Gets the value of the valueAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAttr() {
        return valueAttr;
    }

    /**
     * Sets the value of the valueAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAttr(String value) {
        this.valueAttr = value;
    }

}
