package AQA.FileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/m.kozak/JavaHistory.txt");
        fileReader.scanFile();
        System.out.println(fileReader.getWordCount());
        System.out.println(fileReader.getWordWithFirstC("c"));
        System.out.println(fileReader.spaceCount());
        System.out.println(fileReader.getNumber());
        System.out.println(fileReader.getTwelfSortedWords());
        System.out.println(fileReader.getDistinctWords());
        System.out.println(fileReader.getAnyWord());
        System.out.println(fileReader.getFirstWord());
        System.out.println(fileReader.getLastWord());
        System.out.println(fileReader.isWordFound("2006 год"));
    }

}