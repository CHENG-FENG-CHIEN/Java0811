package com.pcschool.ocp.d03.FastFood;

public class Wings {

    private int price = 45;
    private static int amount = 100;
    public Wings(){
        amount--;
    }

    public int getPrice() {
        return price;
}
    public static int getAmount(){
        return amount;
    }
}
