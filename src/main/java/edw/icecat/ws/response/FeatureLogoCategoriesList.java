
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureLogoCategoriesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureLogoCategoriesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureLogoCategory" type="{}FeatureLogoCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureLogoCategoriesList", propOrder = {
    "featureLogoCategory"
})
public class FeatureLogoCategoriesList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeatureLogoCategory")
    protected List<FeatureLogoCategory> featureLogoCategory;

    /**
     * Gets the value of the featureLogoCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureLogoCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureLogoCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureLogoCategory }
     * 
     * 
     */
    public List<FeatureLogoCategory> getFeatureLogoCategory() {
        if (featureLogoCategory == null) {
            featureLogoCategory = new ArrayList<FeatureLogoCategory>();
        }
        return this.featureLogoCategory;
    }

}
