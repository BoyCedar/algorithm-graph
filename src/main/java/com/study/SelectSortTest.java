package com.study;

public class SelectSortTest {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,2,8,7,4,6};

        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
