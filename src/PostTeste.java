import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class PostTeste {

	public static void main(String[] args) throws Exception {

		CloseableHttpClient httpclient = HttpClients.createDefault();

		HttpPost httpPost = new HttpPost("http://jhun.fy.chaoxing.com/adminlogin/loginin");
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("userName", "vip"));
		nvps.add(new BasicNameValuePair("passWord", "secret"));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		CloseableHttpResponse response = httpclient.execute(httpPost);
		try {
			int code = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			if (code == 200) {
				HttpEntity entity2 = response.getEntity();
				String conent = EntityUtils.toString(entity2);
				System.out.println(conent.length());
			}
			EntityUtils.consume(entity);
		} finally {
			response.close();
		}

	}

}
