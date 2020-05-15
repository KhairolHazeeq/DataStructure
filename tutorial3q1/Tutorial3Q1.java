/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial3q1;

/**
 *
 * @author User
 */
public class Tutorial3Q1 {

    public static int small(int[] arr,int j){
        if(j<0){
            return 0;
        }
        else
        return arr[j-1]+small(arr,j-1);
    }
    
    public static void main(String[] args) {
        int[] arr={2,3,41,51,2,1};
        System.out.println(small(arr,arr.length));
    }
    
}
