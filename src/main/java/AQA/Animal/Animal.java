package AQA.Animal;
/*
Создать класс Animal с полями type и name
Cоздать класс Zoo. В классе создать конструктор который принимает список животных.
Создать методы для добавления нового животного addAnimal(String animal),
удаления животного по его name deleteAnimal(String animalName)
и метод для вывода всего зоопарка в консоль. Зоопарк должес состоять с 15 животных

Создать метод который выводит список животных которые имеются в зоопарке

Создать метод который выводит отсортированый список животных в формате {type, name}
 */

public abstract class Animal {

    public String type;
    public String name;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public abstract String animalName();

}
