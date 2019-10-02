package com.saga.demo.jwt.elementos;

public class Enlace {

    private String value;
    private String uri;
    private boolean blank;

    public Enlace() {
    }

    public Enlace(String value, String uri, boolean blank) {
        this.value = value;
        this.uri = uri;
        this.blank = blank;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Enlace value(String value) {
        this.setValue(value);
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Enlace uri(String uri) {
        this.setUri(uri);
        return this;
    }

    public boolean getBlank() {
        return blank;
    }

    public void setBlank(boolean blank) {
        this.blank = blank;
    }

    public Enlace blank(boolean blank) {
        this.setBlank(blank);
        return this;
    }


}
