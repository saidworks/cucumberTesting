package org.example;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {


    private List<RestaurantMenuItem> menu = new ArrayList<>();
    public void add(RestaurantMenuItem item){
        menu.add(item);
    }
    public List<RestaurantMenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<RestaurantMenuItem> menu) {
        this.menu = menu;
    }
}
