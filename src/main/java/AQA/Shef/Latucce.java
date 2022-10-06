package AQA.Shef;

public class Latucce extends Vegetables {

    public Latucce(int count, int kcal) {
        super.count = count;
        super.kcal = kcal;
    }

    @Override
    public String nameVegetable() {
        String name = "Latucce";
        return name;
    }

}
