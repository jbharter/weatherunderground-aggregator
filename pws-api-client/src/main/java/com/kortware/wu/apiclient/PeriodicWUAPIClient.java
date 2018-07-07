package com.kortware.wu.apiclient;

import java.util.Timer;
import java.util.TimerTask;

public class PeriodicWUAPIClient implements WUAPIClient {

    private String apiKey;

    private Long millis;

    private Timer timer = new Timer("periodic-task-daemon", false);

    public PeriodicWUAPIClient(String apiKey, Long periodMillis) {

        this.apiKey = apiKey;
        this.millis = periodMillis;
    }

    @Override
    public String getAPIKey() {

        return this.apiKey;
    }

    @Override
    public void setAPIKey(String APIKey) {

        this.apiKey = APIKey;
    }

    public void registerTimerTask(TimerTask timerTask) {
        registerPeriodicTask(timerTask, millis);
    }

    public void registerPeriodicTask(TimerTask timerTask, Long periodMillis) {
        timer.scheduleAtFixedRate(timerTask,0L, periodMillis);
    }
}
