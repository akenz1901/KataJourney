package com;

import org.junit.jupiter.api.Test;

public class RandomSentenceClient {

    @Test
    void randomSentence_canBeGenerated(){
        System.out.println(RandomSentence.getRandomSentence());
    }
}
