/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q1ds;

/**
 *
 * @author User
 */
import java.util.LinkedList;
import java.util.Random;

public class Generate<T> {
    private boolean[] internal;
    private LinkedList<Integer> list;
    private int n;
    private T type;

    public Generate(T t, int n){
        this.n = n;
        Random r = new Random();
        int current;
        this.type = t;
        if (type instanceof Integer[]){ // array implementation
            internal = new boolean[101];
            for (int i = 0; i<n; i++){
                while (true){
                    current = r.nextInt(101);
                    if (!internal[current]){
                        internal[current] = true;
                        break;
                    }
                }
            }
        } else if (type.getClass()== LinkedList.class){
            list = new LinkedList<>();
            for (int i = 0; i<n; i++){ //linked list implementation
                while (true) {
                    current = r.nextInt(101);
                    if (!list.contains(current)) {
                        list.add(current);
                        break;
                    }
                }
            }
        }
    }

    public String toString(){
        String builder = "";
        if (type instanceof  Integer[]) {
            int i = 0;
            for (boolean value : internal) {
                if (value) {
                    builder += i + " ";
                }
                i++;
            }

            return "Array implementation \n" +
                    builder;
        } else {
            for (int value: list){
                builder += value + " ";
            }

            return "LinkedList implementation \n" +
                    builder;
        }
    }


}

