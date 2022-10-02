package AQA.TaskOne.Lessons;

public class Car extends Vehicle{

    public Car(String color, int door) {
        super.color = color;
        super.door = door;
    }

    @Override
    public void sound() {
        System.out.println("bee bee");
    }

}
