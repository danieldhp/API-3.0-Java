package cieloecommerce.sdk.ecommerce.request;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.QueryMerchantOrderResponse;

/**
 * Query a Sale by it's Merchant Order Id to retrieve Cielo's paymentId
 */
public class QueryMerchantOrderRequest extends AbstractSaleRequest<String, QueryMerchantOrderResponse> {
	public QueryMerchantOrderRequest(Merchant merchant, Environment environment) {
		super(merchant, environment);
	}

	@Override
	public QueryMerchantOrderResponse execute(String merchnatOrderId) throws IOException, CieloRequestException {
		String url = environment.getApiQueryURL() + "1/sales?merchantOrderId=" + merchnatOrderId;

		HttpGet request = new HttpGet(url);
		CloseableHttpResponse response = sendRequest(request);

		return readResponse(response, QueryMerchantOrderResponse.class);
	}

}
