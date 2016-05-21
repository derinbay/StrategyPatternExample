package Birds;

import Behaviours.*;

/**
 * Created by taylanderinbay on 20.05.2016.
 */
public abstract class Bird {

    private SwimBehaviour swimBehaviour;
    private TweetBehaviour tweetBehaviour;
    private FlyBehaviour flyBehaviour;

    private final String bird = this.getClass().getName();

    public String walk() {
        String text = "I can walk";
        System.out.println(text);
        return text;
    }

    public String eat() {
        String text = "I can eat";
        System.out.println(text);
        return text;
    }

    public String show() {
        String text  = "I am a bird";
        System.out.println("I am a bird");
        return text;
    }

    private void decideSwimBehaviour() {
        if (bird.contains("Duck")) {
            swimBehaviour = new SwimAsNormal();
        } else if (bird.contains("Pigeon")) {
            swimBehaviour = new SwimAsDiving();
        } else {
            swimBehaviour = new SwimNot();
        }
    }

    private void decideTweetBehaviour() {
        if (bird.contains("Duck")) {
            tweetBehaviour = new TweetAsVakvak();
        } else if (bird.contains("Pigeon") || bird.contains("Parrot")) {
            tweetBehaviour = new TweetAsCikcik();
        } else {
            tweetBehaviour = new TweetNot();
        }
    }

    private void decideFlyBehaviour() {
        if (bird.contains("Pigeon") || bird.contains("Parrot")) {
            flyBehaviour = new FlyWithWing();
        } else {
            flyBehaviour = new FlyNot();
        }
    }

    public String trySwim() {
        decideSwimBehaviour();
        return swimBehaviour.swim();
    }

    public String tryTweet() {
        decideTweetBehaviour();
        return tweetBehaviour.tweet();
    }

    public String tryFly() {
        decideFlyBehaviour();
        return flyBehaviour.fly();
    }
}
