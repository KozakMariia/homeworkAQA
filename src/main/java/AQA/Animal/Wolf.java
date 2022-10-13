package AQA.Animal;

public class Wolf extends Animal {

    public Wolf(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Bruce";
    }

}