package AQA.Shef;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Salad extends Vegetables {

    private Onion onion = new Onion(12, 50);
    private Tomato tomato = new Tomato(11, 150);
    private Cucumber cucumber = new Cucumber(2, 80);
    private Latucce latucce = new Latucce(10, 70);
//    public Onion onion = new Onion(getCount(), getKcal());
//    public Tomato tomato = new Tomato(getCount(), getKcal());
//    public Cucumber cucumber = new Cucumber(getCount(), getKcal());
//    public Latucce latucce = new Latucce(getCount(), getKcal());

    public List<String> ingredientsName() {

        return ingredients().stream()
                .map(el -> el.nameVegetable())
                .collect(Collectors.toList());
    }

    public List<Vegetables> ingredients() {
        return Lists.newArrayList(onion, tomato, cucumber, latucce);

    }

    public int saladKcal() {
//        return ingredients().stream()
//                .mapToInt(el->el.getCount() * getKcal())
//                .sum();
        return onion.getKcal() * onion.count + tomato.getCount() * tomato.getKcal() + cucumber.getCount() * cucumber.getKcal() + latucce.getCount() * latucce.getKcal();
    }

    @Override
    public String nameVegetable() {
        return null;
    }
}
