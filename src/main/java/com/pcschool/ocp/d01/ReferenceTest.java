
package com.pcschool.ocp.d01;


public class ReferenceTest {
     public static void main(String[] args) {
        String s1 = new String("Java");
        String s2= s1;
        System.out.println("s1");
        System.out.println("s2");
        
         String s3 = "Hello";
         append(s3);
    
}
     public static void append(String s){
         s =s +"Java";
         System.out.println(s);
         
     }
}
    


