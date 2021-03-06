
package com.pcschool.ocp.d11_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class MapDemo4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Helen","Mary","Happy","John","Vincent");
        System.out.println(
                names.stream()
                .collect(groupingBy(String :: length,counting()))
              );
        // {4=3, 5=2, 7=1}
        Map<Integer ,Long> group1 = names.stream().collect(groupingBy(String::length,counting()));
        System.out.println(group1);
    }
    
}
