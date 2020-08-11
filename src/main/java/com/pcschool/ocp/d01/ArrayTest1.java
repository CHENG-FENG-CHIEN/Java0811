
package com.pcschool.ocp.d01;

public class ArrayTest1 {
    public static void main(String[] args) {
        int [] scores = {100,90,80,70};
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores.length);
            //求總和
            
        int sum = 0;
        for(int i = 0;i<scores.length;i++){
            sum += scores[i];   
        }
   
        System.out.println("總分: "+  sum);
        
        //平均
        double avg = sum/scores.length;
        System.out.println("平均:"+ sum/4);
       
        //求標準差
        
        double sum2 =0;
        for(int i = 0 ;i <scores.length;i++){
        sum2 += Math.pow(scores[i] - avg,2);
        
    }
        
        double sd = Math.sqrt ((1.0/scores.length)*sum2);
         System.out.printf("標準差: %.2f\n", sd);
         
         //變異係數
         
         double cv = sd /avg;
         System.out.printf("變異係數: %.2f\n" , cv);
}
}
