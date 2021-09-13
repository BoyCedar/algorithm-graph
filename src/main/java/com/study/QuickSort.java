package com.study;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,2,3,4,12);
        System.out.println(getListSum(list,0));

        System.out.println(getListAttrCount(list,0));

        System.out.println(getMaxNumFromList(list,0));


    }

    /**
     * 递归计算数组中数字的和
     */
    public static int getListSum(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        return list.get(index) + getListSum(list,index + 1);
    }

    /**
     * 计算列表中包含的元素数
     */
    public static int getListAttrCount(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        return 1 + getListAttrCount(list,index + 1);
    }

    /**
     * 找出列表中最大的数字
     */
    public static int getMaxNumFromList(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        return list.get(index) > getMaxNumFromList(list,index + 1) ? list.get(index) : getMaxNumFromList(list,index + 1);
    }

}
