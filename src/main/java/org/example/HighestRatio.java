package org.example;

import java.util.List;
import java.util.ArrayList;

public class HighestRatio {
    public static double findRatio(int[] arr) {

        //O(1) time complexity
        if (arr.length < 4)
            return -1;

        //O(1) time complexity
        List<Integer> list = new ArrayList<>(4);
        double[] nums = new double[4];
        int minIndex, maxIndex, i;

        //O(n) time complexity; one loop corresponding to input size n
        for (i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        //O(n) time complexity; inner loop corresponding to approximately input size n executes twice from outer loop
        for (i = 0; i < 2; i++) {
            minIndex = 0;
            for(int j = 1; j < list.size(); j++) {

                if(list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }


            }
            nums[i] = list.remove(minIndex);
        }

        //O(n) time complexity; inner loop corresponding to approximately input size n executes twice from outer loop
        for (i = 0; i < 2; i++) {
            maxIndex = 0;
            for(int j = 1; j < list.size(); j++) {

                if(list.get(maxIndex) < list.get(j)) {
                    maxIndex = j;
                }


            }
            nums[i + 2] = list.remove(maxIndex);
        }

        /* TEST:
        System.out.println(nums[2] + " " + nums[3] + " " + nums[0] + " " + nums[1]);
        */

        //O(1) time complexity
        return (nums[2] + nums[3]) / (nums[0] + nums[1]);


    }
}
