package com.pcschool.ocp.d02;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class MultiArray3 {

    public static void main(String[] args) {
        int[][] x = {{100, 90, 80}, {70, 60, 50}};
        for (int k = 0; k < x.length; k++) {
            for (int i = 0; i < x[k].length; i++) {
                System.out.println(x[k][i]);
            }
        }

    }
}
