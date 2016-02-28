package com.example.user.employeeattendancemanagementsystem;

/**
 * Created by user on 2/9/16.
 */
public class Emloyee {
    private int employeeId = 0;
    private String department = null;
    private String name = null;
    private int phone = 0;
    private int age = 0;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){ this.age = age;}

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId){ this.employeeId = employeeId;}
}
