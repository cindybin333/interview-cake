package io.github.cindybin333;

public class PigPoison {
    public int pigsNeeded(int buckets, int minutesToDie, int minutesToTest) {
        int perPigBucket = minutesToTest / minutesToDie;
        int pigsNeeded;
        try {
            pigsNeeded = buckets / perPigBucket;
        } catch (ArithmeticException e) {
            return 0;
        }
        return buckets % perPigBucket > 0 ?
                pigsNeeded + 1 : pigsNeeded;
    }
}
