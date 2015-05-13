package edw.despec;

import java.util.List;
import java.util.Map;

public class Product {

	public Product() {
		this.despec = new DespecInfo();
		this.iceCat = new IceCatInfo();
	}
	
	public DespecInfo despec;
	public IceCatInfo iceCat;
	
	public class DespecInfo {
		public String matNr;
		public String mfrNr;
		public String mfrpn;
		public String extwg;
		public String maktx;
		public String prdha;
		public String prodh;
		public String category_code;
		public String category;
		public String ean11;
		public String mvgr1;
		public String mvgr2;
		
		public String text;
	}
	
	public class IceCatInfo {
		public String icecatId;
		public String title;
		public String brand;
		public String productFamily;
		public String productSeries;
		public String modelName;
		public String productCode;
		public String eanCode;
		public String category;

		public String highPic;
		public String lowPic;
		public String thumbPic;

		public String descriptionLong;
		public String descriptionShort;
		public String summaryShort;
		public String summaryLong;

		public Map<String, List<IceCatFeature>> features;
	}
	
	public class IceCatFeature {
		public String featureId;
		public String type;
		public String name;
		public Object value;
		public String presentationValue;
		public Boolean searchable;
	}
	
}
