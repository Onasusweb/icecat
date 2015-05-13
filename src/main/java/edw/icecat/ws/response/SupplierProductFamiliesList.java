
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierProductFamiliesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierProductFamiliesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductFamily" type="{}ProductFamily" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierProductFamiliesList", propOrder = {
    "productFamily"
})
public class SupplierProductFamiliesList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductFamily")
    protected List<ProductFamily> productFamily;

    /**
     * Gets the value of the productFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFamily }
     * 
     * 
     */
    public List<ProductFamily> getProductFamily() {
        if (productFamily == null) {
            productFamily = new ArrayList<ProductFamily>();
        }
        return this.productFamily;
    }

}
