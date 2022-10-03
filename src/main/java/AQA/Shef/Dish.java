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

        List<String> sortSalad = ingredients.stream()
                .sorted(Comparator.comparingInt(el -> el.getKcal()))
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());

        List<String> ingredientsWithD = ingredients.stream()
                .filter(el -> el.getKcal() < 100 && el.getKcal() > 20)
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());

        System.out.println(sortSalad);
        System.out.println(ingredientsWithD);
        System.out.println(salad.ingredientsName());
        System.out.println(salad.saladKcal());
    }

}
