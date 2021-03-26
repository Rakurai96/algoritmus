package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {
        if (0 < a) {
            if(0 < b) {
                return a<b?a:b;
            } else {
                return a;
            }
        } else if (0 < b) {
            return b;
        }
        return -1;
    }
}
