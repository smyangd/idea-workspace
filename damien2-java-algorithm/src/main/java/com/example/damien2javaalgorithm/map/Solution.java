package com.example.damien2javaalgorithm.map;

import java.util.*;
/**
 *
 *
 *两个数组的交集
 *
 * */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int[] in = null;
       


            for (int numn1 : nums1) {
                set1.add(numn1);
            }
            for (int numn2 : nums2) {
                set2.add(numn2);
            }
            for (int iset1 : set1) {
                for (int iset2 : set2) {
                    if (iset1 == iset2) {
                        list.add(iset1);


                    }

                }

            }
            
            in = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                in[i] = list.get(i);
            }


        return in;
        
    }

    public static void main(String[] args) {
        //int[] a = {1,2,3,4,5,6};
        //int[] b = {3,4,5,6};
        int[] b = {};
        int[] b2 = {};
        int[] result = (new Solution()).intersection(b, b2);
        for (int i : result) {
            System.out.println(i);
        }

    }
}