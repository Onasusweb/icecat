
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
 * <p>Java class for ProductsComplaintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductsComplaintResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductComplaintReponse" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ComplaintStatus_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ProductComplaintRequest_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Error" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ProductsComplaintResponse", propOrder = {
    "productComplaintReponse"
})
public class ProductsComplaintResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductComplaintReponse")
    protected List<ProductsComplaintResponse.ProductComplaintReponse> productComplaintReponse;

    /**
     * Gets the value of the productComplaintReponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productComplaintReponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductComplaintReponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductsComplaintResponse.ProductComplaintReponse }
     * 
     * 
     */
    public List<ProductsComplaintResponse.ProductComplaintReponse> getProductComplaintReponse() {
        if (productComplaintReponse == null) {
            productComplaintReponse = new ArrayList<ProductsComplaintResponse.ProductComplaintReponse>();
        }
        return this.productComplaintReponse;
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
     *       &lt;attribute name="Product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ComplaintStatus_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ProductComplaintRequest_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Error" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProductComplaintReponse
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "Product_id")
        protected BigInteger productId;
        @XmlAttribute(name = "ComplaintStatus_ID")
        protected BigInteger complaintStatusID;
        @XmlAttribute(name = "ProductComplaintRequest_ID")
        protected BigInteger productComplaintRequestID;
        @XmlAttribute(name = "Error")
        protected String error;
        @XmlAttribute(name = "Confirmation")
        protected String confirmation;

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProductId(BigInteger value) {
            this.productId = value;
        }

        /**
         * Gets the value of the complaintStatusID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getComplaintStatusID() {
            return complaintStatusID;
        }

        /**
         * Sets the value of the complaintStatusID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setComplaintStatusID(BigInteger value) {
            this.complaintStatusID = value;
        }

        /**
         * Gets the value of the productComplaintRequestID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProductComplaintRequestID() {
            return productComplaintRequestID;
        }

        /**
         * Sets the value of the productComplaintRequestID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProductComplaintRequestID(BigInteger value) {
            this.productComplaintRequestID = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setError(String value) {
            this.error = value;
        }

        /**
         * Gets the value of the confirmation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmation() {
            return confirmation;
        }

        /**
         * Sets the value of the confirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmation(String value) {
            this.confirmation = value;
        }

    }

}
