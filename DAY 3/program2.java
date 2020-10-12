
Employee.java

public class Employee{

    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    //setters
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void netSalary(double netSalary){
        this.netSalary=netSalary;
    }

    //getters
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public double getNetSalary(){
        return netSalary;
    }

    public void calculateNetSalary(int pfpercentage){

        pfamount=salary*pfpercentage;
        netSalary=salary-pfamount;
    }
}
Main.java

import java.util.Scanner;
public class Main{
    public staic void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Enter Id:"+setEmployeeId(sc.nextInt()))
        System.out.println("Enter Name:"+setEmployeeName(sc.next()));
        System.out.println("Enter salary:"+setSalary(sc.nextDouble()));

        System.out.println("Enter PF percentage:");
        double pfpercentage = sc.nextDouble();

        public static Employee getEmployeeDetails(){


        }

        public static int getPFPercentage(){

        }

    }
}
