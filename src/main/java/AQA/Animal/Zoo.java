package AQA.Animal;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Cоздать класс Zoo. В классе создать конструктор который принимает список животных.
Создать методы для добавления нового животного addAnimal(String animal),
удаления животного по его name deleteAnimal(String animalName)
и метод для вывода всего зоопарка в консоль. Зоопарк должес состоять с 15 животных
 */
public class Zoo {

    private List<Animal> animals;

    public Zoo(Animal... animals) {
        this.animals = Lists.newArrayList(animals);
    }

    public List<String> zooAnimal() {
        return animals.stream()
                .map(el -> el.getName())
                .collect(Collectors.toList());
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void deleteAnimal(Animal animal) {
        animals.remove(animal);
    }

}
