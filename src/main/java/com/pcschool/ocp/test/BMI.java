package com.pcschool.ocp.test;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello BMI");
        Scanner sc =new Scanner(System.in);
        System.out.print("請輸入身高:");
        double h =sc.nextDouble();
        System.out.print("請輸入體重:");
        double w = sc.nextDouble();
        double bmi = w/ Math.pow(h/100, 2);
        System.out.printf("身高: %.2f 體重: %.2f BMI: %.2f\n" ,h ,w ,bmi);
    }
}
