
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{}Category" maxOccurs="unbounded"/>
 *         &lt;element name="CategoryFeatureGroup" type="{}CategoryFeatureGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EANCode" type="{}EANCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeatureLogo" type="{}FeatureLogo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductBullets" type="{}ProductBullets" minOccurs="0"/>
 *         &lt;element name="ProductBullets_HTMLs" type="{}ProductBullets_HTMLs" minOccurs="0"/>
 *         &lt;element name="ReasonsToBuy" type="{}ReasonsToBuy" minOccurs="0"/>
 *         &lt;element name="ProductBundled" type="{}ProductBundled" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{}ProductDescription" maxOccurs="unbounded"/>
 *         &lt;element name="ProductFamily" type="{}ProductFamily" minOccurs="0"/>
 *         &lt;element name="ProductFeature" type="{}ProductFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductGallery" type="{}ProductGallery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductMultimediaObject" type="{}ProductMultimediaObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductRelated" type="{}ProductRelated" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SummaryDescription" type="{}SummaryDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{}Supplier"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Prod_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThumbPic" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="EANCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HighPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="LowPic" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Score" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ProductsDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LowPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LowPicWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LowPicHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighPicWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighPicHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ThumbPicSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Map_product_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandStartOfSaleDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandEndOfSaleDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Pic500x500" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Pic500x500Size" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Pic500x500Width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Pic500x500Height" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "category",
    "categoryFeatureGroup",
    "eanCode",
    "featureLogo",
    "productBullets",
    "productBulletsHTMLs",
    "reasonsToBuy",
    "productBundled",
    "productDescription",
    "productFamily",
    "productFeature",
    "productGallery",
    "productMultimediaObject",
    "productRelated",
    "summaryDescription",
    "supplier"
})
public class Product
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Category", required = true)
    protected List<Category> category;
    @XmlElement(name = "CategoryFeatureGroup")
    protected List<CategoryFeatureGroup> categoryFeatureGroup;
    @XmlElement(name = "EANCode")
    protected List<EANCode> eanCode;
    @XmlElement(name = "FeatureLogo")
    protected List<FeatureLogo> featureLogo;
    @XmlElement(name = "ProductBullets")
    protected ProductBullets productBullets;
    @XmlElement(name = "ProductBullets_HTMLs")
    protected ProductBulletsHTMLs productBulletsHTMLs;
    @XmlElement(name = "ReasonsToBuy")
    protected ReasonsToBuy reasonsToBuy;
    @XmlElement(name = "ProductBundled")
    protected List<ProductBundled> productBundled;
    @XmlElement(name = "ProductDescription", required = true)
    protected List<ProductDescription> productDescription;
    @XmlElement(name = "ProductFamily")
    protected ProductFamily productFamily;
    @XmlElement(name = "ProductFeature")
    protected List<ProductFeature> productFeature;
    @XmlElement(name = "ProductGallery")
    protected List<ProductGallery> productGallery;
    @XmlElement(name = "ProductMultimediaObject")
    protected List<ProductMultimediaObject> productMultimediaObject;
    @XmlElement(name = "ProductRelated")
    protected List<ProductRelated> productRelated;
    @XmlElement(name = "SummaryDescription")
    protected List<SummaryDescription> summaryDescription;
    @XmlElement(name = "Supplier", required = true)
    protected Supplier supplier;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Prod_id", required = true)
    protected String prodId;
    @XmlAttribute(name = "ThumbPic", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String thumbPic;
    @XmlAttribute(name = "Quality")
    protected String quality;
    @XmlAttribute(name = "Code")
    protected BigInteger code;
    @XmlAttribute(name = "EANCode")
    protected String eanCodeAttr;
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
    @XmlAttribute(name = "LowPicWidth")
    protected BigInteger lowPicWidth;
    @XmlAttribute(name = "LowPicHeight")
    protected BigInteger lowPicHeight;
    @XmlAttribute(name = "HighPicSize")
    protected BigInteger highPicSize;
    @XmlAttribute(name = "HighPicWidth")
    protected BigInteger highPicWidth;
    @XmlAttribute(name = "HighPicHeight")
    protected BigInteger highPicHeight;
    @XmlAttribute(name = "ThumbPicSize")
    protected BigInteger thumbPicSize;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "Map_product_id")
    protected BigInteger mapProductId;
    @XmlAttribute(name = "ReleaseDate")
    protected String releaseDate;
    @XmlAttribute(name = "BrandStartOfSaleDate")
    protected String brandStartOfSaleDate;
    @XmlAttribute(name = "BrandEndOfSaleDate")
    protected String brandEndOfSaleDate;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Pic500x500")
    @XmlSchemaType(name = "anyURI")
    protected String pic500X500;
    @XmlAttribute(name = "Pic500x500Size")
    protected BigInteger pic500X500Size;
    @XmlAttribute(name = "Pic500x500Width")
    protected BigInteger pic500X500Width;
    @XmlAttribute(name = "Pic500x500Height")
    protected BigInteger pic500X500Height;

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getCategory() {
        if (category == null) {
            category = new ArrayList<Category>();
        }
        return this.category;
    }

    /**
     * Gets the value of the categoryFeatureGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryFeatureGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryFeatureGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryFeatureGroup }
     * 
     * 
     */
    public List<CategoryFeatureGroup> getCategoryFeatureGroup() {
        if (categoryFeatureGroup == null) {
            categoryFeatureGroup = new ArrayList<CategoryFeatureGroup>();
        }
        return this.categoryFeatureGroup;
    }

    /**
     * Gets the value of the eanCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eanCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEANCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EANCode }
     * 
     * 
     */
    public List<EANCode> getEANCode() {
        if (eanCode == null) {
            eanCode = new ArrayList<EANCode>();
        }
        return this.eanCode;
    }

    /**
     * Gets the value of the featureLogo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureLogo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureLogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureLogo }
     * 
     * 
     */
    public List<FeatureLogo> getFeatureLogo() {
        if (featureLogo == null) {
            featureLogo = new ArrayList<FeatureLogo>();
        }
        return this.featureLogo;
    }

    /**
     * Gets the value of the productBullets property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBullets }
     *     
     */
    public ProductBullets getProductBullets() {
        return productBullets;
    }

    /**
     * Sets the value of the productBullets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBullets }
     *     
     */
    public void setProductBullets(ProductBullets value) {
        this.productBullets = value;
    }

    /**
     * Gets the value of the productBulletsHTMLs property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBulletsHTMLs }
     *     
     */
    public ProductBulletsHTMLs getProductBulletsHTMLs() {
        return productBulletsHTMLs;
    }

    /**
     * Sets the value of the productBulletsHTMLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBulletsHTMLs }
     *     
     */
    public void setProductBulletsHTMLs(ProductBulletsHTMLs value) {
        this.productBulletsHTMLs = value;
    }

    /**
     * Gets the value of the reasonsToBuy property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonsToBuy }
     *     
     */
    public ReasonsToBuy getReasonsToBuy() {
        return reasonsToBuy;
    }

    /**
     * Sets the value of the reasonsToBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonsToBuy }
     *     
     */
    public void setReasonsToBuy(ReasonsToBuy value) {
        this.reasonsToBuy = value;
    }

    /**
     * Gets the value of the productBundled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBundled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBundled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductBundled }
     * 
     * 
     */
    public List<ProductBundled> getProductBundled() {
        if (productBundled == null) {
            productBundled = new ArrayList<ProductBundled>();
        }
        return this.productBundled;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDescription }
     * 
     * 
     */
    public List<ProductDescription> getProductDescription() {
        if (productDescription == null) {
            productDescription = new ArrayList<ProductDescription>();
        }
        return this.productDescription;
    }

    /**
     * Gets the value of the productFamily property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamily }
     *     
     */
    public ProductFamily getProductFamily() {
        return productFamily;
    }

    /**
     * Sets the value of the productFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamily }
     *     
     */
    public void setProductFamily(ProductFamily value) {
        this.productFamily = value;
    }

    /**
     * Gets the value of the productFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFeature }
     * 
     * 
     */
    public List<ProductFeature> getProductFeature() {
        if (productFeature == null) {
            productFeature = new ArrayList<ProductFeature>();
        }
        return this.productFeature;
    }

    /**
     * Gets the value of the productGallery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGallery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGallery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGallery }
     * 
     * 
     */
    public List<ProductGallery> getProductGallery() {
        if (productGallery == null) {
            productGallery = new ArrayList<ProductGallery>();
        }
        return this.productGallery;
    }

    /**
     * Gets the value of the productMultimediaObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMultimediaObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMultimediaObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMultimediaObject }
     * 
     * 
     */
    public List<ProductMultimediaObject> getProductMultimediaObject() {
        if (productMultimediaObject == null) {
            productMultimediaObject = new ArrayList<ProductMultimediaObject>();
        }
        return this.productMultimediaObject;
    }

    /**
     * Gets the value of the productRelated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRelated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRelated }
     * 
     * 
     */
    public List<ProductRelated> getProductRelated() {
        if (productRelated == null) {
            productRelated = new ArrayList<ProductRelated>();
        }
        return this.productRelated;
    }

    /**
     * Gets the value of the summaryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryDescription }
     * 
     * 
     */
    public List<SummaryDescription> getSummaryDescription() {
        if (summaryDescription == null) {
            summaryDescription = new ArrayList<SummaryDescription>();
        }
        return this.summaryDescription;
    }

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
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
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
     * Gets the value of the eanCodeAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANCodeAttr() {
        return eanCodeAttr;
    }

    /**
     * Sets the value of the eanCodeAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANCodeAttr(String value) {
        this.eanCodeAttr = value;
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
     * Gets the value of the highPicWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighPicWidth() {
        return highPicWidth;
    }

    /**
     * Sets the value of the highPicWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighPicWidth(BigInteger value) {
        this.highPicWidth = value;
    }

    /**
     * Gets the value of the highPicHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighPicHeight() {
        return highPicHeight;
    }

    /**
     * Sets the value of the highPicHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighPicHeight(BigInteger value) {
        this.highPicHeight = value;
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
     * Gets the value of the mapProductId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMapProductId() {
        return mapProductId;
    }

    /**
     * Sets the value of the mapProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMapProductId(BigInteger value) {
        this.mapProductId = value;
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

    /**
     * Gets the value of the brandStartOfSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandStartOfSaleDate() {
        return brandStartOfSaleDate;
    }

    /**
     * Sets the value of the brandStartOfSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandStartOfSaleDate(String value) {
        this.brandStartOfSaleDate = value;
    }

    /**
     * Gets the value of the brandEndOfSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandEndOfSaleDate() {
        return brandEndOfSaleDate;
    }

    /**
     * Sets the value of the brandEndOfSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandEndOfSaleDate(String value) {
        this.brandEndOfSaleDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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

}
