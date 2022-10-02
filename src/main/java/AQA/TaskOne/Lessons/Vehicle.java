package AQA.TaskOne.Lessons;

//Створити
//        2ві легкові автівки (жовтого та снього кольору з 2ма та 4ма дверима відповідно)
//        1 вантажівку
//        3 танка
//        перший рожевий
//        другий чорний та з однією дверею
//        третій має 5ть дверей та важить 30т
//        Вивести на екран інформацію про кожен транспорт
//        якщо параметри не введено то використати параметри за замовчуванням (3 двері білий колір вага 9т)
//        і повертати звук клаксона

abstract public class Vehicle {

    protected String color = "білий";
    protected int door = 3;
    protected int weight = 9;

    abstract void sound();

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public int getWeight() {
        return weight;
    }

}
