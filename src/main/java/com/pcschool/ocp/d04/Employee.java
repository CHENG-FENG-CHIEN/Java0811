
package com.pcschool.ocp.d04;


public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        name = "沒名字";
        salary = 10000;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
