package AQA.Animal;

public class Bison extends Animal {

    public Bison(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Tilly";
    }

}
