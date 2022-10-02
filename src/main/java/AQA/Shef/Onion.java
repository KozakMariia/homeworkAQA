package AQA.Shef;

public class Onion extends Vegetables{

    public Onion(int count, int kcal) {
        super.count = count;
        super.kcal = kcal;
    }

    @Override
    public String nameVegetable() {
        String name = "Onion";
        return name;
    }

}
