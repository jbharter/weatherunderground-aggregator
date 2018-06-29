package com.kortware.wu.apiclient.model;

public class WU_Location {

    private String full;
    private String city;
    private String state;
    private String state_name;
    private String country;
    private String country_iso3166;
    private String zip;
    private String magic;
    private String wmo;
    private String latitude;
    private String longitude;
    private String elevation;

    public String getFull() {
        return full;
    }

    public WU_Location setFull(String full) {
        this.full = full;
        return this;
    }

    public String getCity() {
        return city;
    }

    public WU_Location setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public WU_Location setState(String state) {
        this.state = state;
        return this;
    }

    public String getState_name() {
        return state_name;
    }

    public WU_Location setState_name(String state_name) {
        this.state_name = state_name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public WU_Location setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountry_iso3166() {
        return country_iso3166;
    }

    public WU_Location setCountry_iso3166(String country_iso3166) {
        this.country_iso3166 = country_iso3166;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public WU_Location setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getMagic() {
        return magic;
    }

    public WU_Location setMagic(String magic) {
        this.magic = magic;
        return this;
    }

    public String getWmo() {
        return wmo;
    }

    public WU_Location setWmo(String wmo) {
        this.wmo = wmo;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public WU_Location setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public WU_Location setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getElevation() {
        return elevation;
    }

    public WU_Location setElevation(String elevation) {
        this.elevation = elevation;
        return this;
    }
}
