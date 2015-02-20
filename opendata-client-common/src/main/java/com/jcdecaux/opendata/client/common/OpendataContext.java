package com.jcdecaux.opendata.client.common;

public class OpendataContext {

	public static final String OPENDATA_BASE_URL = "https://api.jcdecaux.com";

	public static final String API_KEY_PARAM = "apiKey";

	public final String apiKey;

	public OpendataContext(String apiKey) {
		this.apiKey = apiKey;
	}
}
