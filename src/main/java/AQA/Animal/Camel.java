package AQA.Animal;

public class Camel extends Animal {

    public Camel(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Sun";
    }

}
