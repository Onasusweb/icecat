
package com.sap.document.sap.soap.functions.mc_style;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZcrmProdus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZcrmProdus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Maktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Spart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Matkl" type="{urn:sap-com:document:sap:rfc:functions}char9"/>
 *         &lt;element name="Extwg" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Brgew" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Ntgew" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Volum" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="MtposMara" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Ean11" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Gewei" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Voleh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Prdha" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Artxt" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Class" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Dismm" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Minbe" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Dispo" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Disls" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Beskz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Plifz" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/>
 *         &lt;element name="Perkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Mtvfp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Prmod" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Xchpf" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Ltkza" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Lgbkz" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Ltkze" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Bklas" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bwtty" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Pvprs1" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/>
 *         &lt;element name="Bonus" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Kondm" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Mvgr1" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Mvgr2" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Provg" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Ktgrm" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Mtpos" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Mvgr3" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Scmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Lgtyp" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Spras" type="{urn:sap-com:document:sap:rfc:functions}lang"/>
 *         &lt;element name="Meinh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/>
 *         &lt;element name="Umrez" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/>
 *         &lt;element name="Groes" type="{urn:sap-com:document:sap:rfc:functions}char32"/>
 *         &lt;element name="Numtp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Prodh" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Mvgr4" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Stawn" type="{urn:sap-com:document:sap:rfc:functions}char17"/>
 *         &lt;element name="Herkl" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Mfrpn" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Mfrnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Lgpla" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Lpmax" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Lpmin" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Rdmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Mamng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Nsmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Versg" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Ekgrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Lvorm" type="{urn:sap-com:document:sap:soap:functions:mc-style}char1"/>
 *         &lt;element name="Text0" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Text1" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Text2" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Text3" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Text4" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Text5" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZcrmProdus", propOrder = {
    "matnr",
    "maktx",
    "meins",
    "spart",
    "matkl",
    "extwg",
    "brgew",
    "ntgew",
    "volum",
    "mtposMara",
    "ean11",
    "gewei",
    "voleh",
    "prdha",
    "artxt",
    "clazz",
    "dismm",
    "minbe",
    "dispo",
    "disls",
    "beskz",
    "plifz",
    "perkz",
    "mtvfp",
    "prmod",
    "xchpf",
    "ltkza",
    "lgbkz",
    "ltkze",
    "bklas",
    "bwtty",
    "pvprs1",
    "bonus",
    "kondm",
    "mvgr1",
    "mvgr2",
    "provg",
    "ktgrm",
    "mtpos",
    "mvgr3",
    "scmng",
    "lgtyp",
    "spras",
    "meinh",
    "umrez",
    "groes",
    "numtp",
    "prodh",
    "mvgr4",
    "stawn",
    "herkl",
    "mfrpn",
    "mfrnr",
    "lgpla",
    "lpmax",
    "lpmin",
    "rdmng",
    "mamng",
    "nsmng",
    "versg",
    "ekgrp",
    "lvorm",
    "text0",
    "text1",
    "text2",
    "text3",
    "text4",
    "text5"
})
public class ZcrmProdus {

    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Maktx", required = true)
    protected String maktx;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Spart", required = true)
    protected String spart;
    @XmlElement(name = "Matkl", required = true)
    protected String matkl;
    @XmlElement(name = "Extwg", required = true)
    protected String extwg;
    @XmlElement(name = "Brgew", required = true)
    protected BigDecimal brgew;
    @XmlElement(name = "Ntgew", required = true)
    protected BigDecimal ntgew;
    @XmlElement(name = "Volum", required = true)
    protected BigDecimal volum;
    @XmlElement(name = "MtposMara", required = true)
    protected String mtposMara;
    @XmlElement(name = "Ean11", required = true)
    protected String ean11;
    @XmlElement(name = "Gewei", required = true)
    protected String gewei;
    @XmlElement(name = "Voleh", required = true)
    protected String voleh;
    @XmlElement(name = "Prdha", required = true)
    protected String prdha;
    @XmlElement(name = "Artxt", required = true)
    protected String artxt;
    @XmlElement(name = "Class", required = true)
    protected String clazz;
    @XmlElement(name = "Dismm", required = true)
    protected String dismm;
    @XmlElement(name = "Minbe", required = true)
    protected BigDecimal minbe;
    @XmlElement(name = "Dispo", required = true)
    protected String dispo;
    @XmlElement(name = "Disls", required = true)
    protected String disls;
    @XmlElement(name = "Beskz", required = true)
    protected String beskz;
    @XmlElement(name = "Plifz", required = true)
    protected BigDecimal plifz;
    @XmlElement(name = "Perkz", required = true)
    protected String perkz;
    @XmlElement(name = "Mtvfp", required = true)
    protected String mtvfp;
    @XmlElement(name = "Prmod", required = true)
    protected String prmod;
    @XmlElement(name = "Xchpf", required = true)
    protected String xchpf;
    @XmlElement(name = "Ltkza", required = true)
    protected String ltkza;
    @XmlElement(name = "Lgbkz", required = true)
    protected String lgbkz;
    @XmlElement(name = "Ltkze", required = true)
    protected String ltkze;
    @XmlElement(name = "Bklas", required = true)
    protected String bklas;
    @XmlElement(name = "Bwtty", required = true)
    protected String bwtty;
    @XmlElement(name = "Pvprs1", required = true)
    protected BigDecimal pvprs1;
    @XmlElement(name = "Bonus", required = true)
    protected String bonus;
    @XmlElement(name = "Kondm", required = true)
    protected String kondm;
    @XmlElement(name = "Mvgr1", required = true)
    protected String mvgr1;
    @XmlElement(name = "Mvgr2", required = true)
    protected String mvgr2;
    @XmlElement(name = "Provg", required = true)
    protected String provg;
    @XmlElement(name = "Ktgrm", required = true)
    protected String ktgrm;
    @XmlElement(name = "Mtpos", required = true)
    protected String mtpos;
    @XmlElement(name = "Mvgr3", required = true)
    protected String mvgr3;
    @XmlElement(name = "Scmng", required = true)
    protected BigDecimal scmng;
    @XmlElement(name = "Lgtyp", required = true)
    protected String lgtyp;
    @XmlElement(name = "Spras", required = true)
    protected String spras;
    @XmlElement(name = "Meinh", required = true)
    protected String meinh;
    @XmlElement(name = "Umrez", required = true)
    protected BigDecimal umrez;
    @XmlElement(name = "Groes", required = true)
    protected String groes;
    @XmlElement(name = "Numtp", required = true)
    protected String numtp;
    @XmlElement(name = "Prodh", required = true)
    protected String prodh;
    @XmlElement(name = "Mvgr4", required = true)
    protected String mvgr4;
    @XmlElement(name = "Stawn", required = true)
    protected String stawn;
    @XmlElement(name = "Herkl", required = true)
    protected String herkl;
    @XmlElement(name = "Mfrpn", required = true)
    protected String mfrpn;
    @XmlElement(name = "Mfrnr", required = true)
    protected String mfrnr;
    @XmlElement(name = "Lgpla", required = true)
    protected String lgpla;
    @XmlElement(name = "Lpmax", required = true)
    protected BigDecimal lpmax;
    @XmlElement(name = "Lpmin", required = true)
    protected BigDecimal lpmin;
    @XmlElement(name = "Rdmng", required = true)
    protected BigDecimal rdmng;
    @XmlElement(name = "Mamng", required = true)
    protected BigDecimal mamng;
    @XmlElement(name = "Nsmng", required = true)
    protected BigDecimal nsmng;
    @XmlElement(name = "Versg", required = true)
    protected String versg;
    @XmlElement(name = "Ekgrp", required = true)
    protected String ekgrp;
    @XmlElement(name = "Lvorm", required = true)
    protected String lvorm;
    @XmlElement(name = "Text0", required = true)
    protected String text0;
    @XmlElement(name = "Text1", required = true)
    protected String text1;
    @XmlElement(name = "Text2", required = true)
    protected String text2;
    @XmlElement(name = "Text3", required = true)
    protected String text3;
    @XmlElement(name = "Text4", required = true)
    protected String text4;
    @XmlElement(name = "Text5", required = true)
    protected String text5;

