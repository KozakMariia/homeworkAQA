package AQA.TaskOne;

import AQA.TaskOne.Lessons.Car;
import AQA.TaskOne.Lessons.Tank;
import AQA.TaskOne.Lessons.Truck;

public class InfoAboutVehicle {


    public static void main(String[] args) {
        Car car1 = new Car("жовта", 2);
        Car car2 = new Car("синя", 4);
        Tank tank1 = new Tank("рожевий");
        Tank tank2 = new Tank("чорний", 1);
        Tank tank3 = new Tank(5, 30);

        Truck truck = new Truck();

        System.out.println("Машинка " + car1.getColor() + " з " + car1.getDoor() + " дверима. Вага " + car1.getWeight() + "т. Звук - ");
        car1.sound();
        System.out.println("Машинка " + car2.getColor() + " з " + car2.getDoor() + " дверима. Вага " + car2.getWeight() + "т. Звук - ");
        car1.sound();
        System.out.println("Вантажівка має колір " + truck.getColor() + " з " + truck.getDoor() + " дверима. Вага " + truck.getWeight() + "т. Звук - ");
        truck.sound();
        System.out.println("Перший танк " + tank1.getColor() + " з " + tank1.getDoor() + " дверима. Вага " + tank1.getWeight() + "т. Звук - ");
        tank1.sound();
        System.out.println("Другий танк " + tank2.getColor() + " з " + tank2.getDoor() + " дверью. Вага " + tank2.getWeight() + "т. Звук - ");
        tank2.sound();
        System.out.println("Третій танк " + tank3.getColor() + " з " + tank3.getDoor() + " дверью. Вага " + tank3.getWeight() + "т. Звук - ");
        tank3.sound();
    }

}
