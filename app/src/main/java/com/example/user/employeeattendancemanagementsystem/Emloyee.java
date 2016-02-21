package com.example.user.employeeattendancemanagementsystem;

/**
 * Created by user on 2/9/16.
 */
public class Emloyee {
    private int _employee_id;
    private String _department;
    private String _name;
    private int _phone;
    private int _age;
    private int _salary;

    public String get_department() {
        return _department;
    }

    public void set_department(String _department) {
        this._department = _department;
    }

    public String get_name() {
        return _name;
    }

    public int get_phone() {
        return _phone;
    }

    public void set_phone(int _phone) {
        this._phone = _phone;
    }

    public int get_age() {
        return _age;
    }

    public int get_employee_id() {
        return _employee_id;
    }

    public int get_salary() {
        return _salary;
    }

    public void set_salary(int _salary) {
        this._salary = _salary;
    }
}
