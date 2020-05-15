/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4ds;

import java.util.*;


public class LAB4DS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        
        //////////////////////////////////Q1
//        LinkedList<Integer> Q1back=new LinkedList<>();
//        LinkedList<Integer> Q1front=new LinkedList<>();
//        LinkedList<Integer> Q1sorted=new LinkedList<>();
//        int[]array=new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i]=r.nextInt(101);
//        }
//        System.out.print("The random numbers are: ");
//        for(int a:array){
//            System.out.print(a+" ");
//        }
//        System.out.println("");
//       //add at d back
//        for (int i = 0; i < 10; i++) {
//             Q1back.addNode(array[i]);
//        }
//           
//            System.out.println("Insert the random numbers at the back of linked list");
//            Q1back.showList();
//            System.out.println("");
////            //add infron
//         for (int i = 0; i < 10; i++) {
//            
//            Q1front.addFrontNode(array[i]);
//        }
//            System.out.println("Insert the random numbers in front of d linked list");
//             Q1front.showList();
//           System.out.println("");
//             for (int i = 0; i < 10; i++) {
//            Q1sorted.addSortNode(array[i]);
//        }
//
//            System.out.println("Insert the random numbers in sorted linked list");
//            Q1sorted.showList();
        
       
        //////////////////////////////////////Q1
        
        //////////////////////////////////////Q2
        LinkedList<Character> Q2=new LinkedList<>();
    
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a word : ");
        String sentence=s.next();
        int n=sentence.length();
        char[] array=new char[n];
        
        for (int i = 0; i < n; i++) {
            array[i]=sentence.charAt(i);
            Q2.addNode(array[i]);
        }
        System.out.print("The original list : ");Q2.showList(); System.out.println("");
        Q2.splitList();
        Q2.alternateList();
        Q2.merge();
        System.out.println("");
        System.out.println("Reverse the list. Recursive method in the LinkedList");
       
        Q2.reverseListRecursive();
        Q2.showList();System.out.println("");
        System.out.println("Reverse the list. Recursive method in tester class.");
        reverse(sentence,n);

      /////////////////////Q2
      ////////////////////Q3
//        LinkedList<String> Q3=new LinkedList<>();
//        Course Programming=new Course("WXX101","Programming",5.0,'B');
//        Q3.addNode(Programming.toString());
//       
//        Course Networking=new Course("WXX201","Networking",4.0,'C');
//        Q3.addNode(Networking.toString());
//   
//        Course OS=new Course("WXX301","Operating System",3.0,'A');
//        Q3.addNode(OS.toString());
//        
//        
//        Q3.showList();
//        //#kira-kira jom
//        Double jam1=Programming.getCredit();
//        Double jam2=Networking.getCredit();
//        Double jam3=OS.getCredit();
//        Double totalpoints=((jam1*Programming.getGrade())+(jam2*Networking.getGrade())+(jam3*OS.getGrade()));
//        System.out.println("Total point is "+totalpoints);
//        Double totalcred=(jam1+jam2+jam3);
//        
//        System.out.println("Total credit is "+totalcred);
//        System.out.printf("%s %.2f","Grade point average is",(totalpoints/totalcred));
//        
        //////////////////Q3
        
        //////////////////Q4
//        LinkedList<Character> Q4=new LinkedList<>();
//        
//        Q4.Star(r.nextInt(2)); //Player 1 or player 2 start
        
        //////////////////Q4
        
        //////////////////Q5
//        LinkedList<String> Q5=new LinkedList<>();
//        Q5.addNode("ARS");
//        Q5.addNode("CHE");
//        Q5.addNode("LEI");
//        Q5.addNode("MAN");
//        Q5.addNode("LIV");
//        Q5.addNode("TOT");
//        System.out.print("The list consists of ");
//        Q5.showList();
//        System.out.println("");
//        
//        
//        
//        //Iterator
//        Iterator<String> iterator=Q5.listIterator();
//        int n=0;
//       
//        while(iterator.hasNext()){
//            
//           
//            
//            if(iterator.next().contains("A")){
//                
//                iterator.remove();
//                
//            }
//            n++;
//        }
//        System.out.print("Updated list contains");
//        Q5.showList();
        //////////////////////////Q5
        
        ////////////////////////?Q6
//        int[]array=new int[10];
//        DoubleLinkedList<Integer> Q6=new DoubleLinkedList<>();
//        DoubleLinkedList<Integer> Q62=new DoubleLinkedList<>();
//        DoubleLinkedList<Integer> Q63=new DoubleLinkedList<>();
//        System.out.print("The random numbers are : ");
//        for (int i = 0; i < 10; i++) {
//            array[i]=r.nextInt(101);
//            System.out.print(array[i]+" ");
//        }
//        System.out.println("\nInsert the random numbers into the double linked list");
//        for (int i = 0; i < 10; i++) {
//            Q6.addRightNode(array[i]);
//            Q62.addRightNode(array[i]);
//            Q63.addRightNode(array[i]);
//        }
//        Q6.deleteNodeAtPosition(2);
//        System.out.println("Remove a number from the third position");
//        Q6.showList();
//        System.out.println("\nReplace the number in seventh position with 999");
//        Q62.ReplaceAtPosition(7);
//        Q62.showList();
//        System.out.print("\nRemove all even number from the double linked list");
//        System.out.println("");
//        int num=Q63.length();
//        int k=0;
//        for (int i = k; i < Q63.length();) {
//            
//            if(Q63.get(i)%2!=0){
//                i++;
//            }else{
//                Q63.deleteNodeAtPosition(i);
//                k=0;
//            }
//        }
//Q63.removeeven();
//        Q63.showList();
////////////////////////?Q6

////////////////////////Q7
//System.out.print("Enter a sentence : ");
//Scanner s=new Scanner(System.in);
//String borneo=s.nextLine();
//String array[]=borneo.split(" ");
//CircularLinkedList<String> list=new CircularLinkedList<>();
//        for (int i = 0; i < array.length; i++) {
//            list.addCircularNode(array[i]);
//        }
//        System.out.println("The words in the circular linked list");
//        list.showCircularNode();
//        System.out.println("\nAfter delete a word");
//        list.deleteCircularNode();
//        list.showCircularNode();
//        
//        System.out.println("\nThe second item in the list is "+list.get(1));
//        
    }   
    
    
    
    public static void  reverse(String sentence,int size){
           if(size==1)
               System.out.print(sentence.charAt(size-1)+"--> ");
           else{
               System.out.print(sentence.charAt(size-1)+"--> ");
               reverse(sentence,--size);
           }
       }
    
}
