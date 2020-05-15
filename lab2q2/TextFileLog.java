/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q2;

 interface SimpleLog<T>{
        public void insert(T t); //insert item to log
        public boolean isFull();//check whether log is full
        public int size();//get size of log
        public boolean search(T t);// check whether the item exists in log
        public void clear();//delete log
        public String toString();//display all items in log
    }

public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T>{
    
    private T[] log;
    private int index,maxsize;
    
    public TextFileLog(int a){
        index=-1;
        maxsize=a;
        log = (T[]) new Comparable[12];
        
    }
    
    public void insert(T t){
        if(!isFull()){
            index++;
            log[index]=t;
        }
        else{
            System.out.println("The log is full");
        }
    }
    public boolean isFull(){ return maxsize==(index+1);}
    public int size() {return index+1;}
    public boolean search(T t){
        System.out.println("Searching for "+t+" in the file");
        for(int i=0;i<=index;i++){
            if(log[i].compareTo(t)==0){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        System.out.println("Clear the text file log");
        for(int i=0;i<=index;i++)
            log[i]=(T) null;
        index=-1;
    }
    public String toString(){
        String str="";
        for(int i=0;i<=index;i++)
            str +=(i+1)+". "+log[i]+"\n";
        return str;
    }
}


