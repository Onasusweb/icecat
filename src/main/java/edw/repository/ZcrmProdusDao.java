package edw.repository;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zcrmprodus")
public class ZcrmProdusDao extends AbstractEntity {

	@Column(nullable = true)
	protected String matnr;
	@Column(nullable = true)
	protected String maktx;
	@Column(nullable = true)
	protected String meins;
	@Column(nullable = true)
	protected String spart;
	@Column(nullable = true)
	protected String matkl;
	@Column(nullable = true)
	protected String extwg;
	@Column(nullable = true)
	protected BigDecimal brgew;
	@Column(nullable = true)
	protected BigDecimal ntgew;
	@Column(nullable = true)
	protected BigDecimal volum;
	@Column(nullable = true)
	protected String mtposMara;
	@Column(nullable = true)
	protected String ean11;
	@Column(nullable = true)
	protected String gewei;
	@Column(nullable = true)
	protected String voleh;
	@Column(nullable = true)
	protected String prdha;
	@Column(nullable = true)
	protected String artxt;
	@Column(nullable = true)
	protected String clazz;
	@Column(nullable = true)
	protected String dismm;
	@Column(nullable = true)
	protected BigDecimal minbe;
	@Column(nullable = true)
	protected String dispo;
	@Column(nullable = true)
	protected String disls;
	@Column(nullable = true)
	protected String beskz;
	@Column(nullable = true)
	protected BigDecimal plifz;
	@Column(nullable = true)
	protected String perkz;
	@Column(nullable = true)
	protected String mtvfp;
	@Column(nullable = true)
	protected String prmod;
	@Column(nullable = true)
	protected String xchpf;
	@Column(nullable = true)
	protected String ltkza;
	@Column(nullable = true)
	protected String lgbkz;
	@Column(nullable = true)
	protected String ltkze;
	@Column(nullable = true)
	protected String bklas;
	@Column(nullable = true)
	protected String bwtty;
	@Column(nullable = true)
	protected BigDecimal pvprs1;
	@Column(nullable = true)
	protected String bonus;
	@Column(nullable = true)
	protected String kondm;
	@Column(nullable = true)
	protected String mvgr1;
	@Column(nullable = true)
	protected String mvgr2;
	@Column(nullable = true)
	protected String provg;
	@Column(nullable = true)
	protected String ktgrm;
	@Column(nullable = true)
	protected String mtpos;
	@Column(nullable = true)
	protected String mvgr3;
	@Column(nullable = true)
	protected BigDecimal scmng;
	@Column(nullable = true)
	protected String lgtyp;
	@Column(nullable = true)
	protected String spras;
	@Column(nullable = true)
	protected String meinh;
	@Column(nullable = true)
	protected BigDecimal umrez;
	@Column(nullable = true)
	protected String groes;
	@Column(nullable = true)
	protected String numtp;
	@Column(nullable = true)
	protected String prodh;
	@Column(nullable = true)
	protected String mvgr4;
	@Column(nullable = true)
	protected String stawn;
	@Column(nullable = true)
	protected String herkl;
	@Column(nullable = true)
	protected String mfrpn;
	@Column(nullable = true)
	protected String mfrnr;
	@Column(nullable = true)
	protected String lgpla;
	@Column(nullable = true)
	protected BigDecimal lpmax;
	@Column(nullable = true)
	protected BigDecimal lpmin;
	@Column(nullable = true)
	protected BigDecimal rdmng;
	@Column(nullable = true)
	protected BigDecimal mamng;
	@Column(nullable = true)
	protected BigDecimal nsmng;
	@Column(nullable = true)
	protected String versg;
	@Column(nullable = true)
	protected String ekgrp;
	@Column(nullable = true)
	protected String lvorm;
	@Column(nullable = true)
	protected String text0;
	@Column(nullable = true)
	protected String text1;
	@Column(nullable = true)
	protected String text2;
	@Column(nullable = true)
	protected String text3;
	@Column(nullable = true)
	protected String text4;
	@Column(nullable = true)
	protected String text5;

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getMaktx() {
		return maktx;
	}

	public void setMaktx(String maktx) {
		this.maktx = maktx;
	}

	public String getMeins() {
		return meins;
	}

