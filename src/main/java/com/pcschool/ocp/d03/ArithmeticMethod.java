
package com.pcschool.ocp.d03;
import java.util.Random;

public class ArithmeticMethod {
       public static void main(String[] args) {
        char[] poker ="A234567890JQK".toCharArray();
          //洗牌
          for(int i =0;i<100;i++){
              
          
          Random r =new Random();
          int from = r.nextInt(poker.length);
          int to = r.nextInt(poker.length);
          char c = poker[from]; //先記住poker[0]的資料
          poker [from]= poker [to];//將poker[1]的資料給poker[0]
          poker[to]= c;          //最後將變數c的資料給poker[1]
          } 
        //列印
        for (char p :poker){
            System.out.print(p + " ");
        }
           System.out.println();
       }
}
         
           
    
    


