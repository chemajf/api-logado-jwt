package com.saga.demo.jwt.usuario;

import java.util.List;

public class MenuItem {
    private String name;
    private String uri;
    private List<MenuItem> children;

    public MenuItem() {
    }

    public MenuItem(String name, String uri, List<MenuItem> children) {
        this.name = name;
        this.uri = uri;
        this.children = children;
    }

    public MenuItem(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItem name(String name) {
        this.setName(name);
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public MenuItem uri(String uri) {
        this.setUri(uri);
        return this;
    }

    public List<MenuItem> getChildren() {
        return children;
    }

    public void setChildren(List<MenuItem> children) {
        this.children = children;
    }

    public MenuItem children(List<MenuItem> children) {
        this.setChildren(children);
        return this;
    }

}
