package RaundTwo;

/*
Створити класс Dog з параметри колір, вік та порода
Створити притулок для собак та передати до нього мінімум 6 песиків
 - повернути кількість собак у притулку певного кольору
 - вивести список порід
 - відсортувати список песиків за віком
 - повернути список песиків з повною інформацією про них відповідно до віку, що цікавить
 */
public class Dog {
    private String color;
    private int age;
    private String poroda;

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public Dog(String color, int age, String poroda) {
        this.color = color;
        this.age = age;
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

}
