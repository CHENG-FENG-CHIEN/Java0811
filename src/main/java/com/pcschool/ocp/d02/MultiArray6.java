package com.pcschool.ocp.d02;


public class MultiArray6 {
    public static void main(String[] args) {
        int[] scores ={100,90,80};
        for(int i = 0;i<scores.length;i++){
            System.out.println(scores[i]+ " ");
        }
        System.out.println();
        
        for(int x : scores){
            System.out.println(x+ " ");
            
        }
        System.out.println();
    }
    
}
