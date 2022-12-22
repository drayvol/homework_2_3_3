package Animals;

public class Main {
    public static void main(String[] args) {
        Herbivore horse = new Herbivore( "лошадь", 5, "степи", 50,  "трава");
        Herbivore horse2 = new Herbivore( "лошадь", 5, "степи", 50,  "трава");
        System.out.println(horse.equals(horse2));
        Herbivore giraffe = new Herbivore( "жираф", 2, "тропики",  55, "трава");
        System.out.println(horse.equals(giraffe));
        System. out.println(horse) ;
        horse.eat();
        horse.go();
        horse.pastiche();
        horse.sleep();
    }
}