package edu.dmacc.codedsm;

public class HolidayParties {
    public String food;
    public String drinks;
    public String games;
    public String takeHomeBags;
    public String whoIsDoingThis;


    public HolidayParties() {
        this.food = food;
        this.drinks = drinks;
        this.games = games;
        this.takeHomeBags = takeHomeBags;
        this.whoIsDoingThis = whoIsDoingThis;

    }

    @Override
    public String toString() {
        return "HolidayParties{" +
                "food='" + food + '\'' +
                ", drinks='" + drinks + '\'' +
                ", games='" + games + '\'' +
                ", takeHomeBags='" + takeHomeBags + '\'' +
                ", whoIsDoingThis='" + whoIsDoingThis + '\'' +
                '}';
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getTakeHomeBags() {
        return takeHomeBags;
    }

    public void setTakeHomeBags(String takeHomeBags) {
        this.takeHomeBags = takeHomeBags;
    }

    public String getWhoIsDoingThis() {
        return whoIsDoingThis;
    }

    public void setWhoIsDoingThis(String whoIsDoingThis) {
        this.whoIsDoingThis = whoIsDoingThis;
    }
}