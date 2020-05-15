/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q1;
import java.util.*;
/**
 *
 * @author User
 */

public class LAB3Q1 {


    public static void main(String[] args) {
        System.out.println(mesh(7,1));
    }
    
    public static int mesh(int a,int b){

        if(b!=a){
        return a-b+mesh(a,b+1);
        }
        return 0;
    }
 

}

    

