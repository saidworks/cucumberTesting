package org.example.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Bill;

public class DataTablesSteps {
    Bill bill = new Bill();
    @Given("I placed an order for the following {string} with {int} and {int} {string}")
    public void i_placed_an_order_for_the_following_with_and(String string, Integer quantity, Integer price,String currency) {
        // Write code here that turns the phrase above into concrete actions
        bill.setCurrency(currency);
        bill.addItem(price,quantity);
    }
    @When("I generate the bill")
    public void i_generate_the_bill() {
        bill.getBill();
    }
    @Then("a bill for ${int} should be generated")
    public void a_bill_for_$_should_be_generated(Integer int1) {
        System.out.println(bill.generateBill());
    }
}
