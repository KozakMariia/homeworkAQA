package AQA.Animal;

public class Chimpanzee extends Animal {

    public Chimpanzee(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Kale";
    }

}
