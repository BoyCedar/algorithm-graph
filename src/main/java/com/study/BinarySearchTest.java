package com.study;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,11,15,17);
        Integer item = 1;
        Integer result = binarySearch(list,item);
        System.out.println(result);
    }

    public static Integer binarySearch(List<Integer> list, Integer item) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int center = (low + high) / 2;
            if (list.get(center) > item) {
                high = center - 1;
            } else if (list.get(center) < item){
                low = center + 1;
            } else {
                return center;
            }
        }
        return null;
    }

}
