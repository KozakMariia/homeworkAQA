package Old;//Створити клас Person з конструктором для ініціалізації відповідних полів класу age, name
//        давай відкривай ідею
//        )

public class Person {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}
