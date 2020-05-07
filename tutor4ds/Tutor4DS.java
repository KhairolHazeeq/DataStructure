/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4ds;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tutor4DS {
    
public void currency(int ringgit){
        
        
}
    public static void main(String[] args) {
       LinkedList<Double> list=new LinkedList<>();
      
        list.addFrontNode(32.8);
        list.addFrontNode(42.6);
        list.addFrontNode(12.8);
        list.addFrontNode(36.5);
        list.addFrontNode(23.1);
        /////Q1
        System.out.println("The number in the linked list");
        list.showList();
        /////Q2
        list.addNumber();
        System.out.println("\nThe updated number in the linked list");
        list.showList();
        /////Q2



//Q3 // /*
/*
LinkedList<Integer> foo=new LinkedList<>();

foo.addNode(100);
foo.addNode(50);
foo.addNode(20);
foo.addNode(10);
foo.addNode(5);
foo.addNode(1);


Scanner s=new Scanner(System.in);
System.out.print("Enter the total amount : ");
int ringgit=s.nextInt();
System.out.println("Total amount : "+ringgit);
// foo.currency(ringgit);
 
LinkedList<String> currencyNotes=new LinkedList<>();
        Integer divide=0;
        Integer num=0;
        Integer modulo=0;
        for(int i=0;i<foo.length();i++){
            
            num=(Integer) foo.get(i);
            divide=ringgit/num;
            ringgit=ringgit-(divide*num);
            String a=divide.toString();
           currencyNotes.addNode("MYR "+num+": "+a);
//           currencyNotes.set(i,2+"");
        }
//        foo.showCurrency();
        currencyNotes.showCurrency3();
        
*/
//Q3 //


//??????DOUBLELINKEDLIST //

//DoubleLinkedList<String> batista=new DoubleLinkedList<>();
//System.out.println("Insert 2 right");
// batista.addRightNode("One");
// batista.addRightNode("Two");
//
// System.out.println("Insert 2 left");
// batista.addLeftNode("gameboy");
// batista.addLeftNode("girlbruh");
//System.out.println("Double Linked List has "+batista.length()+ " nodes");
//batista.showList();

//????????DOUBLELINKEDLIST //


        //Q4
//      LinkedList<Integer> lister=new LinkedList<>();
//      lister.addNode(23);
//      lister.addNode(15);
//      lister.addNode(17);
//      lister.addNode(28);
//      lister.addNode(12);
//      lister.addNode(40); 
//      lister.showList();
//      System.out.print("\nLinked List has "+list.length()+" nodes");
//      System.out.print("\nTotal is "+lister.sum());
//      System.out.print("\nTotal even number is "+lister.even());
        //Q4
         
        
        
        
        
        
//        System.out.println("Linked List has "+list.length()+" nodes");
//        System.out.println("The number in the linked list");
//        list.showList();
        
       
//        System.out.println("\nEnter a String to search : ");
//        String str=s.nextLine();
//        if(list.contains(str)){
//            System.out.println(str+" waz found");
//        }else
//            System.out.println(str+" wasnt found");
        
//        System.out.println("Linked List: Delete 2 nodes at d back");
//        list.deleteNode();
//        list.deleteNode();
//        System.out.println("Linked List has "+list.length()+" nodes");
//        list.showList();
//        System.out.println("\nLinked List: Clear ALL these mfs");
//        list.clear();
//        System.out.println("Linked List has "+list.length()+" nodes");


//????????Q5
/*
LinkedList<Integer> Q5=new LinkedList<>();
    Random r=new Random();
        int equal=4;
        Q5.generateRandom(15, 11);
        System.out.println("Linked List has "+Q5.length()+" nodes");
        Q5.showList();
        Q5.delete(equal);
        System.out.println("");
        System.out.println("Linked List has "+Q5.length()+" nodes");
        Q5.showList();
*/
//????????Q5
/*
LinkedList<Integer> boshem=new LinkedList<>();
boshem.addNode(1);
boshem.addNode(2);
boshem.addNode(3);
boshem.addNode(4);
boshem.addNode(5);
boshem.addNode(6);
boshem.addNode(7);
boshem.adddNodeByPosition(5, 0);
  System.out.println("List length is "+boshem.length());
boshem.showList();
boshem.deleteNodeByPosition(4);
        System.out.println("\nList length is "+boshem.length());
boshem.showList();
*/

//??????????????Q6


//LinkedList<Integer> Q6=new LinkedList<>();
//        Q6.addFrontNode(8);
//        Q6.addFrontNode(10);
//        Q6.addFrontNode(17);
//        Q6.addFrontNode(23);
//        Q6.addFrontNode(34);
//        Q6.addFrontNode(45);
//        Q6.addFrontNode(78);
//        Q6.showList();
//        
//        
//        System.out.println("\nThe median "+Q6.returnmiddle());
        
        //?????????Q6
        
    }
}
        
        ///
       
    
    

