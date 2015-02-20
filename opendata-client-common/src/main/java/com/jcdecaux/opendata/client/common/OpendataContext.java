package com.jcdecaux.opendata.client.common;

public class OpendataContext {

	public static final String OPENDATA_BASE_URL = "https://api.jcdecaux.com";

	public static final String API_KEY_PARAM = "apiKey";

	public static Builder newBuilder() {
		return new Builder();
	}

	public final String apiKey;

	public final boolean hasProxy;

	public final String proxyHost;

	public final int proxyPort;

	public OpendataContext(String apiKey, String proxyHost, int proxyPort) {
		this.apiKey = apiKey;
		this.proxyHost = proxyHost;
		this.proxyPort = proxyPort;

		this.hasProxy = proxyHost != null && proxyPort != 0;
	}

	public static class Builder {
		private String apiKey;
		private String proxyHost;
		private int proxyPort;

		public Builder apiKey(String apiKey) {
			if (apiKey == null)
				throw new NullPointerException();
			this.apiKey = apiKey;
			return this;
		}

		public Builder proxy(String proxyHost, int proxyPort) {
			if (proxyHost != null && proxyPort != 0) {
				this.proxyHost = proxyHost;
				this.proxyPort = proxyPort;
			}
			return this;
		}

		public OpendataContext build() {
			if (apiKey == null)
				throw new IllegalArgumentException("apiKey must be defined.");

			return new OpendataContext(apiKey, proxyHost, proxyPort);
		}
	}
}
