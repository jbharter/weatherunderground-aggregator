package com.kortware.wu.apiclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kortware.wu.apiclient.wuresponse.PWSResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * A client for retrieving details from one PWS in particular
 */
public class PWSAPIClient {

    private WUAPIClient wuapiClient;

    private OkHttpClient httpClient;

    private String pwsID;

    private Gson gson;

    public PWSAPIClient(WUAPIClient wuapiClient, String pwsStationID) {

        this.wuapiClient = wuapiClient;
        this.pwsID = pwsStationID;
        this.httpClient = new OkHttpClient();
        this.gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
    }

    private Supplier<Request> newRequest = () -> new Request.Builder()
            .url("http://api.wunderground.com/api/" + wuapiClient.getAPIKey() + "/conditions/q/pws:" + pwsID + ".json")
            .get()
            .build();



    public PWSResponse getPWSResponse() {

        Response response = null;
        try {
            response = httpClient.newCall(newRequest.get()).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response != null && response.isSuccessful() && response.body() != null) {

            return gson.fromJson(response.body().charStream(), PWSResponse.class);
        }
        return null;
    }

    public static void main(String[] args) {

        WUAPIClient client = new WUAPIClient() {
            private String key = "<WU API Key Here>";
            @Override
            public String getAPIKey() {
                return key;
            }

            @Override
            public void setAPIKey(String APIKey) {
                this.key = APIKey;
            }
        };

        PWSAPIClient pwsapiClient = new PWSAPIClient(client, "<WU Station ID>");

        PWSResponse response = pwsapiClient.getPWSResponse();

    }

}
