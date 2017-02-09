package io.github.cindybin333;

import io.github.cindybin333.model.Cake;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class CakeThiefTest {
    private CakeThief cakeThief;
    private Cake a, b, c, d;

    @Before
    public void setUp() {
        cakeThief = new CakeThief();
        a = new Cake(10, 1);
        b = new Cake(5, 5);
        c = new Cake(3, 4);
        d = new Cake(1, 1);
    }

    @Test
    public void steal_returnsAnInt() {
        Object loot = cakeThief.steal(asList(a), 0);
        assertThat(loot, instanceOf(Integer.class));
    }

    @Test
    public void steal_givenBagWithZeroCapacity_returnsZeroLoot() {
        assertThat(cakeThief.steal(asList(a, b), 0), equalTo(0));
    }

    @Test
    public void steal_returnsTheMostPossibleLoot() {
        assertThat(cakeThief.steal(asList(a, b, c, d), 10), equalTo(13));
    }
}