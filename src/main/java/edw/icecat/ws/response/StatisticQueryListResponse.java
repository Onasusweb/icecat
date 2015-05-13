
package edw.icecat.ws.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticQueryListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticQueryListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatisticQuery" type="{}StatisticQuery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticQueryListResponse", propOrder = {
    "statisticQuery"
})
public class StatisticQueryListResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StatisticQuery")
    protected List<StatisticQuery> statisticQuery;

    /**
     * Gets the value of the statisticQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticQuery }
     * 
     * 
     */
    public List<StatisticQuery> getStatisticQuery() {
        if (statisticQuery == null) {
            statisticQuery = new ArrayList<StatisticQuery>();
        }
        return this.statisticQuery;
    }

}
