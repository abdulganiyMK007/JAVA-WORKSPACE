package chapter15;

import java.util.Objects;

public class Student {

    private String firstname;
    private String lastname;
    private String grade;
    private int id;

    private static int idTracker = 0;

    public Student(String lastname, String firstname, String grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
        id = ++idTracker;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Student[id: "+ id +", firstname: "+ firstname +", lastname: "+ lastname 
                                +", grade: "+ grade +"]";
    }

    public boolean equals(Student otherStudent) {
        return (otherStudent.getId() == id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    
}
