package org.example;

public class Main {
    public static void main(String[] args) {
        //Tests
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        int[] b = {218, 18, 68, 581, 400, 446, 624, 774, 109, 967, 652, 760, 427, 490, 596};
        int[] c = {977, 764, 794, 194, 201, 982, 310, 266, 609, 255, 813, 164, 185, 205, 867};
        int[] d = {1, 1, 1, 1};


        System.out.println(HighestRatio.findRatio(a));
        System.out.println(HighestRatio.findRatio(b));
        System.out.println(HighestRatio.findRatio(c));
        System.out.println(HighestRatio.findRatio(d));
    }
}