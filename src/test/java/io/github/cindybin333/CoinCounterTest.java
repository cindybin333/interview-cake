package io.github.cindybin333;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoinCounterTest {
    private CoinCounter coinCounter;

    @Before
    public void setUp() {
        coinCounter = new CoinCounter();
    }

    @Test
    public void getExactChangeCombos_returnsAnInteger() {
        int[] coins = {2};
        Object actual = coinCounter.getExactChangeCombos(10, coins);
        assertThat(actual, instanceOf(Integer.class));
    }

    @Test
    public void getExactChangeCombos_givenNotPossible_returnsZero() {
        int[] coins = {2};
        Integer actual = coinCounter.getExactChangeCombos(3, coins);
        assertThat(actual, equalTo(0));
    }

    @Test
    public void getExactChangeCombos_givenOnePossible_returnsOne() {
        int[] coins = {10};
        Integer actual = coinCounter.getExactChangeCombos(10, coins);
        assertThat(actual, equalTo(1));
    }

    @Test
    public void getExactChangeCombos_givenMultiplePossible_returnsAll() {
        int[] coins = {1,2,5};
        Integer actual = coinCounter.getExactChangeCombos(5, coins);
        assertThat(actual, equalTo(4));
    }
}
