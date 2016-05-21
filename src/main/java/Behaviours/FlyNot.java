package Behaviours;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class FlyNot implements FlyBehaviour {

    public String fly() {
        String text = "I can not fly";
        System.out.println(text);
        return text;
    }
}
