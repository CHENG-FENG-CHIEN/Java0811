
package com.pcschool.ocp.d09.case8;

import java.util.Arrays;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;


public class CycleArea {
    public static void main(String[] args) {
        Supplier<Double> pi = () -> Math.PI;  //Supplier
        
        int[] rs = {5,10,15,-4,20,0,-25};
        Arrays.stream(rs)
                .filter((r) -> r > 0) //Predicate   得到5,10,15,20
                .mapToDouble((r) -> r * r *pi.get()) //Function
                .forEach(area  -> System.out.println(area));   // Consumer 
        
        //ObjIntConsumer
        class Exam{
               int chinese;
               int english;
               
        }
        Exam exam = new Exam();
        exam.chinese = 100;
        exam.english = 80;
         ObjIntConsumer<Exam> ois = (e , values) -> {System.out.println((e.chinese+e.english)/2  >= values);}; 
         ois.accept(exam, 60);
        
    }
            
    
}
