
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMultimediaObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMultimediaObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaObject" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MultimediaObject_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="langid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ContentType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="KeepAsURL" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="IsRich" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "ProductMultimediaObject", propOrder = {
    "multimediaObject"
})
public class ProductMultimediaObject
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MultimediaObject")
    protected List<ProductMultimediaObject.MultimediaObject> multimediaObject;

    /**
     * Gets the value of the multimediaObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multimediaObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultimediaObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMultimediaObject.MultimediaObject }
     * 
     * 
     */
    public List<ProductMultimediaObject.MultimediaObject> getMultimediaObject() {
        if (multimediaObject == null) {
            multimediaObject = new ArrayList<ProductMultimediaObject.MultimediaObject>();
        }
        return this.multimediaObject;
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
     *       &lt;attribute name="MultimediaObject_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="langid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ContentType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="KeepAsURL" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="IsRich" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaObject
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "MultimediaObject_ID", required = true)
        protected BigInteger multimediaObjectID;
        @XmlAttribute(name = "URL", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String url;
        @XmlAttribute(name = "Description", required = true)
        protected String description;
        @XmlAttribute(name = "Size", required = true)
        protected BigInteger size;
        @XmlAttribute(name = "Date", required = true)
        protected String date;
        @XmlAttribute(name = "langid", required = true)
        protected BigInteger langid;
        @XmlAttribute(name = "ContentType", required = true)
        protected String contentType;
        @XmlAttribute(name = "KeepAsURL", required = true)
        protected boolean keepAsURL;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "Height", required = true)
        protected BigInteger height;
        @XmlAttribute(name = "Width", required = true)
        protected BigInteger width;
        @XmlAttribute(name = "IsRich")
        protected BigInteger isRich;

        /**
         * Gets the value of the multimediaObjectID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMultimediaObjectID() {
            return multimediaObjectID;
        }

        /**
         * Sets the value of the multimediaObjectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMultimediaObjectID(BigInteger value) {
            this.multimediaObjectID = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSize(BigInteger value) {
            this.size = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the langid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLangid() {
            return langid;
        }

        /**
         * Sets the value of the langid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLangid(BigInteger value) {
            this.langid = value;
        }

        /**
         * Gets the value of the contentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentType() {
            return contentType;
        }

        /**
         * Sets the value of the contentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentType(String value) {
            this.contentType = value;
        }

        /**
         * Gets the value of the keepAsURL property.
         * 
         */
        public boolean isKeepAsURL() {
            return keepAsURL;
        }

        /**
         * Sets the value of the keepAsURL property.
         * 
         */
        public void setKeepAsURL(boolean value) {
            this.keepAsURL = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * Gets the value of the isRich property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIsRich() {
            return isRich;
        }

        /**
         * Sets the value of the isRich property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIsRich(BigInteger value) {
            this.isRich = value;
        }

    }

}
