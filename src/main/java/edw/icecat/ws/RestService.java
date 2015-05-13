package edw.icecat.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import edw.icecat.ws.response.ICECATInterface;

@Service
public class RestService {

	@Autowired
	RestClient restClient;

	@Cacheable("ICECATInterface")
	public ICECATInterface getProductById(String icecatId) {
		return restClient.getProductById(icecatId);
	}

	@Cacheable("ICECATInterface")
	public ICECATInterface getProductByPartNumber(String partNumber, String vendor) {
		return restClient.getProductByPartNumber(partNumber, vendor);
	}

	public ICECATInterface getProductByEan(String ean) {
		return restClient.getProductByEan(ean);
	}
}
