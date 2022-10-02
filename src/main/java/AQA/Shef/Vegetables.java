package AQA.Shef;

/*
Определить иерархию овощей. Сделать салат. Посчитать калорийность.
Провести сортировку овощей для салата на основе одного из параметров.
Найти овощи в салате, соответствующие заданному диапазону параметров.

=====класи====
- помідори
- огірки
- салат листя
- цибуля
- салат - додати суми к-сть*калорійність, передам набір овочів в салат лістом.

====мейн====
 Стрім -Ю засунути салат, вибрати салат.калорійність і посортувати (компораор https://vertex-academy.com/tutorials/ru/interfejsy-comparable-comparator-java/ )

стрім взяти салат, лямбда салат.кількість діапазон, і вивести овочі

 */
public abstract class Vegetables {

    protected int count;
    protected int kcal;

    public int getCount() {
        return count;
    }

    public int getKcal() {
        return kcal;
    }

    public abstract String nameVegetable();

}
