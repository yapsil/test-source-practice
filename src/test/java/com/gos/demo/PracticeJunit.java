package com.gos.demo;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class PracticeJunit {

    @Test
    void testInAllEnvironments() {
        assumingThat(1 == (Integer.valueOf("1")),
                () -> {
                    System.out.println("run == ");
                });

        // perform these assertions in all environments
        assertEquals("a string", "a string");
    }

    @RepeatedTest(10)
    void testForRepeat(){
        System.out.println("test");
    }
}
