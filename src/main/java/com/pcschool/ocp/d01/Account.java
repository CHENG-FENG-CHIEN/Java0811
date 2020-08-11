package com.pcschool.ocp.d01;

public class Account {
    //存款
    private int balance;
    public void save(int money){
        if (money > 0){
        balance += money; //balacnce =balance + money
        }
    }
    //提款
public void withdraw (int money){
    if (money > 0 && balance >= money){
        balance -= money; //balacnce =balance - money
    }
}
//取得帳戶餘額
public int getBalance(){
    return balance ;
    
}
} 
