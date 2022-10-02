package AQA.TaskOne.Lessons;

public class Tank extends Vehicle{

    public Tank(String color) {
        super.color = color;
    }

    public Tank(String color, int door) {
        super.color = color;
        super.door = door;
    }

    public Tank(int door, int weight) {
        super.door = door;
        super.weight = weight;
    }

    @Override
    public void sound() {
        System.out.println("babah");
    }

}
