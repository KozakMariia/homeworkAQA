package AQA.Book;

/*
Создайте класс Book с полями name и writer. Создать бивлиотеку состоящею из n книг
(количество книг в библиотеке определяет пользователь. Подсказка используйте библеотеку Faker для наполнения книги значением.
Вывидете на экран содержимое библиотеки в формате Map состоящая из параметров name и writer
 */
public class Book {

    private String name;

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    private String writer;

    public Book(String name, String writer) {
        this.name = name;
        this.writer = writer;
    }

}
