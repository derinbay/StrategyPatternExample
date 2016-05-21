package Behaviours;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class TweetAsCikcik implements TweetBehaviour {

    public String tweet() {
        String text = "I can tweet as cikcik";
        System.out.println(text);
        return text;
    }
}
