
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
 * <p>Java class for ProductGallery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGallery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductPicture" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProductPicture_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Pic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="ThumbPic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="PicHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="PicWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ThumbSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="LowSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="LowPicWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="LowPicHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Pic500x500" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Pic500x500Size" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Pic500x500Width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Pic500x500Height" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="langid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="logo" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "ProductGallery", propOrder = {
    "productPicture"
})
public class ProductGallery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductPicture")
    protected List<ProductGallery.ProductPicture> productPicture;

    /**
     * Gets the value of the productPicture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPicture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPicture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGallery.ProductPicture }
     * 
     * 
     */
    public List<ProductGallery.ProductPicture> getProductPicture() {
        if (productPicture == null) {
            productPicture = new ArrayList<ProductGallery.ProductPicture>();
        }
        return this.productPicture;
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
     *       &lt;attribute name="ProductPicture_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Pic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="ThumbPic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="PicHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="PicWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ThumbSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="LowSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="LowPicWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="LowPicHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Pic500x500" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Pic500x500Size" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Pic500x500Width" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Pic500x500Height" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="langid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="logo" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class ProductPicture
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "ProductPicture_ID", required = true)
        protected String productPictureID;
        @XmlAttribute(name = "Pic", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String pic;
        @XmlAttribute(name = "ThumbPic", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String thumbPic;
        @XmlAttribute(name = "PicHeight", required = true)
        protected BigInteger picHeight;
        @XmlAttribute(name = "PicWidth", required = true)
        protected BigInteger picWidth;
        @XmlAttribute(name = "Size", required = true)
        protected BigInteger size;
        @XmlAttribute(name = "ThumbSize")
        protected BigInteger thumbSize;
        @XmlAttribute(name = "LowPic")
        @XmlSchemaType(name = "anyURI")
        protected String lowPic;
        @XmlAttribute(name = "LowSize")
        protected BigInteger lowSize;
        @XmlAttribute(name = "LowPicWidth")
        protected BigInteger lowPicWidth;
        @XmlAttribute(name = "LowPicHeight")
        protected BigInteger lowPicHeight;
        @XmlAttribute(name = "Pic500x500")
        @XmlSchemaType(name = "anyURI")
        protected String pic500X500;
        @XmlAttribute(name = "Pic500x500Size")
        protected BigInteger pic500X500Size;
        @XmlAttribute(name = "Pic500x500Width")
        protected BigInteger pic500X500Width;
        @XmlAttribute(name = "Pic500x500Height")
        protected BigInteger pic500X500Height;
        @XmlAttribute(name = "langid")
        protected BigInteger langid;
        @XmlAttribute(name = "logo")
        protected BigInteger logo;
        @XmlAttribute(name = "IsRich")
        protected BigInteger isRich;

        /**
         * Gets the value of the productPictureID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductPictureID() {
            return productPictureID;
        }

        /**
         * Sets the value of the productPictureID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductPictureID(String value) {
            this.productPictureID = value;
        }

        /**
         * Gets the value of the pic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPic() {
            return pic;
        }

        /**
         * Sets the value of the pic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPic(String value) {
            this.pic = value;
        }

        /**
         * Gets the value of the thumbPic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThumbPic() {
            return thumbPic;
        }

        /**
         * Sets the value of the thumbPic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThumbPic(String value) {
            this.thumbPic = value;
        }

        /**
         * Gets the value of the picHeight property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPicHeight() {
            return picHeight;
        }

        /**
         * Sets the value of the picHeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPicHeight(BigInteger value) {
            this.picHeight = value;
        }

        /**
         * Gets the value of the picWidth property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPicWidth() {
            return picWidth;
        }

        /**
         * Sets the value of the picWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPicWidth(BigInteger value) {
            this.picWidth = value;
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
         * Gets the value of the thumbSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getThumbSize() {
            return thumbSize;
        }

        /**
         * Sets the value of the thumbSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setThumbSize(BigInteger value) {
            this.thumbSize = value;
        }

        /**
         * Gets the value of the lowPic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLowPic() {
            return lowPic;
        }

        /**
         * Sets the value of the lowPic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLowPic(String value) {
            this.lowPic = value;
        }

        /**
         * Gets the value of the lowSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLowSize() {
            return lowSize;
        }

        /**
         * Sets the value of the lowSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLowSize(BigInteger value) {
            this.lowSize = value;
        }

        /**
         * Gets the value of the lowPicWidth property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLowPicWidth() {
            return lowPicWidth;
        }

        /**
         * Sets the value of the lowPicWidth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLowPicWidth(BigInteger value) {
            this.lowPicWidth = value;
        }

        /**
         * Gets the value of the lowPicHeight property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLowPicHeight() {
            return lowPicHeight;
        }

        /**
         * Sets the value of the lowPicHeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLowPicHeight(BigInteger value) {
            this.lowPicHeight = value;
        }

        /**
         * Gets the value of the pic500X500 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPic500X500() {
            return pic500X500;
        }

        /**
         * Sets the value of the pic500X500 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPic500X500(String value) {
            this.pic500X500 = value;
        }

        /**
         * Gets the value of the pic500X500Size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPic500X500Size() {
            return pic500X500Size;
        }

        /**
         * Sets the value of the pic500X500Size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPic500X500Size(BigInteger value) {
            this.pic500X500Size = value;
        }

        /**
         * Gets the value of the pic500X500Width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPic500X500Width() {
            return pic500X500Width;
        }

        /**
         * Sets the value of the pic500X500Width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPic500X500Width(BigInteger value) {
            this.pic500X500Width = value;
        }

        /**
         * Gets the value of the pic500X500Height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPic500X500Height() {
            return pic500X500Height;
        }

        /**
         * Sets the value of the pic500X500Height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPic500X500Height(BigInteger value) {
            this.pic500X500Height = value;
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
         * Gets the value of the logo property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLogo() {
            return logo;
        }

        /**
         * Sets the value of the logo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLogo(BigInteger value) {
            this.logo = value;
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
