package com.kortware.wu.apiclient.model;

import java.util.Map;

public class WU_Image {

    private String url;
    private String title;
    private String link;

    public String getUrl() {
        return url;
    }

    public WU_Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WU_Image setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLink() {
        return link;
    }

    public WU_Image setLink(String link) {
        this.link = link;
        return this;
    }
}
