/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q3;

/**
 *
 * @author User
 */
import java.util.Random;
import java.util.Scanner;
public class LAB3Q3 {


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rndm = new Random();
    System.out.print("Enter number of elements: ");
        int user = input.nextInt();
        char[] dNum = new char[user]; 
    for (int i = 0; i < user; i++) {
        int rndmNum =  rndm.nextInt(10);
        String eNum = Integer.toString(rndmNum);
        char eNumC = eNum.charAt(0);
        dNum[i]=eNumC;
    }
    System.out.println(dNum);
    findPermutations(dNum,0,dNum.length);
}    
 
static void findPermutations(char str[], int index, int n) { 
        if (index >= n) { 
            System.out.println(str); 
            return; 
        } 
  
        for (int i = index; i < n; i++) { //looping until final element
            // Proceed further for str[i] only if it  
            // doesn't match with any of the characters  
            // after str[index]  
            boolean check = shouldSwap(str, index, i); //check from 0th element till i 
            if (check){
                swap(str, index, i);//tukar the index dengan i
                
                findPermutations(str, index + 1, n);//index tambah di sini
               
                swap(str, index, i); 
            } 
        } 
}
    
static boolean shouldSwap(char str[], int start, int curr) { 
        for (int i = start; i < curr; i++) { 
            if (str[i] == str[curr]) { 
                return false; 
            } 
        } 
        return true; 
}
    
static void swap(char[] str, int i, int j) { 
        char c = str[i]; 
        str[i] = str[j]; 
        str[j] = c; 
    } 
}



