
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
 * <p>Java class for FeatureValuesVocabularyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureValuesVocabularyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureValuesVocabulary" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeatureValue" type="{}FeatureValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Key_Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Group_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "FeatureValuesVocabularyList", propOrder = {
    "featureValuesVocabulary"
})
public class FeatureValuesVocabularyList
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeatureValuesVocabulary")
    protected List<FeatureValuesVocabularyList.FeatureValuesVocabulary> featureValuesVocabulary;

    /**
     * Gets the value of the featureValuesVocabulary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureValuesVocabulary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureValuesVocabulary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureValuesVocabularyList.FeatureValuesVocabulary }
     * 
     * 
     */
    public List<FeatureValuesVocabularyList.FeatureValuesVocabulary> getFeatureValuesVocabulary() {
        if (featureValuesVocabulary == null) {
            featureValuesVocabulary = new ArrayList<FeatureValuesVocabularyList.FeatureValuesVocabulary>();
        }
        return this.featureValuesVocabulary;
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
     *       &lt;sequence>
     *         &lt;element name="FeatureValue" type="{}FeatureValue" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Key_Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Group_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureValue"
    })
    public static class FeatureValuesVocabulary
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FeatureValue")
        protected List<FeatureValue> featureValue;
        @XmlAttribute(name = "Key_Value", required = true)
        protected String keyValue;
        @XmlAttribute(name = "Group_ID", required = true)
        protected BigInteger groupID;

        /**
         * Gets the value of the featureValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureValue }
         * 
         * 
         */
        public List<FeatureValue> getFeatureValue() {
            if (featureValue == null) {
                featureValue = new ArrayList<FeatureValue>();
            }
            return this.featureValue;
        }

        /**
         * Gets the value of the keyValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyValue() {
            return keyValue;
        }

        /**
         * Sets the value of the keyValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyValue(String value) {
            this.keyValue = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGroupID(BigInteger value) {
            this.groupID = value;
        }

    }

}
