
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product_related complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product_related">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Supplier" type="{}Supplier" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Prod_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThumbPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ProductsDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LowPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ThumbPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product_related", propOrder = {

})
public class ProductRelatedType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Supplier")
    protected Supplier supplier;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Prod_id", required = true)
    protected String prodId;
    @XmlAttribute(name = "ThumbPic")
    @XmlSchemaType(name = "anyURI")
    protected String thumbPic;
    @XmlAttribute(name = "Quality")
    protected String quality;
    @XmlAttribute(name = "Code")
    protected BigInteger code;
    @XmlAttribute(name = "HighPic")
    @XmlSchemaType(name = "anyURI")
    protected String highPic;
    @XmlAttribute(name = "LowPic")
    @XmlSchemaType(name = "anyURI")
    protected String lowPic;
    @XmlAttribute(name = "Score")
    protected BigInteger score;
    @XmlAttribute(name = "ProductsDescription")
    protected String productsDescription;
    @XmlAttribute(name = "Relevance")
    protected BigInteger relevance;
    @XmlAttribute(name = "LowPicSize")
    protected BigInteger lowPicSize;
    @XmlAttribute(name = "HighPicSize")
    protected BigInteger highPicSize;
    @XmlAttribute(name = "ThumbPicSize")
    protected BigInteger thumbPicSize;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "ReleaseDate")
    protected String releaseDate;

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the prodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * Sets the value of the prodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdId(String value) {
        this.prodId = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the highPic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighPic() {
        return highPic;
    }

    /**
     * Sets the value of the highPic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighPic(String value) {
        this.highPic = value;
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
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScore(BigInteger value) {
        this.score = value;
    }

    /**
     * Gets the value of the productsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductsDescription() {
        return productsDescription;
    }

    /**
     * Sets the value of the productsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductsDescription(String value) {
        this.productsDescription = value;
    }

    /**
     * Gets the value of the relevance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelevance() {
        return relevance;
    }

    /**
     * Sets the value of the relevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelevance(BigInteger value) {
        this.relevance = value;
    }

    /**
     * Gets the value of the lowPicSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowPicSize() {
        return lowPicSize;
    }

    /**
     * Sets the value of the lowPicSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowPicSize(BigInteger value) {
        this.lowPicSize = value;
    }

    /**
     * Gets the value of the highPicSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighPicSize() {
        return highPicSize;
    }

    /**
     * Sets the value of the highPicSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighPicSize(BigInteger value) {
        this.highPicSize = value;
    }

    /**
     * Gets the value of the thumbPicSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThumbPicSize() {
        return thumbPicSize;
    }

    /**
     * Sets the value of the thumbPicSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThumbPicSize(BigInteger value) {
        this.thumbPicSize = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

}
