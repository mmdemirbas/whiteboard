package com.github.mmdemirbas.whiteboard.anonymousclass;

public class Main {

    public static void main(String[] args) {
        Employee aslan  = new Employee("Aslan BALCI", 15000, 50, 2010);

        Employee aslan3  = new Employee("Aslan BALCI", 15000, 50, 2010);
        
        Employee aslan2 = new Employee("Aslan BALCI", 15000, 50, 2010) {
            int age;
            
            int getAge() {
                return age;
            }
        };
        
        
    }
}

class InheritedEmployee extends Employee {
    
    int age;

    public InheritedEmployee(String name, int salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
    }
    
    int getAge() {
        return age;
    }
}