package AQA.Shef;

public class Tomato extends Vegetables{

    public Tomato(int count, int kcal) {
        super.count = count;
        super.kcal = kcal;
    }

    @Override
    public String nameVegetable() {
        String name = "Tomato";
        return name;
    }

}
