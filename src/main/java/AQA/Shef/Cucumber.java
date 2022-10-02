package AQA.Shef;

public class Cucumber extends Vegetables{

    public Cucumber(int count, int kcal) {
        super.count = count;
        super.kcal = kcal;
    }

    @Override
    public String nameVegetable() {
        String name = "Cucumber";
        return name;
    }

}
