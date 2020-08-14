
package com.pcschool.ocp.d04;

public class Car {
    private  static String brandname = "Toyota"; //車商
    private String typename ="Altis"; //車款
    
    public void printCar(){
        System.out.println(brandname );
        System.out.println(typename);
    }
    public static void printCar2(){
        System.out.println(brandname);
       
    }
       public static void printCar3(){
        System.out.println(brandname);
       Car car = new Car();
           System.out.println(car.typename);
    }
   
    
    
}

