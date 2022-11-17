package org.example;

public class Bill {
    int totalBill = 0;
    String currency;
    public void addItem(int price, int qty){
        totalBill += price * qty;
    }
    public int getBill(){
        return totalBill;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String generateBill(){
        return "the total bill is : " + getBill() + getCurrency();
    }
}
