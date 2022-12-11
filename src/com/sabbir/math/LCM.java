package com.sabbir.math;


/**
 * a*b = gcd(a,b) * lcm(a,b)
 * so lcm(a,b) = (a*b)/gcd(a,b)
 */
public class LCM {


    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                break;
            }
            max++;
        }
        return max;
    }

    public static int hdfOrgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hdfOrgcd(b, a % b);
        }
    }

    public static int lcm1(int a, int b) {
        return (a * b) / hdfOrgcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(20, 10));
        System.out.println(lcm1(20, 10));
    }
}
