/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q1ds;

import java.util.LinkedList;

interface GenerateN<T>{
    
}
public class Lab2Q1DS {

    public static void main(String[] args) {
        int n = 20;
        Integer[] array = new Integer[n];
        LinkedList<Integer> list = new LinkedList<>();

        Generate<Integer[]> j = new Generate<>(array, n);
        Generate<LinkedList> k = new Generate<>(list, n);

        System.out.println(j);
        System.out.println(k);
    }
    
}