    /**
     * Gets the value of the matnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * Sets the value of the matnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnr(String value) {
        this.matnr = value;
    }

    /**
     * Gets the value of the maktx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaktx() {
        return maktx;
    }

    /**
     * Sets the value of the maktx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaktx(String value) {
        this.maktx = value;
    }

    /**
     * Gets the value of the meins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeins() {
        return meins;
    }

    /**
     * Sets the value of the meins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeins(String value) {
        this.meins = value;
    }

    /**
     * Gets the value of the spart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpart() {
        return spart;
    }

    /**
     * Sets the value of the spart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpart(String value) {
        this.spart = value;
    }

    /**
     * Gets the value of the matkl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatkl() {
        return matkl;
    }

    /**
     * Sets the value of the matkl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatkl(String value) {
        this.matkl = value;
    }

    /**
     * Gets the value of the extwg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtwg() {
        return extwg;
    }

    /**
     * Sets the value of the extwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtwg(String value) {
        this.extwg = value;
    }

    /**
     * Gets the value of the brgew property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrgew() {
        return brgew;
    }

    /**
     * Sets the value of the brgew property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrgew(BigDecimal value) {
        this.brgew = value;
    }

    /**
     * Gets the value of the ntgew property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtgew() {
        return ntgew;
    }

    /**
     * Sets the value of the ntgew property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtgew(BigDecimal value) {
        this.ntgew = value;
    }

    /**
     * Gets the value of the volum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolum() {
        return volum;
    }

    /**
     * Sets the value of the volum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolum(BigDecimal value) {
        this.volum = value;
    }

    /**
     * Gets the value of the mtposMara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtposMara() {
        return mtposMara;
    }

    /**
     * Sets the value of the mtposMara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtposMara(String value) {
        this.mtposMara = value;
    }

    /**
     * Gets the value of the ean11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan11() {
        return ean11;
    }

    /**
     * Sets the value of the ean11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan11(String value) {
        this.ean11 = value;
    }

    /**
     * Gets the value of the gewei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGewei() {
        return gewei;
    }

    /**
     * Sets the value of the gewei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGewei(String value) {
        this.gewei = value;
    }

    /**
     * Gets the value of the voleh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoleh() {
        return voleh;
    }

    /**
     * Sets the value of the voleh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoleh(String value) {
        this.voleh = value;
    }

    /**
     * Gets the value of the prdha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdha() {
        return prdha;
    }

    /**
     * Sets the value of the prdha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdha(String value) {
        this.prdha = value;
    }

    /**
     * Gets the value of the artxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtxt() {
        return artxt;
    }

    /**
     * Sets the value of the artxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtxt(String value) {
        this.artxt = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the dismm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDismm() {
        return dismm;
    }

    /**
     * Sets the value of the dismm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDismm(String value) {
        this.dismm = value;
    }

    /**
     * Gets the value of the minbe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinbe() {
        return minbe;
    }

    /**
     * Sets the value of the minbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinbe(BigDecimal value) {
        this.minbe = value;
    }

    /**
     * Gets the value of the dispo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispo() {
        return dispo;
    }

    /**
     * Sets the value of the dispo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispo(String value) {
        this.dispo = value;
    }

    /**
     * Gets the value of the disls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisls() {
        return disls;
    }

    /**
     * Sets the value of the disls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisls(String value) {
        this.disls = value;
    }

    /**
     * Gets the value of the beskz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskz() {
        return beskz;
    }

    /**
     * Sets the value of the beskz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskz(String value) {
        this.beskz = value;
    }

    /**
     * Gets the value of the plifz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlifz() {
        return plifz;
    }

    /**
     * Sets the value of the plifz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlifz(BigDecimal value) {
        this.plifz = value;
    }

    /**
     * Gets the value of the perkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerkz() {
        return perkz;
    }

    /**
     * Sets the value of the perkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerkz(String value) {
        this.perkz = value;
    }

    /**
     * Gets the value of the mtvfp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtvfp() {
        return mtvfp;
    }

    /**
     * Sets the value of the mtvfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtvfp(String value) {
        this.mtvfp = value;
    }

    /**
     * Gets the value of the prmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmod() {
        return prmod;
    }

    /**
     * Sets the value of the prmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmod(String value) {
        this.prmod = value;
    }

    /**
     * Gets the value of the xchpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchpf() {
        return xchpf;
    }

    /**
     * Sets the value of the xchpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchpf(String value) {
        this.xchpf = value;
    }

    /**
     * Gets the value of the ltkza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtkza() {
        return ltkza;
    }

    /**
     * Sets the value of the ltkza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtkza(String value) {
        this.ltkza = value;
    }

    /**
     * Gets the value of the lgbkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgbkz() {
        return lgbkz;
    }

    /**
     * Sets the value of the lgbkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgbkz(String value) {
        this.lgbkz = value;
    }

    /**
     * Gets the value of the ltkze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtkze() {
        return ltkze;
    }

    /**
     * Sets the value of the ltkze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtkze(String value) {
        this.ltkze = value;
    }

    /**
     * Gets the value of the bklas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBklas() {
        return bklas;
    }

    /**
     * Sets the value of the bklas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBklas(String value) {
        this.bklas = value;
    }

    /**
     * Gets the value of the bwtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwtty() {
        return bwtty;
    }

    /**
     * Sets the value of the bwtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwtty(String value) {
        this.bwtty = value;
    }

    /**
     * Gets the value of the pvprs1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPvprs1() {
        return pvprs1;
    }

    /**
     * Sets the value of the pvprs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPvprs1(BigDecimal value) {
        this.pvprs1 = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonus(String value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the kondm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKondm() {
        return kondm;
    }

    /**
     * Sets the value of the kondm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKondm(String value) {
        this.kondm = value;
    }

    /**
     * Gets the value of the mvgr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvgr1() {
        return mvgr1;
    }

    /**
     * Sets the value of the mvgr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvgr1(String value) {
        this.mvgr1 = value;
    }

    /**
     * Gets the value of the mvgr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvgr2() {
        return mvgr2;
    }

    /**
     * Sets the value of the mvgr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvgr2(String value) {
        this.mvgr2 = value;
    }

    /**
     * Gets the value of the provg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvg() {
        return provg;
    }

    /**
     * Sets the value of the provg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvg(String value) {
        this.provg = value;
    }

    /**
     * Gets the value of the ktgrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtgrm() {
        return ktgrm;
    }

    /**
     * Sets the value of the ktgrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtgrm(String value) {
        this.ktgrm = value;
    }

    /**
     * Gets the value of the mtpos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpos() {
        return mtpos;
    }

    /**
     * Sets the value of the mtpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpos(String value) {
        this.mtpos = value;
    }

    /**
     * Gets the value of the mvgr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvgr3() {
        return mvgr3;
    }

    /**
     * Sets the value of the mvgr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvgr3(String value) {
        this.mvgr3 = value;
    }

    /**
     * Gets the value of the scmng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScmng() {
        return scmng;
    }

    /**
     * Sets the value of the scmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScmng(BigDecimal value) {
        this.scmng = value;
    }

    /**
     * Gets the value of the lgtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgtyp() {
        return lgtyp;
    }

    /**
     * Sets the value of the lgtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgtyp(String value) {
        this.lgtyp = value;
    }

    /**
     * Gets the value of the spras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpras() {
        return spras;
    }

    /**
     * Sets the value of the spras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpras(String value) {
        this.spras = value;
    }

    /**
     * Gets the value of the meinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeinh() {
        return meinh;
    }

    /**
     * Sets the value of the meinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeinh(String value) {
        this.meinh = value;
    }

    /**
     * Gets the value of the umrez property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUmrez() {
        return umrez;
    }

    /**
     * Sets the value of the umrez property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUmrez(BigDecimal value) {
        this.umrez = value;
    }

    /**
     * Gets the value of the groes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroes() {
        return groes;
    }

    /**
     * Sets the value of the groes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroes(String value) {
        this.groes = value;
    }

    /**
     * Gets the value of the numtp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumtp() {
        return numtp;
    }

    /**
     * Sets the value of the numtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumtp(String value) {
        this.numtp = value;
    }

    /**
     * Gets the value of the prodh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdh() {
        return prodh;
    }

    /**
     * Sets the value of the prodh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdh(String value) {
        this.prodh = value;
    }

    /**
     * Gets the value of the mvgr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvgr4() {
        return mvgr4;
    }

    /**
     * Sets the value of the mvgr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvgr4(String value) {
        this.mvgr4 = value;
    }

    /**
     * Gets the value of the stawn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStawn() {
        return stawn;
    }

    /**
     * Sets the value of the stawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStawn(String value) {
        this.stawn = value;
    }

    /**
     * Gets the value of the herkl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHerkl() {
        return herkl;
    }

    /**
     * Sets the value of the herkl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHerkl(String value) {
        this.herkl = value;
    }

    /**
     * Gets the value of the mfrpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrpn() {
        return mfrpn;
    }

    /**
     * Sets the value of the mfrpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrpn(String value) {
        this.mfrpn = value;
    }

    /**
     * Gets the value of the mfrnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrnr() {
        return mfrnr;
    }

    /**
     * Sets the value of the mfrnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrnr(String value) {
        this.mfrnr = value;
    }

    /**
     * Gets the value of the lgpla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgpla() {
        return lgpla;
    }

    /**
     * Sets the value of the lgpla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgpla(String value) {
        this.lgpla = value;
    }

    /**
     * Gets the value of the lpmax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLpmax() {
        return lpmax;
    }

    /**
     * Sets the value of the lpmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLpmax(BigDecimal value) {
        this.lpmax = value;
    }

    /**
     * Gets the value of the lpmin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLpmin() {
        return lpmin;
    }

    /**
     * Sets the value of the lpmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLpmin(BigDecimal value) {
        this.lpmin = value;
    }

    /**
     * Gets the value of the rdmng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRdmng() {
        return rdmng;
    }

    /**
     * Sets the value of the rdmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRdmng(BigDecimal value) {
        this.rdmng = value;
    }

    /**
     * Gets the value of the mamng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMamng() {
        return mamng;
    }

    /**
     * Sets the value of the mamng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMamng(BigDecimal value) {
        this.mamng = value;
    }

    /**
     * Gets the value of the nsmng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNsmng() {
        return nsmng;
    }

    /**
     * Sets the value of the nsmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNsmng(BigDecimal value) {
        this.nsmng = value;
    }

    /**
     * Gets the value of the versg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersg() {
        return versg;
    }

    /**
     * Sets the value of the versg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersg(String value) {
        this.versg = value;
    }

    /**
     * Gets the value of the ekgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkgrp() {
        return ekgrp;
    }

    /**
     * Sets the value of the ekgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkgrp(String value) {
        this.ekgrp = value;
    }

    /**
     * Gets the value of the lvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLvorm() {
        return lvorm;
    }

    /**
     * Sets the value of the lvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLvorm(String value) {
        this.lvorm = value;
    }

    /**
     * Gets the value of the text0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText0() {
        return text0;
    }

    /**
     * Sets the value of the text0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText0(String value) {
        this.text0 = value;
    }

    /**
     * Gets the value of the text1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText1() {
        return text1;
    }

    /**
     * Sets the value of the text1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText1(String value) {
        this.text1 = value;
    }

    /**
     * Gets the value of the text2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText2() {
        return text2;
    }

    /**
     * Sets the value of the text2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText2(String value) {
        this.text2 = value;
    }

    /**
     * Gets the value of the text3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText3() {
        return text3;
    }

    /**
     * Sets the value of the text3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText3(String value) {
        this.text3 = value;
    }

    /**
     * Gets the value of the text4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText4() {
        return text4;
    }

    /**
     * Sets the value of the text4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText4(String value) {
        this.text4 = value;
    }

    /**
     * Gets the value of the text5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText5() {
        return text5;
    }

    /**
     * Sets the value of the text5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText5(String value) {
        this.text5 = value;
    }

}
