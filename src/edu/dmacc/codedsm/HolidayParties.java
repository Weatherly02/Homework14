package edu.dmacc.codedsm;

public class HolidayParties {
    public String food;
    public String drinks;
    public String games;
    public String whoIsDoingThis;


    public HolidayParties() {
        this.food = food;
        this.drinks = drinks;
        this.games = games;
        this.whoIsDoingThis = whoIsDoingThis;

    }

    public HolidayParties(String food, String drink, String game, String name) {
        food = food;
        drinks = drinks;
        games = games;
        whoIsDoingThis = name;
    }

    @Override
    public String toString() {
        return "HolidayParties{" +
                "food='" + food + '\'' +
                ", drinks='" + drinks + '\'' +
                ", games='" + games + '\'' +
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

    public String getWhoIsDoingThis() {
        return whoIsDoingThis;
    }

    public void setWhoIsDoingThis(String whoIsDoingThis) {
        this.whoIsDoingThis = whoIsDoingThis;
    }
}