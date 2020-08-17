package com.pcschool.ocp.d06.case2.salary;

public class Salary {
    private static  final int Base_MONEY =23800;
    private int money = 23800;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < Base_MONEY){
            money = Base_MONEY;
        }else{
            this.money =money;
            
        }
    }

}
