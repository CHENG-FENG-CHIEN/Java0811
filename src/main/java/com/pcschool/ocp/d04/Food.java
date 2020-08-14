
package com.pcschool.ocp.d04;
import java.util.Random;

public class Food {
    public static String name;
    private int amount =100 ;
    private int price ;
    
    static{
           int n = new Random().nextInt(10);
           if(n %2 ==0 )
               name ="餅乾";
           else
               name ="糖水";
           
           
    
    }
    
    
    //物件共同初始區段
    {
      int n = new Random().nextInt();
      price = n%2 ==0 ? 100:50;
    
    }

    public Food() {
    }
     public Food( int amount) {
         this.amount=amount;
    }
    
    

    
    
    
    
    
    
    
    
    public String toString() {
        return "Food{" + "amount=" + amount + ", price=" + price + '}';
    }

    
}
