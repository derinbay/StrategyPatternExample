import Birds.Duck;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by taylanderinbay on 21.05.2016.
 */
public class BehaviourTest {

    @Test
    public void shouldGiveRightBehaviour() {
        Duck duck = new Duck();
        assertTrue("Text is not right!", duck.tryTweet().equals("I can tweet as vakvak"));

        assertTrue("Text is not right!", duck.tryFly().equals("I can not fly"));

        assertTrue("Text is not right!", duck.trySwim().equals("I can swim as normal"));

        assertTrue("Text is not right!", duck.eat().equals("I can eat"));

        assertTrue("Text is not right!", duck.walk().equals("I can walk"));
    }
}
