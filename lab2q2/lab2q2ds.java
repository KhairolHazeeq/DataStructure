/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q2;


public class lab2q2ds {

    //TESTER CLASS
      public static void main(String[] args) {
     
          //
      TextFileLog<String> b=new TextFileLog<>(5);
b.insert("Daniel James 21");
b.insert("Aaron-wan Bissaka 29");
b.insert("Paul Pogba 6");
b.insert("Luke Shaw 23");
//b.insert("Bruno Fernandes 18");
//b.insert("Lindelof 31");
b.insert("De gea 1");
//b.insert("Maguire 5");
//b.insert("Martial 9");
//b.insert("Rashford 10");
//b.insert("S.Mctominay 39");
System.out.println("Log Size "+b.size());
System.out.println(b.toString());

String name="De gea 1";

if(b.search(name))
            System.out.println("Log contains "+name);
else
            System.out.println("Log does not contains "+name);
b.clear();
        System.out.println("Text File Log Size "+b.size());
    }
    }

