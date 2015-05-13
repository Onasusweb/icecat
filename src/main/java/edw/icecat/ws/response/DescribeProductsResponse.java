
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
 * <p>Java class for DescribeProductsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeProductsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescribeProductResponse" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="DescribeProductRequest_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Error" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "DescribeProductsResponse", propOrder = {
    "describeProductResponse"
})
public class DescribeProductsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DescribeProductResponse")
    protected List<DescribeProductsResponse.DescribeProductResponse> describeProductResponse;

    /**
     * Gets the value of the describeProductResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describeProductResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribeProductResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeProductsResponse.DescribeProductResponse }
     * 
     * 
     */
    public List<DescribeProductsResponse.DescribeProductResponse> getDescribeProductResponse() {
        if (describeProductResponse == null) {
            describeProductResponse = new ArrayList<DescribeProductsResponse.DescribeProductResponse>();
        }
        return this.describeProductResponse;
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
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="DescribeProductRequest_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Error" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DescribeProductResponse
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "Product_id")
        protected BigInteger productId;
        @XmlAttribute(name = "Status")
        protected BigInteger status;
        @XmlAttribute(name = "DescribeProductRequest_ID")
        protected BigInteger describeProductRequestID;
        @XmlAttribute(name = "Error")
        protected String error;

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
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStatus(BigInteger value) {
            this.status = value;
        }

        /**
         * Gets the value of the describeProductRequestID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDescribeProductRequestID() {
            return describeProductRequestID;
        }

        /**
         * Sets the value of the describeProductRequestID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDescribeProductRequestID(BigInteger value) {
            this.describeProductRequestID = value;
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

    }

}
