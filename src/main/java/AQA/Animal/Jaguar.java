package AQA.Animal;

public class Jaguar extends Animal {

    public Jaguar(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Sky";
    }

}
