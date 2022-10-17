package AQA.Animal;

public class Gorilla extends Animal {

    public Gorilla(String type, String name) {
        super.type = type;
        super.name = name;

    }

    @Override
    public String animalName() {
        return "Bruce";
    }
}