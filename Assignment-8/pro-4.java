import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student1", 85));
        students.add(new Student("Student2", 90));
        students.add(new Student("Student3", 75));
        students.add(new Student("Student4", 80));
        students.add(new Student("Student5", 95));

        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        double averageScore = totalScore / students.size();

        List<Double> scores = new ArrayList<>();
        for (Student student : students) {
            scores.add(student.getScore());
        }
        Collections.sort(scores);

        int belowAverageCount = 0;
        int atAverageCount = 0;
        int aboveAverageCount = 0;

        for (double score : scores) {
            if (score < averageScore) {
                belowAverageCount++;
            } else if (score == averageScore) {
                atAverageCount++;
            } else {
                aboveAverageCount++;
            }
        }

        double medianScore;
        if (students.size() % 2 == 0) {
            medianScore = (scores.get(students.size() / 2 - 1) + scores.get(students.size() / 2)) / 2;
        } else {
            medianScore = scores.get(students.size() / 2);
        }

        System.out.println("Number of students who scored:");
        System.out.println("Below the average: " + belowAverageCount + ", Median score: " + medianScore);
        System.out.println("At the average: " + atAverageCount + ", Median score: " + medianScore);
        System.out.println("Above the average: " + aboveAverageCount + ", Median score: " + medianScore);
    }
}