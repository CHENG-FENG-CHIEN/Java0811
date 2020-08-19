package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.stream.IntStream;
import jdk.nashorn.internal.objects.NativeArray;

public class FlatMap {
    public static void main(String[] args) {
        int[][] scores = {{100,90,80},
                {70,60,50}
        };
        
        //以下方法皆可  簡化版
        Arrays.stream(scores)
                .flatMapToInt(s -> Arrays.stream(s));
         Arrays.stream(scores)
                .flatMapToInt(Arrays::stream);
         Arrays.stream(scores)
                 .flatMapToInt(IntStream::of);
         //------------------------------------------//
         Arrays.stream(scores)       
                .flatMapToInt(s ->Arrays.stream(s))
                .forEach(s -> System.out.println(s));
         
         
          Arrays.stream(scores)       
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    
        }
    
    
}
