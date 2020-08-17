package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.employee.Employee;
import com.pcschool.ocp.d06.case2.salary.AccountSalary;

public class Account extends Employee {

    public Account() {
        AccountSalary accountsalary = new AccountSalary();
        setSalary(accountsalary);
       
    }

}
