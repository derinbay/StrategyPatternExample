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

    public void walk() {
        System.out.println("I can walk");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void show() {
        System.out.println("I am a bird");
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

    public void trySwim() {
        decideSwimBehaviour();
        swimBehaviour.swim();
    }

    public void tryTweet() {
        decideTweetBehaviour();
        tweetBehaviour.tweet();
    }

    public void tryFly() {
        decideFlyBehaviour();
        flyBehaviour.fly();
    }
}
