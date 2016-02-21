package com.example.user.employeeattendancemanagementsystem;

/**
 * Created by Marina Bronfman on 2/9/16.
 */
public class AttendanceLog {
    private String _date;
    private String _time;
    private int _employee_id;
    private String _name;

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public String get_time() {
        return _time;
    }

    public void set_time(String _time) {
        this._time = _time;
    }

    public int get_employee_id() {
        return _employee_id;
    }

    public void set_employee_id(int _employee_id) {
        this._employee_id = _employee_id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
