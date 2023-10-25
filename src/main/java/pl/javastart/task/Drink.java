package pl.javastart.task;

public class Drink {
    String name;
    double price;
    boolean alcohol;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;

    public Drink(String name, double price, Boolean alcohol, Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }
}