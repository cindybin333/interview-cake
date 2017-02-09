package io.github.cindybin333;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayManipulationTest {
    private ArrayManipulation arrayManipulation;

    @Before
    public void setUp() {
        arrayManipulation = new ArrayManipulation();
    }

    @Test
    public void getHighestTriProduct_givenEmptyArray_returns0() {
        int[] array = {};
        assertEquals(0, arrayManipulation.getHighestTriProduct(array));
    }

    @Test
    public void getHighestTriProduct_given1Or2Elements_returns0() {
        int[] array = {1, 2};
        assertEquals(0, arrayManipulation.getHighestTriProduct(array));
    }

    @Test
    public void getHighestTriProduct_given3OrMore_returnsHighestProductOfThree() {
        int[] array = {5, 6, 1, 3, 0};
        assertEquals(90, arrayManipulation.getHighestTriProduct(array));
    }

    @Test
    public void getHighestTriProduct_givenArrayWithNegativeInts_returnsHighestProductOfThree() {
        int[] array = {-10, -3, -1, 2};
        assertEquals(60, arrayManipulation.getHighestTriProduct(array));
    }

    @Test
    public void getHighestTriProduct_givenArrayWithAllNegativeInts_returnsHighestProductOfThree() {
        int[] array = {-5, -6, -1, -3, -9};
        assertEquals(-15, arrayManipulation.getHighestTriProduct(array));
    }
}