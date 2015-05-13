
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticQueryDatesListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticQueryDatesListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatisticQueryDate" type="{}StatisticQueryDate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticQueryDatesListResponse", propOrder = {
    "statisticQueryDate"
})
public class StatisticQueryDatesListResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StatisticQueryDate")
    protected List<StatisticQueryDate> statisticQueryDate;

    /**
     * Gets the value of the statisticQueryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticQueryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticQueryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticQueryDate }
     * 
     * 
     */
    public List<StatisticQueryDate> getStatisticQueryDate() {
        if (statisticQueryDate == null) {
            statisticQueryDate = new ArrayList<StatisticQueryDate>();
        }
        return this.statisticQueryDate;
    }

}
