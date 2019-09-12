package biz.infocare.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.ws.rs.core.UriBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xero.api.ApiClient;
import com.xero.api.Config;
import com.xero.api.ConfigBasedSignerFactory;
import com.xero.api.JSONUtils;
import com.xero.api.JsonConfig;
import com.xero.api.OAuthRequestResource;
import com.xero.api.SignerFactory;
import com.xero.api.XeroApiException;
import com.xero.api.XeroClient;
import com.xero.api.exception.XeroExceptionHandler;

import biz.infocare.model.payroll.PaySlip;

public class PayRollApi {
    private ApiClient apiClient;
    private XeroExceptionHandler xeroExceptionHandler;
    private Config config;
    private SignerFactory signerFactory;
    private String token = null;
    private String tokenSecret = null;
    final static Logger logger = LogManager.getLogger(XeroClient.class);
    protected static final DateFormat utcFormatter;
    
	private static String PAYROLL_API_URL = "https://api.xero.com/payroll.xro/2.0/";

    static {
        utcFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    protected static final Pattern MESSAGE_PATTERN = Pattern.compile("<Message>(.*)</Message>");
   
    
    public PayRollApi(Config config) {
        this(config, new ConfigBasedSignerFactory(config));
        this.xeroExceptionHandler = new XeroExceptionHandler();
    }

    public PayRollApi(Config config, SignerFactory signerFactory) {
        this.config = config;
        this.signerFactory = signerFactory;
        this.xeroExceptionHandler = new XeroExceptionHandler();
    }

    public PayRollApi(ApiClient apiClient) {
        this(JsonConfig.getInstance());
        this.xeroExceptionHandler = new XeroExceptionHandler();
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setOAuthToken(String token, String tokenSecret) {
        this.token = token;
        this.tokenSecret = tokenSecret;
    }

    
    protected String DATA(String url, String body, Map<String, String> params, String method) throws IOException {
        return this.DATA(url,body,params,method,null, "application/json");
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, OffsetDateTime ifModifiedSince) throws IOException {
        return this.DATA(url,body,params,method,ifModifiedSince,"application/json");
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, String contentType) throws IOException {
        return this.DATA(url,body,params,method,null,contentType);
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, OffsetDateTime ifModifiedSince, String contentType) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            contentType,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        if (ifModifiedSince != null) {
            req.setIfModifiedSince(ifModifiedSince);
        }

        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, String xeroApplicationId, String xeroTenantId, String xeroUserId) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            null,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        //if (ifModifiedSince != null) {
        //    req.setIfModifiedSince(ifModifiedSince);
        //}

        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

   
    protected ByteArrayInputStream FILE(String url, String body, Map<String, String> params, String method) throws IOException {
       return this.FILE(url,body,params,method,"application/octet-stream");
    }

    protected ByteArrayInputStream FILE(String url, String body, Map<String, String> params, String method, String accept) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            accept,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        try {
            ByteArrayInputStream resp = req.executefile();
            return resp;
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

    protected String FILE(String url, String body, Map<String, String> params, String method, byte[] byteBody) throws IOException {
        return this.FILE(url,body,params,method,byteBody,"application/octet-stream");
    }
    
    protected String FILE(String url, String body, Map<String, String> params, String method, byte[] byteBody, String contentType) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method,
            contentType,
            byteBody, 
            params,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
       
        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }
    
    public PaySlip createPaySlip(PaySlip paySlip) throws IOException {
        try {
            String strBody = null;
            Map<String, String> params = null;
            String correctPath = "/paySlips";
            
            UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
            String url = uriBuilder.build().toString();
           
            strBody = apiClient.getObjectMapper().writeValueAsString(paySlip);
            strBody.toString();
            String response = this.DATA(url, strBody, params, "PUT");

            TypeReference<PaySlip> typeRef = new TypeReference<PaySlip>() {};
            return apiClient.getObjectMapper().readValue(response, typeRef);           

        } catch (IOException e) {
            throw xeroExceptionHandler.handleBadRequest(e.getMessage());
        } catch (XeroApiException e) {
            throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
        }
    }
    
    public PaySlip getPaySlip(UUID paySlipID) throws IOException {
        try {
            String strBody = null;
            Map<String, String> params = null;
            String correctPath = "paySlips/{PaySlipID}";
            
            // create a map of path variables
            final Map<String, String> uriVariables = new HashMap<String, String>();
            uriVariables.put("PaySlipID", paySlipID.toString());
            UriBuilder uriBuilder = UriBuilder.fromUri(PAYROLL_API_URL + correctPath);
            String url = uriBuilder.buildFromMap(uriVariables).toString();

            String response = this.DATA(url, strBody, params, "GET");

            TypeReference<PaySlip> typeRef = new TypeReference<PaySlip>() {};
            return apiClient.getObjectMapper().readValue(response, typeRef);           

        } catch (IOException e) {
            throw xeroExceptionHandler.handleBadRequest(e.getMessage());
        } catch (XeroApiException e) {
            throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
        }
    }

}


