package edu.dmacc.codedsm;

public class Person {
    public String teacher;
    public String student;
    public String volunteerName;


    public Person() {
        this.teacher = teacher;
        this.student = student;
        this.volunteerName = volunteerName;

    }

    @Override
    public String toString() {
        return "Person{" +
                "teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", volunteerName='" + volunteerName + '\'' +
                '}';
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
}