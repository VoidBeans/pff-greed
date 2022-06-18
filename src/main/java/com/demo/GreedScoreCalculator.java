package com.demo;

import java.util.HashMap;
import java.util.Map;

class GreedScoreCalculator {

    int calculateScore(int[] dice) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int digit : dice) {
            if (!(map.containsKey(digit))) {
                map.put(digit, 1);
            } else {
                map.put(digit, map.get(digit) + 1);
            }
        }

        int score = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (key == 1) {
                score += value >= 3 ? 1000 + (value - 3) * 100 : value * 100;
            } else if (key == 5) {
                score += value >= 3 ? 500 + (value - 3) * 50 : value * 50;
            } else if (value >= 3) {
                score += Integer.parseInt(key.toString()) * 100;
            }
        }

        return score;
    }

}
