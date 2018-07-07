package com.kortware.wu.apiclient;

public class SimpleWUAPIClient implements WUAPIClient {

    private String apiKey;

    public SimpleWUAPIClient(String apiKey) {

        this.apiKey = apiKey;
    }

    @Override
    public String getAPIKey() {

        return this.apiKey;
    }

    @Override
    public void setAPIKey(String APIKey) {

        this.apiKey = APIKey;
    }
}
