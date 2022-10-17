package AQA.Animal;

public class Bear extends Animal {

    public Bear(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Molly";
    }

}
