package com.company;
import java.sql.Array;
import java.time.Year;
import java.util.Scanner;
class Employee {
    private String name;
    private double rate;
    private int count_hours;
    public Employee(){;}
    public double Count_income(double rate, int count_hours) {
        double result=0;
        int bonus;
        if(count_hours>40) {
            bonus=count_hours-40;
            result=bonus*1.5*rate+rate*40;
            return result;
        }
        else return  rate*count_hours;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp=new Employee();
        System.out.print(" количество часов: ");
        int count_hours=input.nextInt();
        System.out.print("почасовая ставкa: ");
        double rate=input.nextDouble();
        System.out.print("Валовая заработная плата сотрудника: "+emp.Count_income(rate,count_hours));
    }
}

