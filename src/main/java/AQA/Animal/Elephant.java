package AQA.Animal;

public class Elephant extends Animal {

    public Elephant(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Tommy";
    }

}