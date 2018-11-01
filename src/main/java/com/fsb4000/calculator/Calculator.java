package com.fsb4000.calculator;

import org.springframework.stereotype.Service;

/**
 * Calculator logic class
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}
