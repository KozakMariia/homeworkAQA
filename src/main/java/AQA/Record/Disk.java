package AQA.Record;

/*
Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку.
Посчитать продолжительность. Провести перестановку композиций диска на основе одного из параметров.
Найти композицию, соответствующую заданному диапазону параметров.*/

public class Disk {

    public static void main(String[] args) {

        Pop pop = new Pop(1.23, "KATE", "zzzz");
        Pop pop2 = new Pop(2.23, "KATE2", "CCCCC");
        Rock rock = new Rock(4.12, "Nom", "ZZZ");
        Lyrics lyrics = new Lyrics(3.57, "Amanda", "CCC");
        Classical classical = new Classical(6.01, "Bah", "vvfvd");

        CollectionSongs collectionSongs = new CollectionSongs(pop, rock, lyrics, classical, pop2);

        System.out.println(collectionSongs.durationSum());
        System.out.println(collectionSongs.sortedSongs());
        System.out.println(collectionSongs.songsWithDiapazon(2, 4));
        System.out.println(collectionSongs.songsNames());
    }

}
