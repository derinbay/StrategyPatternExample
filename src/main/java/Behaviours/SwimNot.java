package Behaviours;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class SwimNot implements SwimBehaviour {

    public String swim() {
        String text = "I can not swim";
        System.out.println(text);
        return text;
    }
}
