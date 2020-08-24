
package com.pcschool.ocp.d11_map;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class MapDemo6 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("蘋果", "蘋果", "香蕉", "蘋果", "柳丁", "香蕉", "椰子");
        /*
            如何撰寫一個根據數量作為key值的 groupingBy 群組程式，讓其分類結果變成一個 Map，其結果如下：
            {1=[柳丁, 椰子], 2=[香蕉], 3=[蘋果]}
        */
                                 System.out.println(
                items.stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet()
                    .stream()
                    .collect(Collectors.groupingBy(Entry::getValue,
                           mapping(Entry::getKey,toSet()))));
                                 
                                 
                                 
                                 
      Map<Long,Set<String>> group1 = 
              items.stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                    .entrySet()
                    .stream()
                    .collect(Collectors.groupingBy(Entry::getValue,
                           mapping(Entry::getKey,toSet())));
        System.out.println(group1);
                                 
                                 
                                 
                            
    }
}