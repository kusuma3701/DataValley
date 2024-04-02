import java.util.ArrayList;
import java.util.List;

class Project {
    private String name;
    private int daysToComplete;
    
    public Project(String name, int daysToComplete) {
        this.name = name;
        this.daysToComplete = daysToComplete;
    }
    
    public int getDaysToComplete() {
        return daysToComplete;
    }
}

class Student {
    private String name;
    private List<Project> projects;
    
    public Student(String name) {
        this.name = name;
        projects = new ArrayList<>();
    }
    
    public void addProject(Project project) {
        projects.add(project);
    }
    
    public List<Project> getProjects() {
        return projects;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addProject(new Project("Project1", 10));
        student1.addProject(new Project("Project2", 5));
        
        Student student2 = new Student("Alice");
        student2.addProject(new Project("Project1", 15));
        student2.addProject(new Project("Project2", 8));
        
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        
        int onTime = 0;
        int late = 0;
        int early = 0;
        int totalProjects = 0;
        int totalDays = 0;
        
        for (Student student : students) {
            for (Project project : student.getProjects()) {
                totalProjects++;
                totalDays += project.getDaysToComplete();
                if (project.getDaysToComplete() <= 7) {
                    onTime++;
                } else if (project.getDaysToComplete() > 7) {
                    late++;
                } else {
                    early++;
                }
            }
        }
        
        double averageDays = (double) totalDays / totalProjects;
        
        System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed late: " + late);
        System.out.println("Number of projects completed early: " + early);
        System.out.println("Average time to complete a project: " + averageDays + " days");
    }
}