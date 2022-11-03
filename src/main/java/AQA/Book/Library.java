package AQA.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(String name, String writer) {
        books.add(new Book(name, writer));
    }

    public void printBooks() {
        Map<String, String> infoBook = books.stream().collect(Collectors.toMap(el -> el.getWriter(),
                el1 -> el1.getName()));
        System.out.println(infoBook);
    }

}
