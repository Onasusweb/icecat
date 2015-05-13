
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductBullets_HTMLs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductBullets_HTMLs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductBullets_HTML" type="{}ProductBullets_HTML" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductBullets_HTMLs", propOrder = {
    "productBulletsHTML"
})
public class ProductBulletsHTMLs
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductBullets_HTML")
    protected List<ProductBulletsHTML> productBulletsHTML;

    /**
     * Gets the value of the productBulletsHTML property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBulletsHTML property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBulletsHTML().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBulletsHTML }
     * 
     * 
     */
    public List<ProductBulletsHTML> getProductBulletsHTML() {
        if (productBulletsHTML == null) {
            productBulletsHTML = new ArrayList<ProductBulletsHTML>();
        }
        return this.productBulletsHTML;
    }

}
