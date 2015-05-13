
package edw.icecat.ws.supplier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierMappings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierMappings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierMapping" type="{}SupplierMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Generated" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierMappings", propOrder = {
    "supplierMapping"
})
public class SupplierMappings {

    @XmlElement(name = "SupplierMapping")
    protected List<SupplierMapping> supplierMapping;
    @XmlAttribute(name = "Generated")
    protected BigInteger generated;

    /**
     * Gets the value of the supplierMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierMapping }
     * 
     * 
     */
    public List<SupplierMapping> getSupplierMapping() {
        if (supplierMapping == null) {
            supplierMapping = new ArrayList<SupplierMapping>();
        }
        return this.supplierMapping;
    }

    /**
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGenerated() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGenerated(BigInteger value) {
        this.generated = value;
    }

}
