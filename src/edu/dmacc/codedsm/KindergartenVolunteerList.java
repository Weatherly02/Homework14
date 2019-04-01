package edu.dmacc.codedsm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KindergartenVolunteerList {
    public List<String> classroom;
    public List<String> activityName;
    public String whoIsDoingThis;
    private String timeLimit;
    public Boolean isReoccurring;
    public Boolean isDone;
    public String pickADay;


    public KindergartenVolunteerList() {

        this.classroom = classroom;
        this.activityName = new ArrayList<>();
        this.whoIsDoingThis = whoIsDoingThis;
        this.timeLimit = timeLimit;
        this.isReoccurring = false;
        this.pickADay = pickADay;
    }

    @Override
    public String toString() {
        return "KindergartenVolunteerList{" +
                "classroom=" + classroom +
                ", activityName=" + activityName +
                ", whoIsDoingThis='" + whoIsDoingThis + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", isReoccurring=" + isReoccurring +
                ", isDone=" + isDone +
                ", pickADay='" + pickADay + '\'' +
                '}';
    }

    Person PersonObject = new Person("HAINES", "Renea", "Linda");
    ReadToClass ReadToClassObject = new ReadToClass("The Little Blue Truck", "One", "Tammy", "10 minutes", "Thursday");
    StudentAction StudentActionObject = new StudentAction("Student Reads Aloud", "Sight Words", "Lilly", "10 minutes", "Monday");
    HolidayParties HolidayPartiesObject = new HolidayParties("pizza", "Orange Drink", "Red Rover", "Shelia");

    public List<String> getClassroom() {
        return classroom;
    }

    public void setClassroom(List<String> classroom) {
        this.classroom = classroom;
    }

    public List<String> getActivityName() {
        return activityName;
    }

    public void setActivityName(List<String> activityName) {
        this.activityName = activityName;
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

    public Boolean getReoccurring() {
        return isReoccurring;
    }

    public void setReoccurring(Boolean reoccurring) {
        isReoccurring = reoccurring;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public String getPickADay() {
        return pickADay;
    }

    public void setPickADay(String pickADay) {
        this.pickADay = pickADay;
    }
}






