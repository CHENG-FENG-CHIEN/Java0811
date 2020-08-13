package com.pcschool.ocp.d03.school;

public class School {

    public static void main(String[] args) {
        String[][] data = {
            {"John", "18", "170", "60"},
            {"Mary", "17", "160", "45"},
            {"Jane", "17", "165", "65"},
            {"Mark", "19", "180", "55"},};
        Student[] students = new Student [data.length];
        for (int i = 0; i < data.length; i++) {
            String[] row = data[i];
            String name = row[0];
            int age = Integer.parseInt(row[1]);
            double height = Double.parseDouble(row[2]);
            double weight = Double.parseDouble(row[3]);
            //建立BMI物件
            BMI bmi = new BMI(height, weight);
            //建立Student 物件
            Student student = new Student(name, age, bmi);
            //置入資料
            students[i] = student;

        }
        //列印students
        for (Student student : students) {
            System.out.println(student);
        }
        for (int i = 0;i<students.length;i++){
              Student s1 = students[0];
              Student s2 = students[1]; 
              students[0]=s2;
              students[1]=s1;


             }
        
    }
}
