/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4ds;

import java.util.Random;

/**
 *
 * @author User
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList() {
       head=null;
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
    
    
    public void set(int index, T data){
        if(index>=length()||index<0||head==null){
            return;
        }else{
            int count=0;
            ListNode currentNode=head;
            while(currentNode.getLink()!=null && count!=index){
                currentNode=currentNode.getLink();
                count++;
            }
            currentNode.setData(data);
        }
    }
    
    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }
    
    
    public void clear(){
        head=null;
    }
    public void addNumber(){
        ListNode<T> currentNode=head;
        Double value;
        while(currentNode !=null){
            value=(Double) currentNode.getData();
            if(value>20){
                value+=10.5;
                currentNode.setData((T) value);
               
            }
            currentNode=currentNode.getLink();
            
        }
    }
    
    public int length(){
        int count=0;
        ListNode currentNode=head;
        while(currentNode !=null){
            currentNode=currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    public void showList(){
        ListNode currentNode=head;
        while(currentNode !=null){
            System.out.print(currentNode.toString());
            currentNode=currentNode.getLink();
        }
    }
    //ADD NODE BY POSITION
    public void adddNodeByPosition(T a,int index){
        if(index==0)
            addFrontNode(a);
        else if(index==length())
            addNode(a);
        else if(index>length())
            System.out.println("Invalid index. No node inserted");
        else{
            ListNode newNode =new ListNode(a,null);
            ListNode currentNode=head;
            for(int i=1;i<index;i++){
                currentNode=currentNode.getLink();
            }
            ListNode tempNode=currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }
    }
    
    //DELETE NODE BY POSISTION
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
    
    //INSERT AT THE BACKK
    public void addNode(T a){
        ListNode newNode=new ListNode(a,null);
        ListNode currentNode=head;
        if(head==null){
            head=newNode;
        }
        else{
            while(currentNode.getLink() !=null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }
    
    //DELETE FROM THE BACK
    public void deleteNode(){
        ListNode currentNode=head;
        ListNode previousNode=head;
        if(head!=null){
            if(currentNode.getLink()==null)
                head=null;
            else{
                while(currentNode.getLink()!=null){
                    previousNode=currentNode;
                    currentNode=currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else
            System.out.println("The list is yempty");
    }
    
    //ADD IN FRONT
    public void addFrontNode(T a){
        head=new ListNode(a,head);
    }
    public void deleteFrontNode(){
        if(head !=null)
            head=head.getLink();
        else 
            System.out.println("The list empty.");
    }
    
    public boolean contains (T t){
        boolean found = false;
        ListNode currentNode=head;
        while(currentNode !=null){
            if(t.compareTo( (T) currentNode.getData())==0){
                found=true;
                break;
            }
            currentNode=currentNode.getLink();
        }
        return found;
    }
    
    public int sum(){
         ListNode<T> currentNode=head;
        Integer sum=0;
        Integer num=0;
        while(currentNode !=null){
            
            num=(Integer) currentNode.getData();
            sum=sum+num;
            currentNode=currentNode.getLink();
            
        }
        return sum;
    }
    public int even(){
        ListNode<T> currentNode=head;
        Integer even=0;
        Integer num=0;
        while(currentNode !=null){
            
            num=(Integer) currentNode.getData();
            if(num%2==0)
                even++;
            currentNode=currentNode.getLink();
            
        }
        return even;
    }
    ////Q3
    public void currency(int ringgit){
         ListNode<T> currentNode=head;
        Integer divide=0;
        Integer num=0;
        Integer modulo=0;
        while(currentNode !=null){
            
            num=(Integer) currentNode.getData();
            divide=ringgit/num;
            modulo=ringgit%num;
            currentNode=currentNode.getLink();
            
        }
        
        ///
        
    }
    
    public void showCurrency(){
        ListNode currentNode=head;
        while(currentNode !=null){
            System.out.println(currentNode.toString2());
            currentNode=currentNode.getLink();
        }
    }
    public void showCurrency3(){
        ListNode currentNode=head;
        while(currentNode !=null){
            System.out.println(currentNode.toString3());
            currentNode=currentNode.getLink();
        }
    }
    /////Q3
    
    //???????????Q5
    public void generateRandom(int n,int bound){
        Random r=new Random();
        for(int i=0;i<n;i++){
            this.addNode((T)(Integer)r.nextInt(bound));
        }
    }
    
    public void delete(Integer value){
        ListNode currentNode=head;
        while(this.contains((T)value)){
            int index=this.getIndexOf((T)value);
            this.deleteNodeByPosition(index);
        }
    }
    
    public int getIndexOf(T value){
        //if element doesnt exist return -1
        if(this.contains(value)){
            for(int i=0;i<this.length();i++){
                if(this.get(i)==value){
                    return i;
                }
            }
            
        }
        return -1;
    }
    //Q6
   public int returnmiddle(){
       
       int mid=this.length()/2;
       
       
         return (Integer)this.get(mid);
            }
   //Q6
      
   }
     
     
    //???????????Q5
     

