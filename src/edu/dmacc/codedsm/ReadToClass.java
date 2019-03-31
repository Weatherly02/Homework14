package edu.dmacc.codedsm;

import java.util.List;

public class ReadToClass {
    public String bookName;
    public String bookLevel;
    public String whoIsDoingThis;
    private String timeLimit;
    public String pickADay;

    public ReadToClass() {
        this.bookName = bookName;
        this.bookLevel = bookLevel;
        this.whoIsDoingThis = whoIsDoingThis;
        this.timeLimit = timeLimit;

    }

    public ReadToClass(String bookName, String level, String name, String time, String day) {
        bookName = bookName;
        bookLevel = level;
        whoIsDoingThis = name;
        timeLimit = time;
        pickADay = day;
    }

    @Override
    public String toString() {
        return "ReadToClass{" +
                "bookName='" + bookName + '\'' +
                ", bookLevel='" + bookLevel + '\'' +
                ", whoIsDoingThis='" + whoIsDoingThis + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", pickADay='" + pickADay + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookLevel() {
        return bookLevel;
    }

    public void setBookLevel(String bookLevel) {
        this.bookLevel = bookLevel;
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




