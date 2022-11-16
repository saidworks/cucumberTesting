package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.RestaurantMenu;
import org.example.RestaurantMenuItem;

public class MenuManagementStepDefinitions {
    RestaurantMenuItem newMewnuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();
    @Given("I have a menu with name \"([^\"]*)\" and price ([$]*)(\\d+)$")
    public void i_have_a__menu_item_with_name_and_price(String newMenuItemName,String currencyType ,Integer price) {
        newMewnuItem = new RestaurantMenuItem(newMenuItemName,"",price);
        System.out.println("Step 1");
    }
    @When("I add that menu item")
    public void i_add_that_menu_item() {
        // Write code here that turns the phrase above into concrete actions
        locationMenu.add(newMewnuItem);
        System.out.println("Step 2");
    }
    @Then("Menu Item with name {string} should be added")
    public boolean doesItemExists(String item) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 3");
        for(RestaurantMenuItem menuItem:locationMenu.getMenu()){
            return menuItem.getNewMenuItemName().equals(item);
        }

        return false;
    }

}
