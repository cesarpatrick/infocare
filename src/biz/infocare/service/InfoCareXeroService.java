package biz.infocare.service;

import java.io.IOException;

import org.threeten.bp.OffsetDateTime;

import com.xero.api.ApiClient;
import com.xero.api.Config;
import com.xero.api.JsonConfig;
import com.xero.api.OAuthAccessToken;
import com.xero.api.client.AccountingApi;
import com.xero.example.TokenStorage;
import com.xero.models.accounting.Payments;

public class InfoCareXeroService extends AccountingApi{
	
	OffsetDateTime ifModifiedSince = null;
	Config config = JsonConfig.getInstance();
	TokenStorage storage = new TokenStorage();
	OAuthAccessToken accessToken = new OAuthAccessToken(config);
	String order = null;
	boolean includeArchived = false;
	String ids = null;
	String where = null;
	boolean summarizeErrors = false;
	
	public InfoCareXeroService(Config config) {
		super(config);
	}

	/**
	 * 
	 * @param dateStart format year,month,day (2019,08,30)
	 * @param dateEnd format year,month,day (2019,09,02)
	 * 
	 * */
	public Payments getPayments(String dateStart, String dateEnd) throws IOException {
		
		ApiClient apiClientForAccounting = new ApiClient(config.getApiUrl(), null, null, null);
		setApiClient(apiClientForAccounting);
		setOAuthToken(accessToken.getToken(), accessToken.getTokenSecret());
		
		where = "Date >= DateTime("+dateStart+") && Date <= DateTime("+dateEnd+")";
		Payments payments = getPayments(ifModifiedSince, where, order);	
		
		return payments;	
	}
	

}
