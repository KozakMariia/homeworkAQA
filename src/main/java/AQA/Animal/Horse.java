package AQA.Animal;

public class Horse extends Animal {

    public Horse(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Wind";
    }

}
