package com.softwaretesting.testing.util;

import org.springframework.util.Assert;


public class Misc {

    public static int sum(int arg1, int arg2) {
        if(arg1 > 100 || arg2 > 100){
            throw new TooLargeNumbers("Numbers greater than 100 not allowed");
        }
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

    public int subtract(int n1, int n2){
        if(n1<n2){
            return 0;
        }
        return n1-n2;
    }

    public int multiply(int n1, int n2){

        return n1*n2;
    }
}
