
package edw.icecat.ws.response;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DistributorList" type="{}DistributorList" minOccurs="0"/>
 *         &lt;element name="LanguageList" type="{}LanguageList" minOccurs="0"/>
 *         &lt;element name="MeasuresList" type="{}MeasuresList" minOccurs="0"/>
 *         &lt;element name="FeaturesList" type="{}FeaturesList" minOccurs="0"/>
 *         &lt;element name="FeatureGroupsList" type="{}FeatureGroupsList" minOccurs="0"/>
 *         &lt;element name="CategoriesList" type="{}CategoriesList" minOccurs="0"/>
 *         &lt;element name="SuppliersList" type="{}SuppliersList" minOccurs="0"/>
 *         &lt;element name="CategoryFeaturesList" type="{}CategoryFeaturesList" minOccurs="0"/>
 *         &lt;element name="SupplierCategoriesList" type="{}SupplierCategoriesList" minOccurs="0"/>
 *         &lt;element name="ProductsList" type="{}ProductsList" minOccurs="0"/>
 *         &lt;element name="ProductsListLookup" type="{}ProductsListLookup" minOccurs="0"/>
 *         &lt;element name="ProductsStatistic" type="{}ProductsStatistic" minOccurs="0"/>
 *         &lt;element name="DescribeProductsResponse" type="{}DescribeProductsResponse" minOccurs="0"/>
 *         &lt;element name="StatisticQueryListResponse" type="{}StatisticQueryListResponse" minOccurs="0"/>
 *         &lt;element name="StatisticQueryDatesListResponse" type="{}StatisticQueryDatesListResponse" minOccurs="0"/>
 *         &lt;element name="StatisticQueryDateDataReportResponse" type="{}StatisticQueryDateDataReportResponse" minOccurs="0"/>
 *         &lt;element name="SupplierProductFamiliesList" type="{}SupplierProductFamiliesList" minOccurs="0"/>
 *         &lt;element name="ProductsComplaintResponse" type="{}ProductsComplaintResponse" minOccurs="0"/>
 *         &lt;element name="FulltextProductsSearchResponse" type="{}FulltextProductsSearchResponse" minOccurs="0"/>
 *         &lt;element name="FeatureValuesVocabularyList" type="{}FeatureValuesVocabularyList" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Request_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Error" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {

})
public class Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DistributorList")
    protected DistributorList distributorList;
    @XmlElement(name = "LanguageList")
    protected LanguageList languageList;
    @XmlElement(name = "MeasuresList")
    protected MeasuresList measuresList;
    @XmlElement(name = "FeaturesList")
    protected FeaturesList featuresList;
    @XmlElement(name = "FeatureGroupsList")
    protected FeatureGroupsList featureGroupsList;
    @XmlElement(name = "CategoriesList")
    protected CategoriesList categoriesList;
    @XmlElement(name = "SuppliersList")
    protected SuppliersList suppliersList;
    @XmlElement(name = "CategoryFeaturesList")
    protected CategoryFeaturesList categoryFeaturesList;
    @XmlElement(name = "SupplierCategoriesList")
    protected SupplierCategoriesList supplierCategoriesList;
    @XmlElement(name = "ProductsList")
    protected ProductsList productsList;
    @XmlElement(name = "ProductsListLookup")
    protected ProductsListLookup productsListLookup;
    @XmlElement(name = "ProductsStatistic")
    protected ProductsStatistic productsStatistic;
    @XmlElement(name = "DescribeProductsResponse")
    protected DescribeProductsResponse describeProductsResponse;
    @XmlElement(name = "StatisticQueryListResponse")
    protected StatisticQueryListResponse statisticQueryListResponse;
    @XmlElement(name = "StatisticQueryDatesListResponse")
    protected StatisticQueryDatesListResponse statisticQueryDatesListResponse;
    @XmlElement(name = "StatisticQueryDateDataReportResponse")
    protected StatisticQueryDateDataReportResponse statisticQueryDateDataReportResponse;
    @XmlElement(name = "SupplierProductFamiliesList")
    protected SupplierProductFamiliesList supplierProductFamiliesList;
    @XmlElement(name = "ProductsComplaintResponse")
    protected ProductsComplaintResponse productsComplaintResponse;
    @XmlElement(name = "FulltextProductsSearchResponse")
    protected FulltextProductsSearchResponse fulltextProductsSearchResponse;
    @XmlElement(name = "FeatureValuesVocabularyList")
    protected FeatureValuesVocabularyList featureValuesVocabularyList;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "Request_ID", required = true)
    protected BigInteger requestID;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Date", required = true)
    protected String date;
    @XmlAttribute(name = "Error")
    protected String error;

    /**
     * Gets the value of the distributorList property.
     * 
     * @return
     *     possible object is
     *     {@link DistributorList }
     *     
     */
    public DistributorList getDistributorList() {
        return distributorList;
    }

    /**
     * Sets the value of the distributorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorList }
     *     
     */
    public void setDistributorList(DistributorList value) {
        this.distributorList = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageList }
     *     
     */
    public LanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageList }
     *     
     */
    public void setLanguageList(LanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the measuresList property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuresList }
     *     
     */
    public MeasuresList getMeasuresList() {
        return measuresList;
    }

    /**
     * Sets the value of the measuresList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuresList }
     *     
     */
    public void setMeasuresList(MeasuresList value) {
        this.measuresList = value;
    }

    /**
     * Gets the value of the featuresList property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesList }
     *     
     */
    public FeaturesList getFeaturesList() {
        return featuresList;
    }

    /**
     * Sets the value of the featuresList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesList }
     *     
     */
    public void setFeaturesList(FeaturesList value) {
        this.featuresList = value;
    }

    /**
     * Gets the value of the featureGroupsList property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupsList }
     *     
     */
    public FeatureGroupsList getFeatureGroupsList() {
        return featureGroupsList;
    }

    /**
     * Sets the value of the featureGroupsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupsList }
     *     
     */
    public void setFeatureGroupsList(FeatureGroupsList value) {
        this.featureGroupsList = value;
    }

    /**
     * Gets the value of the categoriesList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesList }
     *     
     */
    public CategoriesList getCategoriesList() {
        return categoriesList;
    }

    /**
     * Sets the value of the categoriesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesList }
     *     
     */
    public void setCategoriesList(CategoriesList value) {
        this.categoriesList = value;
    }

    /**
     * Gets the value of the suppliersList property.
     * 
     * @return
     *     possible object is
     *     {@link SuppliersList }
     *     
     */
    public SuppliersList getSuppliersList() {
        return suppliersList;
    }

    /**
     * Sets the value of the suppliersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppliersList }
     *     
     */
    public void setSuppliersList(SuppliersList value) {
        this.suppliersList = value;
    }

    /**
     * Gets the value of the categoryFeaturesList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryFeaturesList }
     *     
     */
    public CategoryFeaturesList getCategoryFeaturesList() {
        return categoryFeaturesList;
    }

    /**
     * Sets the value of the categoryFeaturesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryFeaturesList }
     *     
     */
    public void setCategoryFeaturesList(CategoryFeaturesList value) {
        this.categoryFeaturesList = value;
    }

    /**
     * Gets the value of the supplierCategoriesList property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCategoriesList }
     *     
     */
    public SupplierCategoriesList getSupplierCategoriesList() {
        return supplierCategoriesList;
    }

    /**
     * Sets the value of the supplierCategoriesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCategoriesList }
     *     
     */
    public void setSupplierCategoriesList(SupplierCategoriesList value) {
        this.supplierCategoriesList = value;
    }

    /**
     * Gets the value of the productsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsList }
     *     
     */
    public ProductsList getProductsList() {
        return productsList;
    }

    /**
     * Sets the value of the productsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsList }
     *     
     */
    public void setProductsList(ProductsList value) {
        this.productsList = value;
    }

    /**
     * Gets the value of the productsListLookup property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsListLookup }
     *     
     */
    public ProductsListLookup getProductsListLookup() {
        return productsListLookup;
    }

    /**
     * Sets the value of the productsListLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsListLookup }
     *     
     */
    public void setProductsListLookup(ProductsListLookup value) {
        this.productsListLookup = value;
    }

    /**
     * Gets the value of the productsStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsStatistic }
     *     
     */
    public ProductsStatistic getProductsStatistic() {
        return productsStatistic;
    }

    /**
     * Sets the value of the productsStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsStatistic }
     *     
     */
    public void setProductsStatistic(ProductsStatistic value) {
        this.productsStatistic = value;
    }

    /**
     * Gets the value of the describeProductsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeProductsResponse }
     *     
     */
    public DescribeProductsResponse getDescribeProductsResponse() {
        return describeProductsResponse;
    }

    /**
     * Sets the value of the describeProductsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeProductsResponse }
     *     
     */
    public void setDescribeProductsResponse(DescribeProductsResponse value) {
        this.describeProductsResponse = value;
    }

    /**
     * Gets the value of the statisticQueryListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticQueryListResponse }
     *     
     */
    public StatisticQueryListResponse getStatisticQueryListResponse() {
        return statisticQueryListResponse;
    }

    /**
     * Sets the value of the statisticQueryListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticQueryListResponse }
     *     
     */
    public void setStatisticQueryListResponse(StatisticQueryListResponse value) {
        this.statisticQueryListResponse = value;
    }

    /**
     * Gets the value of the statisticQueryDatesListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticQueryDatesListResponse }
     *     
     */
    public StatisticQueryDatesListResponse getStatisticQueryDatesListResponse() {
        return statisticQueryDatesListResponse;
    }

    /**
     * Sets the value of the statisticQueryDatesListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticQueryDatesListResponse }
     *     
     */
    public void setStatisticQueryDatesListResponse(StatisticQueryDatesListResponse value) {
        this.statisticQueryDatesListResponse = value;
    }

    /**
     * Gets the value of the statisticQueryDateDataReportResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticQueryDateDataReportResponse }
     *     
     */
    public StatisticQueryDateDataReportResponse getStatisticQueryDateDataReportResponse() {
        return statisticQueryDateDataReportResponse;
    }

    /**
     * Sets the value of the statisticQueryDateDataReportResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticQueryDateDataReportResponse }
     *     
     */
    public void setStatisticQueryDateDataReportResponse(StatisticQueryDateDataReportResponse value) {
        this.statisticQueryDateDataReportResponse = value;
    }

    /**
     * Gets the value of the supplierProductFamiliesList property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierProductFamiliesList }
     *     
     */
    public SupplierProductFamiliesList getSupplierProductFamiliesList() {
        return supplierProductFamiliesList;
    }

    /**
     * Sets the value of the supplierProductFamiliesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierProductFamiliesList }
     *     
     */
    public void setSupplierProductFamiliesList(SupplierProductFamiliesList value) {
        this.supplierProductFamiliesList = value;
    }

    /**
     * Gets the value of the productsComplaintResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsComplaintResponse }
     *     
     */
    public ProductsComplaintResponse getProductsComplaintResponse() {
        return productsComplaintResponse;
    }

    /**
     * Sets the value of the productsComplaintResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsComplaintResponse }
     *     
     */
    public void setProductsComplaintResponse(ProductsComplaintResponse value) {
        this.productsComplaintResponse = value;
    }

    /**
     * Gets the value of the fulltextProductsSearchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FulltextProductsSearchResponse }
     *     
     */
    public FulltextProductsSearchResponse getFulltextProductsSearchResponse() {
        return fulltextProductsSearchResponse;
    }

    /**
     * Sets the value of the fulltextProductsSearchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulltextProductsSearchResponse }
     *     
     */
    public void setFulltextProductsSearchResponse(FulltextProductsSearchResponse value) {
        this.fulltextProductsSearchResponse = value;
    }

    /**
     * Gets the value of the featureValuesVocabularyList property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureValuesVocabularyList }
     *     
     */
    public FeatureValuesVocabularyList getFeatureValuesVocabularyList() {
        return featureValuesVocabularyList;
    }

    /**
     * Sets the value of the featureValuesVocabularyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureValuesVocabularyList }
     *     
     */
    public void setFeatureValuesVocabularyList(FeatureValuesVocabularyList value) {
        this.featureValuesVocabularyList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestID(BigInteger value) {
        this.requestID = value;
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
