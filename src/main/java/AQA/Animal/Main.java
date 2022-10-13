package AQA.Animal;

public class Main {

    public static void main(String arg[]) {

        Bear bear = new Bear("urside", "polar bear");
        Bison bison = new Bison("herd", "bison");
        Camel camel = new Camel("herd", "camel");
        Chimpanzee chimpanzee = new Chimpanzee("simian", "chimpanzee");
        Elephant elephant = new Elephant("proboscidean", "elephant");
        Gazelle gazelle = new Gazelle("herd", "gazelle");
        Gorilla gorillaMale = new Gorilla("simian", "gorilla");
        Gorilla gorillaFemale = new Gorilla("simian", "gorilla1");
        Gorilla gorilla1 = new Gorilla("simian", "gorilla1");
        Hippopotamus hippopotamus = new Hippopotamus("herd", "hippopotamus");
        Horse horse = new Horse("equine", "horse");
        Hyena hyena = new Hyena("рyaenidae", "hyena");
        Jaguar jaguar = new Jaguar("pantera", "jaguar");
        Giraffe giraffe = new Giraffe("giraffidae", "giraffe");
        Giraffe giraffe1 = new Giraffe("giraffidae", "giraffe1");
        Kangaroo kangaroo = new Kangaroo("macropus", "kangaroo");
        Leo leo = new Leo("pantera", "leo");
        Tiger tiger = new Tiger("pantera", "tiger");

        Zoo zoo = new Zoo(bear, bison, camel, chimpanzee, elephant, gazelle, gorilla1, gorillaMale, gorillaFemale, hippopotamus, horse, hyena, jaguar, giraffe, giraffe1, kangaroo, leo, tiger);
        System.out.println(zoo.zooAnimal());
        zoo.addAnimal(giraffe1);
        zoo.addAnimal(new Wolf("wolf", "Wolf"));
        System.out.println(zoo.zooAnimal());
        zoo.deleteAnimalWithAnimalName("Bruce");
        System.out.println(zoo.zooAnimal());
    }

}
