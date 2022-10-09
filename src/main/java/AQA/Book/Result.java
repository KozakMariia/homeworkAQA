package AQA.Book;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Library library = new Library();
        Faker faker = new Faker();

        for (int i = 0; i < count; i++) {
            String name = faker.witcher().monster();
            String writer = faker.funnyName().name();
            library.addBook(name, writer);
        }

        library.printBooks();
    }

}
