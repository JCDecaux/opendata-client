package com.jcdecaux.opendata.client.common;

public class OpendataContext {

	public static final String OPENDATA_BASE_URL = "https://api.jcdecaux.com";

	public static final String API_KEY_PARAM = "apiKey";

	public static Builder newBuilder() {
		return new Builder();
	}

	public String apiKey;

	public OpendataContext(String apiKey) {
		this.apiKey = apiKey;
	}

	public static class Builder {
		private String apiKey;

		public Builder apiKey(String apiKey) {
			this.apiKey = apiKey;
			return this;
		}

		public OpendataContext build() {
			if (apiKey == null)
				throw new IllegalArgumentException("apiKey must be defined.");

			return new OpendataContext(apiKey);
		}
	}
}
