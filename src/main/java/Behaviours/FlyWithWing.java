package Behaviours;

import Behaviours.FlyBehaviour;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class FlyWithWing implements FlyBehaviour {

    public String fly() {
        String text = "I can fly with wing";
        System.out.println(text);
        return text;
    }
}
