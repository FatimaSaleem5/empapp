package com.sjprogramming.empapp;

public interface EmployeeDaoIntrf {
    //create Employee
    public void createEmployee(Employee emp);
    //Show all Employee
    public void showAllEmployee();
    //Show employee based on id
    public void showEmployeeBasedOnID( int id );

    //update employee
    public void updateEmployee(int id, String name);
    //delete employee
    public void deleteEmployee();

}
