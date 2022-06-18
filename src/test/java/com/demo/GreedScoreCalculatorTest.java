package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreedScoreCalculatorTest {

    @Test
    void calculateScore_WhenGiven_AllDistinct() {
        assertEquals(150, new GreedScoreCalculator().calculateScore(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void calculateScore_WhenGiven_AllDuplicates_One() {
        assertEquals(1200, new GreedScoreCalculator().calculateScore(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void calculateScore_WhenGiven_AllDuplicates_Two() {
        assertEquals(200, new GreedScoreCalculator().calculateScore(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    void calculateScore_WhenGiven_NoTriplets() {
        assertEquals(250, new GreedScoreCalculator().calculateScore(new int[]{5, 1, 3, 4, 1}));
    }

    @Test
    void calculateScore_WhenGiven_Quadruple() {
        assertEquals(1100, new GreedScoreCalculator().calculateScore(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    void calculateScore_WhenGiven_Triplet() {
        assertEquals(450, new GreedScoreCalculator().calculateScore(new int[]{2, 4, 4, 5, 4}));
    }

}
