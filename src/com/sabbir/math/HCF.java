package com.sabbir.math;

/**
 * Higest common factor or greatest common divisor.
 * Input: a=100, b=200
 * Output: 100
 * <p>
 * Input: a=4, b=6
 * Output: 2
 */
public class HCF {

    public static int hdf(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        return min;
    }

    /**
     * Optimised solution.
     * Eucliclean method
     * @param a
     * @param b
     * @return
     */
    public static int hdfOrgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hdfOrgcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(hdf(6, 11));
        System.out.println(hdfOrgcd(6, 11));
    }
}
