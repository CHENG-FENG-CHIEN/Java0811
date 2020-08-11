package com.pcschool.ocp.d01;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import jdk.nashorn.internal.objects.NativeArray;

public class ArrayTest3 {

    public static void main(String[] args) {
        double[] h = {172, 168, 164, 170, 176};
        //Java7
        double avg = 0;
        double sum = 0;
        for (int i = 0, len = h.length; i < len; i++) {
            sum += h[i];

        }
        System.out.printf("平均: %.2f cm\n", avg);

        //取最大值
        double max = 0;
        for (int i = 0, len = h.length; i < len; i++) {
            if (h[i] > max) {
                max = h[i];
            }
        }
        System.out.printf("最高: %.2f cm\n",max);
    
        //最小值
        double min = 1000;
        for (int i = 0,len = h.length;i <len ;i++){
            if(h[i] < min){
                min = h[i];
            }
        }
        System.out.printf("最矮: %.2f cm\n",min);
   
        //Java8
        sum = Arrays.stream(h).sum();

        avg = Arrays.stream(h).average().getAsDouble();
        System.out.printf("總身高: %.1f 平均身高: %.1f\n", sum, avg);
   //統計
       DoubleSummaryStatistics stat = Arrays.stream(h).summaryStatistics();
        System.out.printf("數量:  %d \n", stat.getCount());
        System.out.printf("平均:  %.2f cm\n", stat.getAverage());
        System.out.printf("總和:  %.2f cm\n", stat.getSum());
        System.out.printf("最大:  %.2f cm\n", stat.getMax());
        System.out.printf("最小:  %.2f cm\n", stat.getMin());
        
        
    
    } 
   
       
}


