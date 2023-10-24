package org.Lesson3.hw;

public class Manager extends Employee {
    public Manager(String date, double salary) {
        super(date, salary);
    }

    @Override
    public boolean isManager() {
        return true;
    }

    public static void raiseSalaryForEmployees(Employee[] employees, double increaseAmount) {
        for (Employee e : employees) {
            if (!e.isManager()) {
                e.setSalary(e.getSalary() + increaseAmount);
            }
        }
    }
}