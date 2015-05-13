package edw.icecat.xml;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edw.repository.IcecatFileEanDao;
import edw.repository.IcecatFileIndexDao;
import edw.repository.IcecatFileMprodDao;
import edw.util.CallbackSAXParser.SaxCallback;
import edw.util.CallbackSAXParser.Values;

public class FileIndexCallback {
	FileIndexHandler handler;

	public FileIndexCallback(FileIndexHandler handler) {
		super();
		this.handler = handler;
	}

	Set<IcecatFileEanDao> eans = new HashSet<IcecatFileEanDao>();
	Set<IcecatFileMprodDao> mProds = new HashSet<IcecatFileMprodDao>();
	
	@SaxCallback("ICECAT-interface.files.index.file")
	public void onFile(String path, Values values, Map<String, String> attributes) {
		IcecatFileIndexDao file = new IcecatFileIndexDao();
		file.setPath(attributes.get("path"));
		file.setProductId(attributes.get("Product_ID"));
		file.setUpdated(attributes.get("Updated"));
		file.setDateAdded(attributes.get("Date_Added"));
		file.setQuality(attributes.get("Quality"));
		file.setSupplierId(attributes.get("Supplier_id"));
		file.setProdId(attributes.get("Prod_ID"));
		file.setCatid(attributes.get("Catid"));
		file.setOnMarket(attributes.get("On_Market"));
		file.setStock(attributes.get("Stock"));
		file.setModelName(attributes.get("Model_Name"));
		file.setProductView(attributes.get("Product_View"));
		file.setHighPic(attributes.get("HighPic"));
		file.setHighPicSize(attributes.get("HighPicSize"));
		file.setHighPicWidth(attributes.get("HighPicWidth"));
		file.setHighPicHeight(attributes.get("HighPicHeight"));
		file.setDistributorInfoUpdated(attributes.get("Distributor_Info_Updated"));
		
		file.setEans(this.eans);
		file.setMProds(this.mProds);

		this.eans = new HashSet<IcecatFileEanDao>();
		this.mProds = new HashSet<IcecatFileMprodDao>();
		handler.handle(file);
	}
	
	@SaxCallback("ICECAT-interface.files.index.file.EAN_UPCS.EAN_UPC")
	public void onEan(String path, Values values, Map<String, String> attributes) {
		IcecatFileEanDao ean = new IcecatFileEanDao();
		ean.setEan(attributes.get("Value"));
		this.eans.add(ean);
	}
	@SaxCallback("ICECAT-interface.files.index.file.M_Prod_ID")
	public void onMprod(String path, Values values, Map<String, String> attributes) {
		IcecatFileMprodDao mprod = new IcecatFileMprodDao();
		mprod.setMprodId(values.get("ICECAT-interface.files.index.file.M_Prod_ID"));
		mprod.setSupplierId(attributes.get("Supplier_id"));
		mprod.setSupplierName(attributes.get("Supplier_name"));
		this.mProds.add(mprod);
	}
}
