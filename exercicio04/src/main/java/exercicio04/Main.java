package exercicio04;

import java.io.IOException;
import com.google.gson.*;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Main {
	private static String key = "8a8c4c9e98a44cb78b401e872c5af09b";

	// location, also known as region.
	// required if you're using a multi-service or regional (not global) resource.
	// It can be found in the Azure portal on the Keys and Endpoint page.
	private static String location = "eastus";

	// Instantiates the OkHttpClient.
	OkHttpClient client = new OkHttpClient();

	// This function performs a POST request.
	public String Post() throws IOException {
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(
				"[{\"Text\": \"Flamengo is the best football team in the world!\"}]", mediaType);
		Request request = new Request.Builder()
				.url("https://api.cognitive.microsofttranslator.com/translate?api-version=3.0&from=en&to=fr,zu,pt-br,ru,it")
				.post(body).addHeader("Ocp-Apim-Subscription-Key", key)
				// location required if you're using a multi-service or regional (not global)
				// resource.
				.addHeader("Ocp-Apim-Subscription-Region", location).addHeader("Content-type", "application/json")
				.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	// This function prettifies the json response.
	public static String prettify(String json_text) {
		JsonElement json = JsonParser.parseString(json_text);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(json);
	}

	public static void main(String[] args) {
		try {
			Main translateRequest = new Main();
			String response = translateRequest.Post();
			System.out.println(prettify(response));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
