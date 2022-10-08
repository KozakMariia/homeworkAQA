package AQA.Animal;

public class Leo extends Animal {

    public Leo(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Leo";
    }

}
