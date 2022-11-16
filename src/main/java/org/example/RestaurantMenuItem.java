package org.example;

public class RestaurantMenuItem {

    private String newMenuItemName;
    private String description;
    private Integer price;
    public RestaurantMenuItem(String newMenuItemName, String description, Integer price) {
        this.newMenuItemName = newMenuItemName;
        this.description = description;
        this.price = price;
    }



    public String getNewMenuItemName() {
        return newMenuItemName;
    }

    public void setNewMenuItemName(String newMenuItemName) {
        this.newMenuItemName = newMenuItemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
