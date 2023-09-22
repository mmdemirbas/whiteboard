package com.github.mmdemirbas.whiteboard.anonymousclass;

public class Employee {
    String name;
    int    salary;
    int    workHours;
    int    hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.3;
        }
    }
}
