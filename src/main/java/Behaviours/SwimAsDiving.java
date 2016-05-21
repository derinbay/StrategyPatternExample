package Behaviours;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class SwimAsDiving implements SwimBehaviour {

    public String swim() {
        String text = "I can swim as diving";
        System.out.println(text);
        return text;
    }
}
