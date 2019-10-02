package com.saga.demo.jwt.usuario;

import java.util.List;

public class Menu {
    private List<MenuItem> menu;

    public Menu() {
    }

    public Menu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
}
