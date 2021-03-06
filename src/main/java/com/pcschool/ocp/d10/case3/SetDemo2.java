package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
       //集合預設可以放入任意 Object 資料
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(new Integer(100));
        set.add("英文");
        set.add(80);
        set.add("數學");
        set.add(90);
        System.out.println(set);
        //尋訪器(遍歷每一個元素)
        Iterator iter = set.iterator();
        while (iter.hasNext()) {       //輸入 while 選第三個 
            Object next = iter.next(); //取得元素內容
            System.out.println(next);  //印出元素內容
        }
            //[國文, 100, 英文, 80, 數學, 90]   物件陣列 object[]
        int sum = 0;
        iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer)
                sum += (Integer)next;
        }
        System.out.println(sum);
        
        //java8
        sum = set.stream()
                .filter(note -> note instanceof Integer)
                .mapToInt(score -> (Integer)score)  // .mapToInt(score -> ((Integer)score).intValue())
                .sum();
        System.out.println(sum);
                
    }
}
