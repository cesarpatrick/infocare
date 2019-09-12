package biz.infocare;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xero.api.Config;
import com.xero.api.JsonConfig;
import com.xero.api.OAuthAccessToken;
import com.xero.example.TokenStorage;

import biz.infocare.service.InfoCareXeroService;

public class CallBackServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Config config = JsonConfig.getInstance();
	private TokenStorage storage = new TokenStorage();
	private OAuthAccessToken accessToken = new OAuthAccessToken(config);

	InfoCareXeroService infoCareXeroService = new InfoCareXeroService(config);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		try {
			// retrieve OAuth verifier code from callback URL param
			String verifier = request.getParameter("oauth_verifier");

			// Swap your temp token for 30 oauth token
			accessToken = new OAuthAccessToken(config);
			accessToken.build(verifier, storage.get(request, "tempToken"), storage.get(request, "tempTokenSecret"))
					.execute();

			System.out.printf(accessToken.getToken());
			System.out.printf(accessToken.getTokenSecret());

			if (!accessToken.isSuccess()) {
				storage.clear(response);
			} else {
				// DEMONSTRATION ONLY - Store in Cookie - you can extend TokenStorage
				// and implement the save() method for your database
				storage.save(response, accessToken.getAll());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
