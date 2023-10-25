package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("woda", 100);
        Ingredient ingredient2 = new Ingredient("sok cytrynowy", 50);
        Ingredient ingredient3 = new Ingredient("wódka", 60);

        Drink drink = new Drink("Mojito", 13.0, true, ingredient1, ingredient2, ingredient3);
        System.out.println("Drink: " + drink.name);
        System.out.println("Cena: " + drink.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink.alcohol);
        System.out.println("Składniki: ");
        System.out.println(drink.ingredient1.name);
        System.out.println(drink.ingredient2.name);
        System.out.println(drink.ingredient3.name);
        System.out.println("Pojemność: " + (drink.ingredient1.amount + drink.ingredient2.amount + drink.ingredient3.amount) + "ml");
    }
}
