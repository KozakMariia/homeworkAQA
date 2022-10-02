package AQA.Shef;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dish {

    public static void main(String[] args) {

        Salad salad = new Salad();

        List<String> sortSalad = salad.ingredients().stream()
                .sorted(Comparator.comparingInt(el -> el.getKcal()))
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());

        List<String> ingredientsWithD = salad.ingredients().stream()
                .filter(el -> el.getKcal() < 100 && el.getKcal() > 20)
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());

        System.out.println(sortSalad);
        System.out.println(ingredientsWithD);
        System.out.println(salad.ingredientsName());
        System.out.println(salad.saladKcal());
    }

}
