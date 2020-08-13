package com.pcschool.ocp.d03.FastFood;

public class Coca {

    private int price = 45;
    private static int amount = 100;
    public Coca(){
        amount--;
    }

    public int getPrice() {
        return price;
}
    public static int getAmount(){
        return amount;
    }
}
