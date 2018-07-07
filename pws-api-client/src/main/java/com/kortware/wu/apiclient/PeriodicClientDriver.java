package com.kortware.wu.apiclient;

import com.kortware.wu.apiclient.view.CurrentObservationView;
import com.kortware.wu.apiclient.wuresponse.PWSResponse;

import java.util.StringJoiner;
import java.util.TimerTask;

public class PeriodicClientDriver {



    public static void main(String[] args) {

        PeriodicWUAPIClient wuapiClient = new PeriodicWUAPIClient("<key>",10000L);

        PWSAPIClient pwsapiClient = new PWSAPIClient(wuapiClient, "<station>");



        wuapiClient.registerTimerTask(new TimerTask() {
            @Override
            public void run() {
                PWSResponse response = pwsapiClient.getPWSResponse();
                CurrentObservationView view = new CurrentObservationView(response.getCurrent_observation());

                StringJoiner joiner = new StringJoiner(" | ");

                joiner.add("SID [" + view.getStationId() + "]")
                      .add("OTM [" + view.getObservationTime().toString() + "]")
                      .add("CND [" + view.getWeather() + "]")
                      .add("TMP [" + view.getTemperature() + "]")
                      .add("HMD [" + view.getRelativehumidity() + "]")
                      .add("PRS [" + response.getCurrent_observation().getPressure_mb() + "]")
                      .add("HDX [" + view.getHeatIndex() + "]")
                      .add("FLK [" + view.getFeelsLike() + "]")
                      .add("UVZ [" + view.getUV() + "]")
                      .add("RAD [" + view.getSolarRadiation() + "]");

                System.out.println(joiner.toString());
            }
        });

    }
}