	public void setMeins(String meins) {
		this.meins = meins;
	}

	public String getSpart() {
		return spart;
	}

	public void setSpart(String spart) {
		this.spart = spart;
	}

	public String getMatkl() {
		return matkl;
	}

	public void setMatkl(String matkl) {
		this.matkl = matkl;
	}

	public String getExtwg() {
		return extwg;
	}

	public void setExtwg(String extwg) {
		this.extwg = extwg;
	}

	public BigDecimal getBrgew() {
		return brgew;
	}

	public void setBrgew(BigDecimal brgew) {
		this.brgew = brgew;
	}

	public BigDecimal getNtgew() {
		return ntgew;
	}

	public void setNtgew(BigDecimal ntgew) {
		this.ntgew = ntgew;
	}

	public BigDecimal getVolum() {
		return volum;
	}

	public void setVolum(BigDecimal volum) {
		this.volum = volum;
	}

	public String getMtposMara() {
		return mtposMara;
	}

	public void setMtposMara(String mtposMara) {
		this.mtposMara = mtposMara;
	}

	public String getEan11() {
		return ean11;
	}

	public void setEan11(String ean11) {
		this.ean11 = ean11;
	}

	public String getGewei() {
		return gewei;
	}

	public void setGewei(String gewei) {
		this.gewei = gewei;
	}

	public String getVoleh() {
		return voleh;
	}

	public void setVoleh(String voleh) {
		this.voleh = voleh;
	}

	public String getPrdha() {
		return prdha;
	}

	public void setPrdha(String prdha) {
		this.prdha = prdha;
	}

	public String getArtxt() {
		return artxt;
	}

