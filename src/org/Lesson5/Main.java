package org.Lesson5;
import org.Lesson5.hw.Student;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", Arrays.asList(4.0, 4.5, 5.0), "Информатика"),
                new Student("Мария", Arrays.asList(5.0, 5.0, 5.0), "Информатика"),
                new Student("Алексей", Arrays.asList(4.0, 3.5, 4.5), "Математика"),
                new Student("Екатерина", Arrays.asList(4.5, 4.5, 5.0), "Информатика"),
                new Student("Николай", Arrays.asList(4.8, 4.6, 4.7), "Физика"),
                new Student("Ольга", Arrays.asList(5.0, 4.9, 4.8), "Информатика"),
                new Student("Петр", Arrays.asList(4.9, 4.8, 4.7), "Информатика"),
                new Student("Анна", Arrays.asList(5.0, 4.5, 4.2), "Химия"),
                new Student("Дмитрий", Arrays.asList(4.2, 4.3, 4.3), "История"),
                new Student("Вероника", Arrays.asList(4.6, 4.7, 5.0), "Информатика")
        );

        List<Student> topStudents = students.stream()
                .filter(s -> "Информатика".equals(s.getSpecialty()))
                .filter(s -> s.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());

        topStudents.forEach(student ->
                System.out.println("Имя: " + student.getName() + ", Средний балл: " + student.getAverageGrade())
        );
    }
}
