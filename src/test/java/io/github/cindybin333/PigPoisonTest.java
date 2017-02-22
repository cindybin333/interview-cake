package io.github.cindybin333;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PigPoisonTest {
    PigPoison pigPoisonSimulator;

    @Before
    public void setUp() {
        pigPoisonSimulator = new PigPoison();
    }

    @Test
    public void pigsNeeded_givenLessThanOneBucket_returnsZero() {
        int actual = pigPoisonSimulator.pigsNeeded(0, 65, 65);
        assertThat(actual, equalTo(0));
    }

    @Test
    public void pigsNeeded_givenTooMuchTimeToDie_returnsZero() {
        int actual = pigPoisonSimulator.pigsNeeded(1, 34, 2);
        assertThat(actual, equalTo(0));
    }

    @Test
    public void pigsNeeded_givenNoMinutesToTest_returnsZero() {
        int actual = pigPoisonSimulator.pigsNeeded(1, 2, 0);
        assertThat(actual, equalTo(0));
    }

    @Test
    public void pigsNeeded_givenAdequateTimeAndBuckets_returnsPigsNeeded() {
        int actual = pigPoisonSimulator.pigsNeeded(10, 15, 60);
        assertThat(actual, equalTo(3));
    }
}
