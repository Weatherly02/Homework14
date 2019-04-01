package edu.dmacc.codedsm;

public class StudentAction {
    public String one = "Student Reads Aloud";
    public String two = "Sight Words";
    public String whoIsDoingThis;
    private String timeLimit;
    public String pickADay;


    public StudentAction() {
        this.one = one;
        this.two = two;
        this.whoIsDoingThis = whoIsDoingThis;
        this.timeLimit = timeLimit;
        this.pickADay = pickADay;
    }

    public StudentAction(String one, String two, String name, String time, String day) {
        one = "Student Reads Aloud";
        two = "Sight Words";
        whoIsDoingThis = name;
        timeLimit = time;
        pickADay = day;


    }

    @Override
    public String toString() {
        return "StudentAction{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", whoIsDoingThis='" + whoIsDoingThis + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", pickADay='" + pickADay + '\'' +
                '}';
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getWhoIsDoingThis() {
        return whoIsDoingThis;
    }

    public void setWhoIsDoingThis(String whoIsDoingThis) {
        this.whoIsDoingThis = whoIsDoingThis;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getPickADay() {
        return pickADay;
    }

    public void setPickADay(String pickADay) {
        this.pickADay = pickADay;
    }
}