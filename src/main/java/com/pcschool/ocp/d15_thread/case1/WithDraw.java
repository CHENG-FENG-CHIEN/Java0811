
package com.pcschool.ocp.d15_thread.case1;


public class WithDraw implements Runnable{
    private Account account;
    private int money;

    public WithDraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.withdraw(money);
    }
    
    
    
}
