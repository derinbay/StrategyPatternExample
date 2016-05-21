import Birds.Duck;
import Birds.Ostrich;
import Birds.Parrot;
import Birds.Pigeon;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
class Program {

    public static void main(String [ ] args) {
        Parrot parrot = new Parrot();
        parrot.show();
        parrot.trySwim();
        parrot.tryFly();
        parrot.tryTweet();
        System.out.println("-------------------");

        Ostrich ostrich = new Ostrich();
        ostrich.show();
        ostrich.trySwim();
        ostrich.tryFly();
        ostrich.tryTweet();
        System.out.println("-------------------");

        Pigeon pigeon = new Pigeon();
        pigeon.show();
        pigeon.trySwim();
        pigeon.tryFly();
        pigeon.tryTweet();
        System.out.println("-------------------");

        Duck duck = new Duck();
        duck.show();
        duck.trySwim();
        duck.tryFly();
        duck.tryTweet();
    }
}
