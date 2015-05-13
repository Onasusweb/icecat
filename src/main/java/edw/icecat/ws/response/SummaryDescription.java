
package edw.icecat.ws.response;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LongSummaryDescription" type="{}SummaryDescriptionAttr"/>
 *         &lt;element name="ShortSummaryDescription" type="{}SummaryDescriptionAttr"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryDescription", propOrder = {

})
public class SummaryDescription
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LongSummaryDescription", required = true)
    protected SummaryDescriptionAttr longSummaryDescription;
    @XmlElement(name = "ShortSummaryDescription", required = true)
    protected SummaryDescriptionAttr shortSummaryDescription;

    /**
     * Gets the value of the longSummaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDescriptionAttr }
     *     
     */
    public SummaryDescriptionAttr getLongSummaryDescription() {
        return longSummaryDescription;
    }

    /**
     * Sets the value of the longSummaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDescriptionAttr }
     *     
     */
    public void setLongSummaryDescription(SummaryDescriptionAttr value) {
        this.longSummaryDescription = value;
    }

    /**
     * Gets the value of the shortSummaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryDescriptionAttr }
     *     
     */
    public SummaryDescriptionAttr getShortSummaryDescription() {
        return shortSummaryDescription;
    }

    /**
     * Sets the value of the shortSummaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryDescriptionAttr }
     *     
     */
    public void setShortSummaryDescription(SummaryDescriptionAttr value) {
        this.shortSummaryDescription = value;
    }

}
