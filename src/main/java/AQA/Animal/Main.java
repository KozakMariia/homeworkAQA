package AQA.Animal;

public class Main {

    public static void main(String arg[]) {

        Bear bear = new Bear("urside", "polar bear");
        Bison bison = new Bison("herd", "bison");
        Camel camel = new Camel("herd", "camel");
        Chimpanzee chimpanzee = new Chimpanzee("simian", "chimpanzee");
        Elephant elephant = new Elephant("proboscidean", "elephant");
        Gazelle gazelle = new Gazelle("herd", "gazelle");
        Gorilla gorilla = new Gorilla("simian", "gorilla");
        Hippopotamus hippopotamus = new Hippopotamus("herd", "hippopotamus");
        Horse horse = new Horse("equine", "horse");
        Hyena hyena = new Hyena("рyaenidae", "hyena");
        Jaguar jaguar = new Jaguar("pantera", "jaguar");
        Giraffe giraffe = new Giraffe("giraffidae", "giraffe");
        Kangaroo kangaroo = new Kangaroo("macropus", "kangaroo");
        Leo leo = new Leo("pantera", "leo");
        Tiger tiger = new Tiger("pantera", "tiger");

        Zoo zoo = new Zoo(bear, bison, camel, chimpanzee, elephant, gazelle, gorilla, hippopotamus, horse, hyena, jaguar, giraffe, kangaroo, leo, tiger);
        System.out.println(zoo.zooAnimal());
        zoo.addAnimal(new Wolf("wolf", "Wolf"));
        System.out.println(zoo.zooAnimal());
        zoo.deleteAnimal(gazelle);
        System.out.println(zoo.zooAnimal());
    }

}
