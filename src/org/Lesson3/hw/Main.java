package org.Lesson3.hw;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("2023-10-01", 50000);
        Employee e2 = new Employee("2023-08-15", 55000);
        Manager m1 = new Manager("2023-01-10", 90000);

        Employee[] employees = {e1, e2, m1};

        Manager.raiseSalaryForEmployees(employees, 5000);

        for (Employee e : employees) {
            System.out.println(e.getSalary());
        }
    }
}