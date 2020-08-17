package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.SupervisorSalary;

public class Supervisor extends Manager {

    public Supervisor() {
        SupervisorSalary supervisorSalary = new SupervisorSalary();
        setSalary(supervisorSalary);
    }
    
}
