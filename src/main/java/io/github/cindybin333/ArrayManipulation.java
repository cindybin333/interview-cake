package io.github.cindybin333;

//given an array, find the highest product of three values in the array

import static java.lang.Integer.MIN_VALUE;

public class ArrayManipulation {
    public int getHighestTriProduct(int[] ary) {
        if (ary.length < 3) return 0;
        if (ary.length == 3) return ary[0] * ary[1] * ary[2];

        int high1 = MIN_VALUE;
        int high2 = MIN_VALUE;
        int high3 = MIN_VALUE;
        int neg1 = 0;
        int neg2 = 0;
        int neg3 = 0;

        for (int anAry : ary) {
            if (anAry <= neg3) {
                neg1 = neg2;
                neg2 = neg3;
                neg3 = anAry;
            } else if (anAry <= neg2) {
                neg1 = neg2;
                neg2 = anAry;
            } else if (anAry < neg1) {
                neg1 = anAry;
            } else if (anAry >= high1) {
                high3 = high2;
                high2 = high1;
                high1 = anAry;
            } else if (anAry >= high2) {
                high3 = high2;
                high2 = anAry;
            } else if (anAry > high3) {
                high3 = anAry;
            }
        }

        int maxTriProduct = ((neg1 * neg2 * neg3) > (neg1 * neg2 * high1)) ?
                (neg1 * neg2 * neg3) :
                (neg1 * neg2 * high1);
        maxTriProduct = (maxTriProduct > (neg1 * high1 * high2)) ?
                maxTriProduct :
                (neg1 * high1 * high2);
        return (maxTriProduct > (high1 * high2 * high3)) ?
                maxTriProduct :
                (high1 * high2 * high3);
    }
}
