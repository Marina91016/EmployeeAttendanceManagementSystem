package com.example.user.employeeattendancemanagementsystem;

/**
 * Created by Marina Bronfman on 23/2/16.
 */
public enum Department {

    MANAGEMENT(85000),
    HR(8000),
    MAINTANENCE(6500),
    ENGINEERING(35000),
    SALES(17000);

    private int salary;

    private Department(int salary){
        this.salary = salary;
    }

    public int get_Salary(){
        return this.salary;
    }
    //SALES(new HashMap<String,Integer>(){
    //    {
    //        put("ooo",15000);
    //        put("lll",15000);
    //        put("ppp",15000);
    //        put("qqqq",15000);
    //        put("aaaa",15000);
    //    }
    //});

    //private HashMap salaries;

   // Department(HashMap salaries) {
   //     this.salaries = salaries;
   // }
}
