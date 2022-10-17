package AQA.Animal;

public class Kangaroo extends Animal {

    public Kangaroo(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Jack";
    }

}
