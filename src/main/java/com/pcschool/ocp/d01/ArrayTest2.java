
package com.pcschool.ocp.d01;


public class ArrayTest2 {
    public static void main(String[] args) {
        double[] stocks = {7.6,3.9,15.6,28.3,1.2,10.8,35.3,45.6,10.2,0.5}; //股票獲利
        
        double[] bounds = {6.8,7.2,6.8,7.5,6.9,7.9,7.9,7.1,7.2}; //債券獲利
        
        
        Util stockUtil= new Util();
        stockUtil.values = stocks;
        System.out.printf("股票獲利平均: %.2f",stockUtil.getAvg() );
        System.out.printf("股票CV: %.2f",stockUtil.getCV());
        
        Util boundsUtil= new Util();
        boundsUtil.values = bounds;
        System.out.printf("債券獲利平均: %.2f",boundsUtil.getAvg() );
        System.out.printf("債券CV: %.2f",boundsUtil.getCV());
        
        
        System.out.printf("CV最小的是: %s\n", stockUtil.getCV() < boundsUtil.getCV() ? "股票":"債券" );
        
        
        
        
        
        
    }
}