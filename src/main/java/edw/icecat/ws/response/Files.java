
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="file" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Supplier_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Prod_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Generated" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "file"
})
@XmlRootElement(name = "files")
public class Files
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<Files.File> file;
    @XmlAttribute(name = "Generated")
    protected BigInteger generated;

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Files.File }
     * 
     * 
     */
    public List<Files.File> getFile() {
        if (file == null) {
            file = new ArrayList<Files.File>();
        }
        return this.file;
    }

    /**
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGenerated() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGenerated(BigInteger value) {
        this.generated = value;
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
     *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Supplier_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Prod_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class File
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "path")
        @XmlSchemaType(name = "anyURI")
        protected String path;
        @XmlAttribute(name = "Product_id")
        protected BigInteger productId;
        @XmlAttribute(name = "Updated")
        protected String updated;
        @XmlAttribute(name = "Quality")
        protected String quality;
        @XmlAttribute(name = "Supplier_id")
        protected BigInteger supplierId;
        @XmlAttribute(name = "Prod_ID")
        protected String prodID;

        /**
         * Gets the value of the path property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * Sets the value of the path property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
        }

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
         * Gets the value of the updated property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpdated() {
            return updated;
        }

        /**
         * Sets the value of the updated property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpdated(String value) {
            this.updated = value;
        }

        /**
         * Gets the value of the quality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuality() {
            return quality;
        }

        /**
         * Sets the value of the quality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuality(String value) {
            this.quality = value;
        }

        /**
         * Gets the value of the supplierId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSupplierId() {
            return supplierId;
        }

        /**
         * Sets the value of the supplierId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSupplierId(BigInteger value) {
            this.supplierId = value;
        }

        /**
         * Gets the value of the prodID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProdID() {
            return prodID;
        }

        /**
         * Sets the value of the prodID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProdID(String value) {
            this.prodID = value;
        }

    }

}
