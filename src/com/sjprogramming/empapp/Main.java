package com.sjprogramming.empapp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
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
                    int id = sc.nextInt();
                    System.out.println("Enter name of the employee ");
                    String name = sc.next();
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
                    System.out.println("Thank you for using our application");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
                    break;

            }
        }while (true);
    }
}
