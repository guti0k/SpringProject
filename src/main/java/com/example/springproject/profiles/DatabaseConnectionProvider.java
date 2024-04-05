package com.example.springproject.profiles;

public class DatabaseConnectionProvider {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DatabaseConnectionProvider(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DatabaseConnectionProvider{" +
                "url='" + url + '\'' +
                '}';
    }
}
