package com.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
class Prog1_SUM {

    //Approach-1
    public int[] twoSum1(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    //Approach-2
    public int[] twoSum2(int[] arr, int target) {
        int[] result = new int[2];
        Map< Integer, Integer> sumPair = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int completemnt = target - arr[i];
            if(sumPair.containsKey(completemnt)){
                result[0]=sumPair.get(completemnt);
                result[1]=i;
                return result;
            }
            else {
                sumPair.put(arr[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Prog1_SUM obj = new Prog1_SUM();
        int[] inputArr = {1, 2, 3, 5, 8, 6, 9};
//        System.out.println("The result is ::" + Arrays.toString(obj.twoSum1(inputArr, 7)));
        System.out.println("The result is ::" + Arrays.toString(obj.twoSum2(inputArr, 10)));
    }


}


// int arr[] ={1, 3, 5, 9} target = 8 output [1,2]