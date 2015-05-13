
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
 * <p>Java class for Countries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Countries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="System_Of_Measurement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Countries", propOrder = {
    "country"
})
public class Countries
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Country")
    protected List<Countries.Country> country;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Countries.Country }
     * 
     * 
     */
    public List<Countries.Country> getCountry() {
        if (country == null) {
            country = new ArrayList<Countries.Country>();
        }
        return this.country;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="System_Of_Measurement" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Country
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "ID", required = true)
        protected BigInteger id;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "System_Of_Measurement")
        protected String systemOfMeasurement;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the systemOfMeasurement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemOfMeasurement() {
            return systemOfMeasurement;
        }

        /**
         * Sets the value of the systemOfMeasurement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemOfMeasurement(String value) {
            this.systemOfMeasurement = value;
        }

    }

}
