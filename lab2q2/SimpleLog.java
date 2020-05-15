/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q2;

/**
 *
 * @author User
 */
public interface SimpleLog<T>{
    public void insert(T t);
    public boolean isFull();
    public int size();
    public boolean search(T t);
    public void clear();
    public String toString();
}