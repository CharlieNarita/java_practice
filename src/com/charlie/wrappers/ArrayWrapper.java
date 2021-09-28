package com.charlie.wrappers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayWrapper {
    public static void main(String[] args) {
        int[] arr = {1, 109, 5, -3 , 23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        //1.Arrays.sort(arr, new Comparator(){})
        //2.invoke private static <T> void binarySort(T[] a, int lo, int hi, int start,
        //                                       Comparator<? super T> c)

         /*
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (c.compare(pivot, a[mid]) < 0)   //invoke the compare() method
                right = mid;
            else
                left = mid + 1;
        }
        */
        Integer[] arr2 = {1, -3, 113, 76, 56, 666};
        Arrays.sort(arr2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
