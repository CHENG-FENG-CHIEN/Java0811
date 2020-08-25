
package com.pcschool.ocp.d15_thread.case1;


public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        WithDraw w1 = new WithDraw(account, 5000);
        WithDraw w2 = new WithDraw(account, 3000);
        WithDraw w3 = new WithDraw(account, 4000);
        Thread t1 = new Thread(w1,"小名");
        Thread t2 = new Thread(w2,"小安");
        Thread t3 = new Thread(w3,"小華");
        t1.start();
        t2.start();
        t3.start();
        
    }
            
    
}
