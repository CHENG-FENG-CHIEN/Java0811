package com.pcschool.ocp.d03.FastFood;

public class Combine {

    Leg[] legs;
    Breast[] breasts;
    Wings[] wingses;
    Coca[] cocas;
    private int price;

    public Combine(int legCount, int breastCount, int wingsCount, int cocaCount) {
        legs = new Leg[legCount];
        breasts = new Breast[breastCount];
        wingses = new Wings[wingsCount];
        cocas = new Coca[cocaCount];
        for (int i = 0; i < legs.length; i++) {
            legs[i] = new Leg();
            price += legs[i].getPrice();
        }
        for (int i = 0; i < breasts.length; i++) {
            breasts[i] = new Breast();
            price += breasts[i].getPrice();
        }
        for (int i = 0; i < wingses.length; i++) {
            wingses[i] = new Wings();
            price += wingses[i].getPrice();
        }
        for (int i = 0; i < cocas.length; i++) {
            cocas[i] = new Coca();
            price += cocas[i].getPrice();
        }

    }

    public int getPrice() {
        return price;
    }

}
