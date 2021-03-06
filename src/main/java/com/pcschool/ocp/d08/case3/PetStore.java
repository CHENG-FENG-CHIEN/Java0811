package com.pcschool.ocp.d08.case3;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;


public class PetStore {
    public static void main(String[] args) {
        Pet[] pets = {new EDog(),new Yorkshire(),new Chihuahua(),new Persian()};
        
        
        //狗都吃哪些東西???
        Arrays.stream(pets)
                .filter(p -> p instanceof Dog)
                .forEach(p -> p.eat());
        System.out.println("------------------------");
        //貓都吃哪些東西???
         Arrays.stream(pets)
                .filter(p -> p instanceof Cat)
                .forEach(p -> p.eat());
         //寵物的腿有幾隻?
         //int ammount = pets.length;
         long ammount = Arrays.stream(pets).count();
         System.out.println(ammount * Pet.legs);
        
   
    }
   
    
}
