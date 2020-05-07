/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4ds;

/**
 *
 * @author User
 */
public class DoubleLinkedList<T> {
    private DoubleListNode head;
    
    public DoubleLinkedList(){
        head=null;
    }
    public int length(){
        int count=0;
        DoubleListNode currentNode=head;
        while(currentNode !=null){
            currentNode=currentNode.getNextLink();
            count++;
        }
        return count;
    }
    
    public void showList(){
        DoubleListNode currentNode=head;
        while(currentNode !=null){
            System.out.print(currentNode.toString());
            currentNode=currentNode.getNextLink();
        }
    }
    public boolean isEmpty(){
        return (head==null);
    }
    
    public void deleteLeftNode(){
        if(head!=null){
            head=head.getNextLink();
            head.setPreviousLink(null);
        }else
            System.out.println("The list is empty.");
    }
    
    public void addLeftNode(T a){
        head=new DoubleListNode(a,null,head);
    }
    
    public void addRightNode(T a){
        DoubleListNode newNode=new DoubleListNode(a,null,null);
        DoubleListNode currentNode=head;
        
        if(head==null){
            head=newNode;
        }else{
            while(currentNode.getNextLink() !=null)
                currentNode=currentNode.getNextLink();
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }
    
    public void deleteRightNode(){
        DoubleListNode currentNode =head;
        DoubleListNode previousNode=head;
        if(head!=null){
            if(currentNode.getNextLink()==null)
                head=null;

        else{
            while(currentNode.getNextLink()!=null){
                previousNode=currentNode;
                currentNode=currentNode.getNextLink();
            }
            currentNode=null;
            previousNode.setNextLink(null);
        }
    }else
            System.out.println("The list is yempty.");
    }
}
