
package com.pcschool.ocp.d11_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 100);
        exams.put("數學", 90);
        System.out.println(exams+"\n");
        //走訪元素
        System.out.println(exams.get("國文"));
        System.out.println(exams.get("英文"));
        System.out.println(exams.get("數學")+"\n");
        //走訪元素2
        System.out.println("走訪元素2-------------------------------");
        Set<String> keys = exams.keySet();
        for(String key :keys){
            System.out.println(exams.get(key));
        //走訪元素3
        System.out.println("走訪元素3-------------------------------");
        Set<Entry<String,Integer>> entrySet =  exams.entrySet();
        for(Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
            System.out.println();
            
            //走訪元素4(可以利用 iterator.remove() 移除元素)
            System.out.println("走訪元素4-------------------------------");
            Iterator<Map.Entry<String,Integer>> iterator =  exams.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<String, Integer> entry  = iterator.next();
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
            System.out.println();
            
        }
        //走訪元素5 (java8)
        System.out.println("走訪元素5-------------------------------");
        exams.forEach((key,value) -> System.out.println(key+":"+value));
        System.out.println();
        //走訪元素6 (java8 stream api)
        System.out.println("走訪元素6-------------------------------");
           exams.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
           System.out.println();
    }   
}
