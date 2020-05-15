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
public class DoubleListNode<T> {
    private T data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;
    
    public DoubleListNode(){ //Constructor without argument
        data=null;
        previousLink=null;
        nextLink=null;
    }
    
    public DoubleListNode(T a,DoubleListNode b,DoubleListNode c){ //Constructor wif argument
        data=a;
        previousLink=b;
        nextLink=c;
    }

    public T getData() {
        return data;
    }

    public void setData(T a) {
        data=a;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DoubleListNode a) {
        previousLink = a;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(DoubleListNode a) {
        nextLink = a;
    }
    
    public String toString(){
        return " <-- "+data+" --> ";
    }
}
