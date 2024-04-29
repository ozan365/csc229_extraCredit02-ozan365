package org.example;

import java.util.List;
import java.util.ArrayList;

public class HighestRatio {
    public static double findRatio(int[] arr) {
        List<Integer> list = new ArrayList<>(4);
        double[] nums = new double[4];
        int minIndex, maxIndex, i;

        for (i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (i = 0; i < 2; i++) {
            minIndex = 0;
            for(int j = 1; j < list.size(); j++) {

                if(list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }


            }
            nums[i] = list.remove(minIndex);
        }

        for (i = 0; i < 2; i++) {
            maxIndex = 0;
            for(int j = 1; j < list.size(); j++) {

                if(list.get(maxIndex) < list.get(j)) {
                    maxIndex = j;
                }


            }
            nums[i + 2] = list.remove(maxIndex);
        }

        /*
        System.out.println(nums[2] + " " + nums[3] + " " + nums[0] + " " + nums[1]);
        */

        return (nums[2] + nums[3]) / (nums[0] + nums[1]);


    }
}
