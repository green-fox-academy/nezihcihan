package com.greenfox.nezih.foxclubproject.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fox {

    private String name;
    private String food;
    private String drink;
    public List<String> newTricks;
    public List<String> trickList;
    private List<String> foodList;
    private List<String> drinkList;

    public Fox() {
        this.name = "Mr. Green";
        this.food = "salad";
        this.drink = "water";
        this.trickList = new ArrayList<>();
        this.newTricks = new ArrayList<>(Arrays.asList("Html", "Java", "cook","wash","clean"));
        this.foodList= new ArrayList<>(Arrays.asList("Pizza", "Pasta", "Burger","Sandwich"));
        this.drinkList = new ArrayList<>(Arrays.asList("Cola", "Water", "Wine","Beer"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<String> getNewTricks() {
        return newTricks;
    }

    public void setNewTricks(List<String> newTricks) {
        this.newTricks = newTricks;
    }



    public List<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }

    public List<String> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<String> drinkList) {
        this.drinkList = drinkList;
    }

    public void addTrick(String trick){
        trickList.add(trick);
    }
    public void removeTrick (String trick) {
        newTricks.remove(trick);
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<String> trickList) {
        this.trickList = trickList;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", newTricks=" + newTricks +
                ", trickList=" + trickList +
                ", foodList=" + foodList +
                ", drinkList=" + drinkList +
                '}';
    }
}
