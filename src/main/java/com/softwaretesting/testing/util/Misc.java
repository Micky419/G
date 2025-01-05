package com.softwaretesting.testing.util;

import org.springframework.util.Assert;


public class Misc {

    public static int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int divide(int divide, int divideBy) {
        if (divideBy == 0) {
            throw new RuntimeException("This operation would result in division by zero error.");
        }

        return divide / divideBy;
    }

    public static long calculateFactorial(int num) {
        if (num >= 1) {
            return num * calculateFactorial(num - 1);
        }
        else {
            return 1;
        }
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }

        return false;
    }
}
