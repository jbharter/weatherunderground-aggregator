package com.kortware.wu.apiclient.view;

import com.kortware.wu.apiclient.model.Temperature;
import com.kortware.wu.apiclient.model.WU_Location;
import com.kortware.wu.apiclient.wuresponse.CurrentObservation;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class CurrentObservationView {

    private CurrentObservation currentObservation;

    private WU_Location observationLocation;
    private String stationId;
    private ZonedDateTime observationTime;
    private ZonedDateTime localTime;
    private String weather;
    private Temperature temperature;
    private String relativehumidity;
    private String windString;
    private String windDirection;
    // TODO Clean Wind
    // TODO Clean Pressure
    private Temperature dewpoint;
    private Temperature heatIndex;
    private Temperature windChill;
    private Temperature feelsLike;
    // TODO Clean viz
    private String solarRadiation;
    private String UV;
    // TODO Clean precip

    public CurrentObservationView(CurrentObservation currentObservation) {

        this.currentObservation = currentObservation;
        this.observationLocation = currentObservation.getObservation_location();
        this.stationId = currentObservation.getStation_id();
        this.observationTime = ZonedDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(currentObservation.getObservation_epoch())),TimeZone.getDefault().toZoneId());
        this.localTime = ZonedDateTime.ofInstant(Instant.ofEpochSecond(Long.parseLong(currentObservation.getLocal_epoch())),TimeZone.getDefault().toZoneId());
        this.weather = currentObservation.getWeather();
        this.temperature = Temperature.fromCelsius(currentObservation.getTemp_c());
        this.relativehumidity = currentObservation.getRelative_humidity();
        this.windString = currentObservation.getWind_string();
        this.windDirection = currentObservation.getWind_dir();
        this.dewpoint = Temperature.fromCelsius(currentObservation.getDewpoint_c());
        this.heatIndex = Temperature.fromCelsius(currentObservation.getHeat_index_c());
        this.windChill = Temperature.fromCelsius(currentObservation.getWindchill_c());
        this.feelsLike = Temperature.fromCelsius(currentObservation.getFeelslike_c());
        this.solarRadiation = currentObservation.getSolarradiation();
        this.UV = currentObservation.getUV();
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public WU_Location getObservationLocation() {
        return observationLocation;
    }

    public String getStationId() {
        return stationId;
    }

    public ZonedDateTime getObservationTime() {
        return observationTime;
    }

    public ZonedDateTime getLocalTime() {
        return localTime;
    }

    public String getWeather() {
        return weather;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public String getRelativehumidity() {
        return relativehumidity;
    }

    public String getWindString() {
        return windString;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public Temperature getDewpoint() {
        return dewpoint;
    }

    public Temperature getHeatIndex() {
        return heatIndex;
    }

    public Temperature getWindChill() {
        return windChill;
    }

    public Temperature getFeelsLike() {
        return feelsLike;
    }

    public String getSolarRadiation() {
        return solarRadiation;
    }

    public String getUV() {
        return UV;
    }
}
