/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

/**
 *
 * @author User
 */
public class Stack<T> {
    private ListNode head;
    
    public Stack(){
        head=null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public int getSize(){
        int count=0;
        ListNode currentNode=head;
        while(currentNode !=null){
            currentNode=currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public T get(int index){
        if(index >=getSize() || index<0||head==null){
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
    
    public void push(T a){
        head=new ListNode(a,head);
    }
    public T pop(){
        if(head==null)
            return null;
        T temp=(T) head.getData();
        head=head.getLink();
        return temp;
    }
    public T peek(){
        if(head==null)
            return null;
        else 
            return(T) head.getData();
    }
    public void showStack(){
        if(isEmpty())
            System.out.println("Empty Stack");
        else{
            ListNode currentNode=head;
            while(currentNode!=null){
              // System.out.print(currentNode.toString());
                System.out.print(currentNode.toString2()); //Q3 only
                currentNode=currentNode.getLink();
            }
        }
    }
    
}
