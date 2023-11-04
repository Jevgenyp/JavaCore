package org.Lesson5.hw;

import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getAverageGrade() {
        return Math.round(grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0) * 10 ) / 10.0;
    }
}
