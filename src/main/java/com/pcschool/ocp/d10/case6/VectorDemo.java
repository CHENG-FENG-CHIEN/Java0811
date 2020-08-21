
package com.pcschool.ocp.d10.case6;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws Exception {
        Vector<Integer> v = new Vector<>(25,5); //假設超過 每次加五 不 X2
        for(int i=1;i<=25;i++){
            v.add(new Random().nextInt(100));
          
        System.out.printf("capacity: %d size %02d  %s\n",v.capacity(),v.size(),v);
       Thread.sleep(1000);
        }
    }
    
}
