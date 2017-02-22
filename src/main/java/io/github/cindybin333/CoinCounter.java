package io.github.cindybin333;

public class CoinCounter {
    public Integer getExactChangeCombos(int amount, int[] coins) {
        if (amount <= 0) return 0;

        int[] combos = new int[amount + 1];
        combos[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coin) combos[i] += combos[i - coin];
            }
        }
        return combos[amount];
    }
}
