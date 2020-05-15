/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4ds;
import java.util.*;
import java.util.function.Consumer;
/**
 *
 * @author User
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head=null;
    }
    
    public int length(){
        int count=0;
        ListNode currentNode=head;
        while(currentNode!=null){
            currentNode=currentNode.getLink();
            count++;
        }
        return count;
    }
    
   public void clear(){
       head=null;
   }
   
   public boolean isEmpty(){
       return(head==null);
   }
   public void showList(){
       ListNode currentNode=head;
       while(currentNode!=null){
           System.out.print(currentNode.toString());
           currentNode=currentNode.getLink();
       }
   }
   //insert at the back
   public void addNode(T a){
       ListNode newNode=new ListNode(a,null);
       ListNode currentNode=head;
       if(head==null){
           head=newNode;
       }
       else{
           while(currentNode.getLink()!=null)
            currentNode=currentNode.getLink();
           currentNode.setLink(newNode);
       }
   }
   
   //delete the back
   public void deleteNode(){
       ListNode currentNode=head;
       ListNode previousNode=head;
       if(head!=null){
           if(currentNode.getLink()==null)
               head=null;
           else{
               while(currentNode!=null){
                   previousNode=currentNode;
                   currentNode=currentNode.getLink();
               }
               previousNode.setLink(null);
           }
       }
       else
           System.out.println("The list is empty");
   }
   
   //add front
   public void addFrontNode(T a){
       head=new ListNode(a,head);
   }
   
   public void deleteFrontNode(){
       if(head!=null)
           head=head.getLink();
       else
           System.out.println("The list is empty");
   }
   
//   public void addSortNode(T gorila){
//        ListNode currentNode=head;
//        ListNode previousNode=head;
//        int mo,salah;
//      while(currentNode!=null){
//                   
//                   currentNode=currentNode.getLink();
//                   mo=(Integer)currentNode.getData();
//                   System.out.println("mo"+mo);
//                   salah=(Integer)previousNode.getData();
//                   System.out.println("salah"+salah);
//                   if(salah>mo){
//                       currentNode=previousNode;
//                       previousNode=currentNode;
//                   }
//                   previousNode=previousNode.getLink();
//               }
//   }
   
   public void addSortNode(T t) {
        if (head == null) { //if there's nothing on the linked
            addNode(t);
        } else {
            T currentNodeData = (T) head.getData();
            if (t.compareTo(currentNodeData) < 0) {
                addFrontNode(t);
            } else {
                ListNode currentNode = head;
                T number;
                while (true) {
                    //System.out.println(t + " " + number);
                    if(currentNode.getLink() != null) {
                        if (t.compareTo((T)currentNode.getLink().getData()) < 0) { //IT WORKS!!!
                            ListNode newNode = new ListNode(t, currentNode.getLink());
                            currentNode.setLink(newNode);
                            break;
                        } else { // move to the next node
                            currentNode = currentNode.getLink();
                            number = (T) currentNode.getData();
                        }
                    } else { // add to the last element
                        ListNode newNode;
                        newNode = new ListNode(t, null);
                        currentNode.setLink(newNode);
                        break;
                    }

                }

            }
        }
    }

       public void splitList() {
        System.out.println("Split the list into two");
        ListNode currentNode = head;
        ListNode secondNode;
        ListNode middleNode;
           
        int length = length() / 2;
        if (length() % 2 != 0) 
            length++;

        int index;
        System.out.print("First List: ");
        for (index = 0; index < length; index++) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.println("");

        secondNode = currentNode;
        middleNode = currentNode;

        for (int i = index; i < length(); i++) {
            secondNode.setLink(currentNode.getLink());
            if (currentNode.getLink() != null) {
                secondNode = secondNode.getLink();
                currentNode = currentNode.getLink();
            }
        }

        secondNode = middleNode;
        System.out.print("Second List: ");
        while (secondNode != null) {
            System.out.print(secondNode.toString());
            secondNode = secondNode.getLink();
        }
        System.out.println();
    }
       
       public void alternateList(){
           ListNode currentNode=head;
           ListNode even=head;
           
           LinkedList<T> list1=new LinkedList<>();
           LinkedList<T> list2=new LinkedList<>();
           System.out.println("Split the list by alternating the nodes");
           System.out.print("First List :");
           for (int index = 0;  index< length(); index++) {
               if(index%2==0){
                   
                   list1.addNode((T)currentNode.getData());
               }
                   currentNode=currentNode.getLink();
           }
           list1.showList(); // DISPLAY LIST1
           
           currentNode=head;
           even=currentNode;
           System.out.println("");
            System.out.print("Second List :");
           for (int index = 0;  index< length(); index++) {
               if(index%2!=0){
                   list2.addNode((T)even.getData());
               }
                   even=even.getLink();
           }
           list2.showList();
       }
       
       public void merge(){
           ListNode currentNode=head;
           ListNode even=head;
           
           LinkedList<T> list1=new LinkedList<>();
           LinkedList<T> list2=new LinkedList<>();
           LinkedList<T> combinedlist=new LinkedList<>();
           System.out.println("\nMerge First List and Second List by alternating the nodes");
          
           for (int index = 0;  index< length(); index++) {
               if(index%2==0){
                   
                   list1.addNode((T)currentNode.getData());
               }
                   currentNode=currentNode.getLink();
           }
      
           
           currentNode=head;
           even=currentNode;
          
          
           for (int index = 0;  index< length(); index++) {
               if(index%2!=0){
                   list2.addNode((T)even.getData());
               }
                   even=even.getLink();
           }
      
           int a=0,b=0;
           for (int index = 0; index < length(); index++) {
               
               if(index%2==0){
                   
                   combinedlist.addNode((T)list1.get(a));
                   a++;
               }
                   
               if(index%2!=0){
                   combinedlist.addNode((T)list2.get(b));
                   b++;
               }
               
           }
           combinedlist.showList();
           
       }
       public T get(int index){
           
        if(index >=length() || index<0||head==null){
            return null;
        }else{
            int count=0;
            ListNode currentNode=head;
            while(currentNode.getLink() !=null && count !=index){
                currentNode=currentNode.getLink();
                count++;
            }
            return (T) currentNode.getData();
        }
        
    }
       
       public void reverseListRecursive(){
           reverseListRecursive(head);
       }
       public void reverseListRecursive(ListNode curr){
           if(curr==null){
               return;
           }
           if(curr.getLink()==null){
               this.head=curr;
               return;
           }
           
           reverseListRecursive(curr.getLink());
           curr.getLink().setLink(curr);
           curr.setLink(null);
       }
     
    public void Star(int player){
        player++;
        ListNode currentNode=head;
        
        Random r=new Random();
        LinkedList<Character> P1=new LinkedList<>();
        LinkedList<Character> P2=new LinkedList<>();
        System.out.println("Player "+player+" start first");
        int per1=0;
        int per2=0;
        
        
        
        while(P1.length()<=21 || P2.length()<=21){
            
            
            
            
        if(player==1) { // player 1 starts
        per1=r.nextInt(6)+1;
        for (int i = 0; i < per1; i++) {
                P1.addNode('*');
            }
            System.out.print("Player 1: ");P1.showList();System.out.println("");
            //player2
            per2=r.nextInt(6)+1;
          for (int i = 0; i < per2; i++) {
                P2.addNode('*');
                
            }
            System.out.print("Player 2: ");P2.showList();System.out.println("");
        }
        
         if(player==2){ //player 2 starts
          per2=r.nextInt(6)+1;
        for (int i = 0; i < per2; i++) {
                P2.addNode('*');
            }
            System.out.print("Player 2: ");P2.showList();System.out.println("");
            //player2
            per1=r.nextInt(6)+1;
          for (int i = 0; i < per1; i++) {
                P1.addNode('*');
                
            }
            System.out.print("Player 1: ");P1.showList();System.out.println("");
         }
        //
        if(P1.length()>20||P2.length()>20){
        if(P1.length()>20 && P1.length()>P2.length())
                System.out.println("Player 1 wins");
                
        
        if(P2.length()>20 && P1.length()<P2.length())
                System.out.println("Player 2 wins");
        if(P1.length()==P2.length())
                System.out.println("It's A Draw!");
        
        break;
        }
        }
    }

    public class LinkedListIterator<T> implements Iterator<T>{
        private ListNode<T> currentNode=head;
        private int count=-1;
        
        @Override
        public boolean hasNext(){
            count++;
            return currentNode.getLink() !=null;
        }
        @Override
        public T next(){
            T data=(T)currentNode.getData();
            currentNode=currentNode.getLink();
            
            return data;
        }
        
                @Override
        public void remove(){
            count--;
           

        }
       
        
    }
    
    public void deleteNodeByPosition(int index){
        if(index==0)
            deleteFrontNode();
        else if(index==length()-1)
            deleteNode();
        else if(index>=length())
            System.out.println("Invalid index. No node deleted");
        else{
            ListNode currentNode=head;
            for(int i=1;i<index;i++){
                currentNode=currentNode.getLink();
            }
            ListNode tempNode=currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode=null;
        }
    }
    
    public LinkedListIterator listIterator(){
        return new LinkedListIterator();
    }
    public boolean contains(T t){
        boolean found=false;
        ListNode currentNode=head;
        while(currentNode!=null){
            if(t.compareTo((T)currentNode.getData())==0){
                found=true;
                break;
            }
            currentNode=currentNode.getLink();
        }
        return found;
    }
}
