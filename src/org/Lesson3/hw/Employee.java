package org.Lesson3.hw;

public class Employee {
    protected String date;
    protected double salary;

    public Employee(String date, double salary) {
        this.date = date;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int compareDates(String date1, String date2) {
        return date1.compareTo(date2);
    }

    // Проверка, является ли сотрудник руководителем
    public boolean isManager() {
        return false;
    }
}