	public void setArtxt(String artxt) {
		this.artxt = artxt;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDismm() {
		return dismm;
	}

	public void setDismm(String dismm) {
		this.dismm = dismm;
	}

	public BigDecimal getMinbe() {
		return minbe;
	}

	public void setMinbe(BigDecimal minbe) {
		this.minbe = minbe;
	}

	public String getDispo() {
		return dispo;
	}

	public void setDispo(String dispo) {
		this.dispo = dispo;
	}

	public String getDisls() {
		return disls;
	}

	public void setDisls(String disls) {
		this.disls = disls;
	}

	public String getBeskz() {
		return beskz;
	}

	public void setBeskz(String beskz) {
		this.beskz = beskz;
	}

	public BigDecimal getPlifz() {
		return plifz;
	}

	public void setPlifz(BigDecimal plifz) {
		this.plifz = plifz;
	}

	public String getPerkz() {
		return perkz;
	}

	public void setPerkz(String perkz) {
		this.perkz = perkz;
	}

	public String getMtvfp() {
		return mtvfp;
	}

	public void setMtvfp(String mtvfp) {
		this.mtvfp = mtvfp;
	}

	public String getPrmod() {
		return prmod;
	}

	public void setPrmod(String prmod) {
		this.prmod = prmod;
	}

	public String getXchpf() {
		return xchpf;
	}

	public void setXchpf(String xchpf) {
		this.xchpf = xchpf;
	}

	public String getLtkza() {
		return ltkza;
	}

	public void setLtkza(String ltkza) {
		this.ltkza = ltkza;
	}

	public String getLgbkz() {
		return lgbkz;
	}

	public void setLgbkz(String lgbkz) {
		this.lgbkz = lgbkz;
	}

	public String getLtkze() {
		return ltkze;
	}

	public void setLtkze(String ltkze) {
		this.ltkze = ltkze;
	}

	public String getBklas() {
		return bklas;
	}

	public void setBklas(String bklas) {
		this.bklas = bklas;
	}

	public String getBwtty() {
		return bwtty;
	}

	public void setBwtty(String bwtty) {
		this.bwtty = bwtty;
	}

	public BigDecimal getPvprs1() {
		return pvprs1;
	}

	public void setPvprs1(BigDecimal pvprs1) {
		this.pvprs1 = pvprs1;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getKondm() {
		return kondm;
	}

	public void setKondm(String kondm) {
		this.kondm = kondm;
	}

	public String getMvgr1() {
		return mvgr1;
	}

	public void setMvgr1(String mvgr1) {
		this.mvgr1 = mvgr1;
	}

	public String getMvgr2() {
		return mvgr2;
	}

	public void setMvgr2(String mvgr2) {
		this.mvgr2 = mvgr2;
	}

	public String getProvg() {
		return provg;
	}

	public void setProvg(String provg) {
		this.provg = provg;
	}

	public String getKtgrm() {
		return ktgrm;
	}

	public void setKtgrm(String ktgrm) {
		this.ktgrm = ktgrm;
	}

	public String getMtpos() {
		return mtpos;
	}

	public void setMtpos(String mtpos) {
		this.mtpos = mtpos;
	}

	public String getMvgr3() {
		return mvgr3;
	}

	public void setMvgr3(String mvgr3) {
		this.mvgr3 = mvgr3;
	}

	public BigDecimal getScmng() {
		return scmng;
	}

	public void setScmng(BigDecimal scmng) {
		this.scmng = scmng;
	}

	public String getLgtyp() {
		return lgtyp;
	}

	public void setLgtyp(String lgtyp) {
		this.lgtyp = lgtyp;
	}

	public String getSpras() {
		return spras;
	}

	public void setSpras(String spras) {
		this.spras = spras;
	}

	public String getMeinh() {
		return meinh;
	}

	public void setMeinh(String meinh) {
		this.meinh = meinh;
	}

	public BigDecimal getUmrez() {
		return umrez;
	}

	public void setUmrez(BigDecimal umrez) {
		this.umrez = umrez;
	}

	public String getGroes() {
		return groes;
	}

	public void setGroes(String groes) {
		this.groes = groes;
	}

	public String getNumtp() {
		return numtp;
	}

	public void setNumtp(String numtp) {
		this.numtp = numtp;
	}

	public String getProdh() {
		return prodh;
	}

	public void setProdh(String prodh) {
		this.prodh = prodh;
	}

	public String getMvgr4() {
		return mvgr4;
	}

	public void setMvgr4(String mvgr4) {
		this.mvgr4 = mvgr4;
	}

	public String getStawn() {
		return stawn;
	}

	public void setStawn(String stawn) {
		this.stawn = stawn;
	}

	public String getHerkl() {
		return herkl;
	}

	public void setHerkl(String herkl) {
		this.herkl = herkl;
	}

	public String getMfrpn() {
		return mfrpn;
	}

	public void setMfrpn(String mfrpn) {
		this.mfrpn = mfrpn;
	}

	public String getMfrnr() {
		return mfrnr;
	}

	public void setMfrnr(String mfrnr) {
		this.mfrnr = mfrnr;
	}

	public String getLgpla() {
		return lgpla;
	}

	public void setLgpla(String lgpla) {
		this.lgpla = lgpla;
	}

	public BigDecimal getLpmax() {
		return lpmax;
	}

	public void setLpmax(BigDecimal lpmax) {
		this.lpmax = lpmax;
	}

	public BigDecimal getLpmin() {
		return lpmin;
	}

	public void setLpmin(BigDecimal lpmin) {
		this.lpmin = lpmin;
	}

	public BigDecimal getRdmng() {
		return rdmng;
	}

	public void setRdmng(BigDecimal rdmng) {
		this.rdmng = rdmng;
	}

	public BigDecimal getMamng() {
		return mamng;
	}

	public void setMamng(BigDecimal mamng) {
		this.mamng = mamng;
	}

	public BigDecimal getNsmng() {
		return nsmng;
	}

	public void setNsmng(BigDecimal nsmng) {
		this.nsmng = nsmng;
	}

	public String getVersg() {
		return versg;
	}

	public void setVersg(String versg) {
		this.versg = versg;
	}

	public String getEkgrp() {
		return ekgrp;
	}

	public void setEkgrp(String ekgrp) {
		this.ekgrp = ekgrp;
	}

	public String getLvorm() {
		return lvorm;
	}

	public void setLvorm(String lvorm) {
		this.lvorm = lvorm;
	}

	public String getText0() {
		return text0;
	}

	public void setText0(String text0) {
		this.text0 = text0;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public String getText4() {
		return text4;
	}

	public void setText4(String text4) {
		this.text4 = text4;
	}

	public String getText5() {
		return text5;
	}

	public void setText5(String text5) {
		this.text5 = text5;
	}
}
