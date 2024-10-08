package com.sjprogramming.empapp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int id;
        String name;
        EmployeeDaoIntrf dao = new EmployeeDaoImpl();
        System.out.print("Welcome to Employee Management System \n");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add employee\n" +
                    "2. Show All Employee\n" +
                    "3. Show Employee Based on ID\n" +
                    "4. Update the Employee \n" +
                    "5. Delete the Employee\n");
            System.out.println("Enter Choice 1, 2, 3, 4, 5");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter id = ");
                    id = sc.nextInt();
                    System.out.println("Enter name of the employee ");
                    name = sc.next();
                    System.out.println("Enter salary =  ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter age =  ");
                    int age = sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;

                case 2:
                    dao.showAllEmployee();
                    break;

                case 3:
                    System.out.println("Enter id to show the employee's details");
                    int empid = sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;

                case 4:
                    System.out.println("Update Employee's detail ");
                    System.out.println("Enter employee's id to update the details = ");
                    int empid1 = sc.nextInt();
                    System.out.println("Enter employee's new name = ");
                    name = sc.next();
                    dao.updateEmployee(empid1, name);
                    break;
                case 5:
                    System.out.println("Enter the id to delete = ");
                    id= sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank you for using our application");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
                    break;

            }
        }while (true);
    }
}
