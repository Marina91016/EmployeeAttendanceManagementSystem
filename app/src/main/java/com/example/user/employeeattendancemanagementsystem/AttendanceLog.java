package com.example.user.employeeattendancemanagementsystem;

/**
 * Created by Marina Bronfman on 2/9/16.
 */
public class AttendanceLog {
    private String date;
    private String time;
    private int employeeId;
    private String name;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
