package AQA.FileReader;
/*
- Количество только! слов в тексте (без цифр, пробелов и прочего) ~362+
- Вывести слова которые начинаются с буквы “с“ независимо от регистра и их количество+
- Количество пробелов+
- Вывести всего 12 слов+
- Отсортировать 12 слов+
- Найти любое слово+
- Найти первое слово+
- Нйти последнее слово+
- Вывести все цифры  ???
- Узнать содержится ли 2006 год в тексте+
- Вывести 30 уникальных слов (не повторяющихся)+
 */

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileReader {

    private final String filePath;
    public String fileContents;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public String scanFile() {

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            fileContents = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            System.out.println(fileContents);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileContents;
    }

    public long getWordCount() {
        return Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .count();
    }

    public String getWordWithFirstC(String letter) {
        return String.valueOf(Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .filter(el -> StringUtils.startsWithIgnoreCase(el, letter))
                .collect(Collectors.toList()));
    }

    public int spaceCount() {
        return fileContents.replaceAll("[^ ]", "")
                .length();
    }

    public String getNumber() {
        return fileContents.replaceAll("\\D+", "");
    }

    public String getTwelfSortedWords() {
        return String.valueOf(Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .limit(12)
                .sorted()
                .collect(Collectors.toList()));
    }

    public String getDistinctWords() {
        return String.valueOf(Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .distinct()
                .limit(30)
                .collect(Collectors.toList()));
    }

    public String getAnyWord() {
        return String.valueOf(Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .findAny());
    }

    public String getFirstWord() {
        return String.valueOf(Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .findFirst());
    }

    public String getLastWord() {
        return Arrays.toString(fileContents.substring(fileContents.lastIndexOf(" ") + 1)
                .split("[-#$%^&!?,.0-9\\s]+"));
    }

    public boolean isWordFound(String searchedText) {
        return Arrays.stream(fileContents.split("[-#$%^&!?,.0-9\\s]+"))
                .equals(searchedText);
    }

}

