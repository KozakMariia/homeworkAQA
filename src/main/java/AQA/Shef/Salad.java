package AQA.Shef;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salad {

    private List<Vegetables> ingredients;

    public Salad(List<Vegetables> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> ingredientsName() {
        return ingredients.stream()
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());
    }

    public int saladKcal() {
        return ingredients.stream()
                .mapToInt(el -> el.getCount() * el.getKcal())
                .sum();
    }

    public List<String> ingredientsWithD() {
        return ingredients.stream()
                .filter(el -> el.getKcal() < 100 && el.getKcal() > 20)
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());
    }

    public List<String> sortSalad() {
        return ingredients.stream()
                .sorted(Comparator.comparingInt(el -> el.getKcal()))
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());
    }

}
