package AQA.Animal;

public class Gazelle extends Animal {

    public Gazelle(String type, String name) {
        super.type = type;
        super.name = name;
    }

    @Override
    public String animalName() {
        return "Tilly";
    }

}
