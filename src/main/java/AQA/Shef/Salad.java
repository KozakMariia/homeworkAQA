package AQA.Shef;

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

}
