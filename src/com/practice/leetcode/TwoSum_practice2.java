package com.practice.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_practice2 {


    public int [] findTwoSumIndex(int [] arr, int target){
        int [] result = new int[2];

        Map< Integer, Integer> twoSumMap = new HashMap<>();
        int contributor;

        for( int i =0 ; i< arr.length; i++){
            contributor = target - arr[i];
            if(twoSumMap.containsKey(contributor)){
                result[0]= twoSumMap.get(contributor);
                result[1]= i;
                return result;
            } else {
                twoSumMap.put(arr[i], i);
            }

        }
        return result;
    }

    public int[] findIndicesUsingTwoPointers(int [] inputArray, int target){

        int [] result = new int[2];

        // sample {1,2,4,7,3,8} target 5  ==> answer {1,4}

        int center;
        int starting;
        int ending;





        return result;
    }

    public static void main(String[] args) {
        TwoSum_practice2 test = new TwoSum_practice2();
        int []arr = {1,2,4,7,8,3};
        int target = 12;
        System.out.println("The result is :: " +Arrays.toString(test.findTwoSumIndex( arr, target)));


    }
}
