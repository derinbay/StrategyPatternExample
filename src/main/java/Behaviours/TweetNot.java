package Behaviours;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public class TweetNot implements TweetBehaviour {

    public String tweet() {
        String text = "I can not tweet";
        System.out.println(text);
        return text;
    }
}
