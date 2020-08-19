package com.pcschool.ocp.d07.case4;

import com.google.gson.Gson;
import java.io.File;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception{
        //取得 json字串
        String path ="src\\main\\java\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
        String json = new Scanner(new File(path)).useDelimiter("\\A").next();
        //System.out.println(json);
        //透過 gson將json 資料匯入到 programmer[]陣列中
        Programmer[] programmers = new Gson().fromJson(json, Programmer[].class);
        //有幾筆資料?
        System.out.printf("資料筆數: %d\n",programmers.length );
        //請問所有 Programmer 總薪資 ? 平均薪資? 最高? 最低?
       IntSummaryStatistics stat = Arrays.stream(programmers)
             .mapToInt(p ->p.getSalary())
                .summaryStatistics();
        System.out.printf("總薪資: %,d ,平均: %.1f, 最高: %,d ,最低: %,d\n,",
                stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());
        
        
        //java平均薪資
      double javaavg = Arrays.stream(programmers)
               .filter(p -> p.getName().equals("java"))
             .mapToInt(p ->p.getSalary())
                .summaryStatistics()
               .getAverage();
       
        System.out.printf("java平均薪資: %.1f\n",javaavg);
        //php平均薪資
        double phpavg = Arrays.stream(programmers)
               .filter(p -> p.getName().equals("php"))
             .mapToInt(p ->p.getSalary())
                .summaryStatistics()
               .getAverage();
       
        System.out.printf("php平均薪資: %.1f\n",phpavg);
        //男生平均薪資
        double mavg = Arrays.stream(programmers)
               .filter(p -> p.getSex().equals("m"))
             .mapToInt(p ->p.getSalary())
                .summaryStatistics()
               .getAverage();
       
        System.out.printf("男生平均薪資: %.1f\n",mavg);
        //女生平均薪資
          double favg = Arrays.stream(programmers)
               .filter(p -> p.getSex().equals("f"))
             .mapToInt(p ->p.getSalary())
                .summaryStatistics()
               .getAverage();
       
        System.out.printf("女生平均薪資: %.1f\n",favg);
        
        double mavgage = Arrays.stream(programmers)
                .filter(p ->p.getSex().equals("m"))
                .mapToInt(p -> p.getAge())
                .summaryStatistics()
                .getAverage();
        System.out.printf("男生平均年齡: %.1f"+"歲",mavgage);
        System.out.println();
        
        
double fageAvg = Arrays.stream(programmers)
                               .filter(p -> p.getSex().equals("f"))
                               .mapToInt(p -> p.getAge())
                               .summaryStatistics()
                               .getAverage();
        System.out.printf("女生平均年齡: %,.1f"+"歲", fageAvg);
        
        }
    }

