package com.kortware.wu.apiclient.wuresponse;

import com.kortware.wu.apiclient.model.WU_Image;
import com.kortware.wu.apiclient.model.WU_Location;

public class CurrentObservation {

    private WU_Image image;
    private WU_Location display_location;
    private WU_Location observation_location;

    // <!-- don't know what this is yet
    private Object estimated;
    // -->

    private String station_id;

    // Time details
    private String observation_time;
    private String observation_time_rfc822;
    private String observation_epoch;
    private String local_time_rfc822;
    private String local_epoch;
    private String local_tz_short;
    private String local_tz_long;
    private String local_tz_offset;
    // Basic Weather Details
    private String weather;
    private String temperature_string;
    private Double temp_f;
    private Double temp_c;
    private String relative_humidity;
    // Wind
    private String wind_string;
    private String wind_dir;
    private Double wind_degrees;
    private Double wind_mph;
    private Double wind_gust_mph;
    private Double wind_kph;
    private Double wind_gust_kph;
    // Pressure
    private String pressure_mb;
    private String pressure_in;
    private String pressure_trend;
    // Dewpoint
    private String dewpoint_string;
    private Double dewpoint_f;
    private Double dewpoint_c;
    // Heat Index
    private String heat_index_string;
    private String heat_index_f;
    private String heat_index_c;
    // Windchill
    private String windchill_string;
    private String windchill_f;
    private String windchill_c;
    // Feelslike
    private String feelslike_string;
    private String feelslike_f;
    private String feelslike_c;
    // Visibility
    private String visibility_mi;
    private String visibility_km;
    // Solar
    private String solarradiation;
    private String UV;
    // Precipitation
    private String precip_1hr_string;
    private String precip_1hr_in;
    private String precip_1hr_metric;
    private String precip_today_string;
    private String precip_today_in;
    private String precip_today_metric;
    // misc
    private String icon;
    private String icon_url;
    private String forecast_url;
    private String history_url;
    private String ob_url;
    private String nowcast;

    public WU_Image getImage() {
        return image;
    }

    public CurrentObservation setImage(WU_Image image) {
        this.image = image;
        return this;
    }

    public WU_Location getDisplay_location() {
        return display_location;
    }

    public CurrentObservation setDisplay_location(WU_Location display_location) {
        this.display_location = display_location;
        return this;
    }

    public WU_Location getObservation_location() {
        return observation_location;
    }

    public CurrentObservation setObservation_location(WU_Location observation_location) {
        this.observation_location = observation_location;
        return this;
    }

    public Object getEstimated() {
        return estimated;
    }

    public CurrentObservation setEstimated(Object estimated) {
        this.estimated = estimated;
        return this;
    }

    public String getStation_id() {
        return station_id;
    }

    public CurrentObservation setStation_id(String station_id) {
        this.station_id = station_id;
        return this;
    }

    public String getObservation_time() {
        return observation_time;
    }

    public CurrentObservation setObservation_time(String observation_time) {
        this.observation_time = observation_time;
        return this;
    }

    public String getObservation_time_rfc822() {
        return observation_time_rfc822;
    }

    public CurrentObservation setObservation_time_rfc822(String observation_time_rfc822) {
        this.observation_time_rfc822 = observation_time_rfc822;
        return this;
    }

    public String getObservation_epoch() {
        return observation_epoch;
    }

    public CurrentObservation setObservation_epoch(String observation_epoch) {
        this.observation_epoch = observation_epoch;
        return this;
    }

    public String getLocal_time_rfc822() {
        return local_time_rfc822;
    }

    public CurrentObservation setLocal_time_rfc822(String local_time_rfc822) {
        this.local_time_rfc822 = local_time_rfc822;
        return this;
    }

    public String getLocal_epoch() {
        return local_epoch;
    }

    public CurrentObservation setLocal_epoch(String local_epoch) {
        this.local_epoch = local_epoch;
        return this;
    }

    public String getLocal_tz_short() {
        return local_tz_short;
    }

