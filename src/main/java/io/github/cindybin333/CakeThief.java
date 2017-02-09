package io.github.cindybin333;

//you like expensive cakes, steal them!

import io.github.cindybin333.model.Cake;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;


public class CakeThief {
    private Map<Integer, Integer> capacityToMaxValue;

    public CakeThief() {
        capacityToMaxValue = new HashMap<>();
    }

    public int steal(List<Cake> allCakes, int bagCapacity) {
        if (bagCapacity <= 0) return 0;

        IntConsumer findMaxPossibleCakeValue = (capacity) -> {
            int i = 0;
            int maxValue = 0;

            while (i < allCakes.size()) {
                Cake cake = allCakes.get(i);
                if (cake.getWeight() <= capacity) {
                    int numCakes = capacity / cake.getWeight();
                    int totalCakeWeight = numCakes * cake.getWeight();
                    int totalCakeValue = numCakes * cake.getValue();
                    int leftoverValue =
                            capacityToMaxValue.get(capacity - totalCakeWeight) != null
                                    ? capacityToMaxValue.get(capacity - totalCakeWeight)
                                    : 0;
                    maxValue = Integer.max(maxValue, totalCakeValue + leftoverValue);
                }
                i++;
            }

            capacityToMaxValue.put(capacity, maxValue);
        };

        IntStream.range(1, bagCapacity + 1)
                .forEach(findMaxPossibleCakeValue);

        return capacityToMaxValue.get(bagCapacity);
    }
}
