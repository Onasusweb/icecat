package edw.icecat.ws;

import java.io.IOException;
import java.io.StringReader;
import java.text.MessageFormat;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXB;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import edw.icecat.ws.response.ICECATInterface;

@Component
public class RestClient extends RestTemplate implements ResponseErrorHandler {

	@Value("#{icecatProperties.ICECAT_USER}")
	public String username;

	@Value("#{icecatProperties.ICECAT_PASS}")
	public String password;

	@Value("#{icecatProperties.ICECAT_PROD_BY_PARTN_URL}")
	public String ICECAT_PROD_BY_PARTN_URL;

	@Value("#{icecatProperties.ICECAT_PROD_BY_EAN_URL}")
	public String ICECAT_PROD_BY_EAN_URL;

	@Value("#{icecatProperties.ICECAT_PROD_BY_ID_URL}")
	public String ICECAT_PROD_BY_ID_URL;
	
	@PostConstruct
	public void init() {
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(new AuthScope(null, -1), new UsernamePasswordCredentials(username, password));
		HttpClient httpClient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();
		setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
		// setErrorHandler(this);
	}

	public ICECATInterface getProductById(String icecatId) {
		String url = MessageFormat.format(ICECAT_PROD_BY_ID_URL, icecatId);
		logger.info("Downloading xml from  " + url);
		try {
			ICECATInterface result = getForObject(url, ICECATInterface.class);
			return result;
		} catch (HttpClientErrorException e) {
			if ( HttpStatus.NOT_FOUND.equals(e.getStatusCode())) {
				String body = e.getResponseBodyAsString();
				ICECATInterface wsResponse = JAXB.unmarshal(new StringReader(body), ICECATInterface.class);
				if ( wsResponse.getProduct() != null && wsResponse.getProduct().getMapProductId() != null ) {
					return getProductById(wsResponse.getProduct().getMapProductId().toString());
				}
				logger.error("Error fetching product: " + wsResponse.getProduct().getErrorMessage());
				return null;
			}
			throw e;
		}
	}

	public ICECATInterface getProductByPartNumber(String partNumber, String vendor) {
		String url = MessageFormat.format(ICECAT_PROD_BY_PARTN_URL, partNumber, vendor);
		logger.info("Downloading xml from  " + url);
		return getForObject(url, ICECATInterface.class);
	}

	public ICECATInterface getProductByEan(String ean) {
		String url = MessageFormat.format(ICECAT_PROD_BY_EAN_URL, ean);
		logger.info("Downloading xml from  " + url);
		return getForObject(url, ICECATInterface.class);
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return true;
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
	}

}