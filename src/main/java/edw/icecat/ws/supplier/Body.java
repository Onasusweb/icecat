
package edw.icecat.ws.supplier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierMappings" type="{}SupplierMappings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "body", propOrder = {
    "supplierMappings"
})
public class Body {

    @XmlElement(name = "SupplierMappings")
    protected List<SupplierMappings> supplierMappings;

    /**
     * Gets the value of the supplierMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierMappings }
     * 
     * 
     */
    public List<SupplierMappings> getSupplierMappings() {
        if (supplierMappings == null) {
            supplierMappings = new ArrayList<SupplierMappings>();
        }
        return this.supplierMappings;
    }

}
