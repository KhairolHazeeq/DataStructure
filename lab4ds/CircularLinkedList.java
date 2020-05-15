/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4ds;

/**
 *
 * @author User
 */
class CircularLinkedList<T>{
    ListNode head;

    public CircularLinkedList() {
        head=null;
    }
    
    public void addCircular(T a){
        ListNode newNode=new ListNode(a,null);
        ListNode currentNode=head;
        if(head==null){
            head=newNode;
            head.setLink(head);
        }
        else
        {
            while(currentNode.getLink()!=head)
                currentNode=currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(head);
        }
    }
    public void addCircularNode(T a){
        ListNode newNode=new ListNode(a,null);
        ListNode currentNode=head;
        if(head==null){
            head=newNode;
            head.setLink(head);
        }
        else
        {
          while(currentNode.getLink()!=head)
              currentNode=currentNode.getLink();
          currentNode.setLink(newNode);
          newNode.setLink(head);
        }

    }
    
    public T getFront(){
        return (T) head.getData();
    }
    
    public T getBack(){
        ListNode currentNode=head;
        while(currentNode.getLink()!=head){
            currentNode=currentNode.getLink();
        }
        return (T) currentNode.getData();
    }
    
    public T get(int index){
        if(index==0)
            return getFront();
        else
            if(index==length()-1)
                return getBack();
        else
              
                {
                    ListNode currentNode=head;
                    for(int i=1;i<=index;i++)
                        currentNode=currentNode.getLink();
                    return (T) currentNode.getData();
                }
    }
    
    public int length(){
        int count=1;
        ListNode currentNode=head;
        while(currentNode.getLink()!=head){
            count++;
            currentNode=currentNode.getLink();
        }
        return count;
    }
    
    public void deleteCircularNode(){
        ListNode currentNode=head;
        ListNode previousNode=head;
        while(currentNode.getLink()!=head){
            previousNode=currentNode;
            currentNode=currentNode.getLink();
        }
        currentNode=null;
        previousNode.setLink(head);
    }
    
    public void showCircularNode(){
        ListNode currentNode=head;
        System.out.print(currentNode);
        while(currentNode.getLink()!=head){
            System.out.print(currentNode.getLink());
            currentNode=currentNode.getLink();
        }
        currentNode=currentNode.getLink();
        System.out.print(currentNode.getData());
        
    }


    
    
}
