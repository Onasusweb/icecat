
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonsToBuy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonsToBuy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonToBuy" type="{}ProductBullet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonsToBuy", propOrder = {
    "reasonToBuy"
})
public class ReasonsToBuy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReasonToBuy")
    protected List<ProductBullet> reasonToBuy;

    /**
     * Gets the value of the reasonToBuy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonToBuy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonToBuy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBullet }
     * 
     * 
     */
    public List<ProductBullet> getReasonToBuy() {
        if (reasonToBuy == null) {
            reasonToBuy = new ArrayList<ProductBullet>();
        }
        return this.reasonToBuy;
    }

}