    public CurrentObservation setLocal_tz_short(String local_tz_short) {
        this.local_tz_short = local_tz_short;
        return this;
    }

    public String getLocal_tz_long() {
        return local_tz_long;
    }

    public CurrentObservation setLocal_tz_long(String local_tz_long) {
        this.local_tz_long = local_tz_long;
        return this;
    }

    public String getLocal_tz_offset() {
        return local_tz_offset;
    }

    public CurrentObservation setLocal_tz_offset(String local_tz_offset) {
        this.local_tz_offset = local_tz_offset;
        return this;
    }

    public String getWeather() {
        return weather;
    }

    public CurrentObservation setWeather(String weather) {
        this.weather = weather;
        return this;
    }

    public String getTemperature_string() {
        return temperature_string;
    }

    public CurrentObservation setTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
        return this;
    }

    public Double getTemp_f() {
        return temp_f;
    }

    public CurrentObservation setTemp_f(Double temp_f) {
        this.temp_f = temp_f;
        return this;
    }

    public Double getTemp_c() {
        return temp_c;
    }

    public CurrentObservation setTemp_c(Double temp_c) {
        this.temp_c = temp_c;
        return this;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public CurrentObservation setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
        return this;
    }

    public String getWind_string() {
        return wind_string;
    }

    public CurrentObservation setWind_string(String wind_string) {
        this.wind_string = wind_string;
        return this;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public CurrentObservation setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
        return this;
    }

    public Double getWind_degrees() {
        return wind_degrees;
    }

    public CurrentObservation setWind_degrees(Double wind_degrees) {
        this.wind_degrees = wind_degrees;
        return this;
    }

    public Double getWind_mph() {
        return wind_mph;
    }

    public CurrentObservation setWind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
        return this;
    }

    public Double getWind_gust_mph() {
        return wind_gust_mph;
    }

    public CurrentObservation setWind_gust_mph(Double wind_gust_mph) {
        this.wind_gust_mph = wind_gust_mph;
        return this;
    }

    public Double getWind_kph() {
        return wind_kph;
    }

    public CurrentObservation setWind_kph(Double wind_kph) {
        this.wind_kph = wind_kph;
        return this;
    }

    public Double getWind_gust_kph() {
        return wind_gust_kph;
    }

    public CurrentObservation setWind_gust_kph(Double wind_gust_kph) {
        this.wind_gust_kph = wind_gust_kph;
        return this;
    }

    public String getPressure_mb() {
        return pressure_mb;
    }

    public CurrentObservation setPressure_mb(String pressure_mb) {
        this.pressure_mb = pressure_mb;
        return this;
    }

    public String getPressure_in() {
        return pressure_in;
    }

    public CurrentObservation setPressure_in(String pressure_in) {
        this.pressure_in = pressure_in;
        return this;
    }

    public String getPressure_trend() {
        return pressure_trend;
    }

    public CurrentObservation setPressure_trend(String pressure_trend) {
        this.pressure_trend = pressure_trend;
        return this;
    }

    public String getDewpoint_string() {
        return dewpoint_string;
    }

    public CurrentObservation setDewpoint_string(String dewpoint_string) {
        this.dewpoint_string = dewpoint_string;
        return this;
    }

    public Double getDewpoint_f() {
        return dewpoint_f;
    }

    public CurrentObservation setDewpoint_f(Double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
        return this;
    }

    public Double getDewpoint_c() {
        return dewpoint_c;
    }

    public CurrentObservation setDewpoint_c(Double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
        return this;
    }

    public String getHeat_index_string() {
        return heat_index_string;
    }

    public CurrentObservation setHeat_index_string(String heat_index_string) {
        this.heat_index_string = heat_index_string;
        return this;
    }

    public String getHeat_index_f() {
        return heat_index_f;
    }

    public CurrentObservation setHeat_index_f(String heat_index_f) {
        this.heat_index_f = heat_index_f;
        return this;
    }

    public String getHeat_index_c() {
        return heat_index_c;
    }

    public CurrentObservation setHeat_index_c(String heat_index_c) {
        this.heat_index_c = heat_index_c;
        return this;
    }

    public String getWindchill_string() {
        return windchill_string;
    }

    public CurrentObservation setWindchill_string(String windchill_string) {
        this.windchill_string = windchill_string;
        return this;
    }

    public String getWindchill_f() {
        return windchill_f;
    }

    public CurrentObservation setWindchill_f(String windchill_f) {
        this.windchill_f = windchill_f;
        return this;
    }

    public String getWindchill_c() {
        return windchill_c;
    }

    public CurrentObservation setWindchill_c(String windchill_c) {
        this.windchill_c = windchill_c;
        return this;
    }

    public String getFeelslike_string() {
        return feelslike_string;
    }

    public CurrentObservation setFeelslike_string(String feelslike_string) {
        this.feelslike_string = feelslike_string;
        return this;
    }

    public String getFeelslike_f() {
        return feelslike_f;
    }

    public CurrentObservation setFeelslike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
        return this;
    }

    public String getFeelslike_c() {
        return feelslike_c;
    }

    public CurrentObservation setFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
        return this;
    }

    public String getVisibility_mi() {
        return visibility_mi;
    }

    public CurrentObservation setVisibility_mi(String visibility_mi) {
        this.visibility_mi = visibility_mi;
        return this;
    }

    public String getVisibility_km() {
        return visibility_km;
    }

    public CurrentObservation setVisibility_km(String visibility_km) {
        this.visibility_km = visibility_km;
        return this;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public CurrentObservation setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
        return this;
    }

    public String getUV() {
        return UV;
    }

    public CurrentObservation setUV(String UV) {
        this.UV = UV;
        return this;
    }

    public String getPrecip_1hr_string() {
        return precip_1hr_string;
    }

    public CurrentObservation setPrecip_1hr_string(String precip_1hr_string) {
        this.precip_1hr_string = precip_1hr_string;
        return this;
    }

    public String getPrecip_1hr_in() {
        return precip_1hr_in;
    }

    public CurrentObservation setPrecip_1hr_in(String precip_1hr_in) {
        this.precip_1hr_in = precip_1hr_in;
        return this;
    }

    public String getPrecip_1hr_metric() {
        return precip_1hr_metric;
    }

    public CurrentObservation setPrecip_1hr_metric(String precip_1hr_metric) {
        this.precip_1hr_metric = precip_1hr_metric;
        return this;
    }

    public String getPrecip_today_string() {
        return precip_today_string;
    }

    public CurrentObservation setPrecip_today_string(String precip_today_string) {
        this.precip_today_string = precip_today_string;
        return this;
    }

    public String getPrecip_today_in() {
        return precip_today_in;
    }

    public CurrentObservation setPrecip_today_in(String precip_today_in) {
        this.precip_today_in = precip_today_in;
        return this;
    }

    public String getPrecip_today_metric() {
        return precip_today_metric;
    }

    public CurrentObservation setPrecip_today_metric(String precip_today_metric) {
        this.precip_today_metric = precip_today_metric;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public CurrentObservation setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public CurrentObservation setIcon_url(String icon_url) {
        this.icon_url = icon_url;
        return this;
    }

    public String getForecast_url() {
        return forecast_url;
    }

    public CurrentObservation setForecast_url(String forecast_url) {
        this.forecast_url = forecast_url;
        return this;
    }

    public String getHistory_url() {
        return history_url;
    }

    public CurrentObservation setHistory_url(String history_url) {
        this.history_url = history_url;
        return this;
    }

    public String getOb_url() {
        return ob_url;
    }

    public CurrentObservation setOb_url(String ob_url) {
        this.ob_url = ob_url;
        return this;
    }

    public String getNowcast() {
        return nowcast;
    }

    public CurrentObservation setNowcast(String nowcast) {
        this.nowcast = nowcast;
        return this;
    }
}
