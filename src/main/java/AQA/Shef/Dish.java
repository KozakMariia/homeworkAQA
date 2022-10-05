package AQA.Shef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dish {

    public static void main(String[] args) {

        Onion onion = new Onion(1, 34);
        Tomato tomato = new Tomato(5, 120);
        Cucumber cucumber = new Cucumber(2, 80);
        Latucce latucce = new Latucce(10, 70);

        List<Vegetables> ingredients = new ArrayList<>();

        ingredients.add(onion);
        ingredients.add(tomato);
        ingredients.add(cucumber);
        ingredients.add(latucce);

        Salad salad = new Salad(ingredients);

        System.out.println(salad.sortSalad());
        System.out.println(salad.ingredientsWithD());
        System.out.println(salad.ingredientsName());
        System.out.println(salad.saladKcal());
    }

}
