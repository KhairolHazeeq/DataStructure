/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

import java.util.*;

/**
 *
 * @author User
 */
public class Tutorial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
//       Stack<Character> stack=new Stack<>();
//        System.out.println("Insert three nodes into the stack");
//        stack.push('D');
//        stack.push('N');
//        stack.push('A');
//        stack.showStack();
//        System.out.println("\nPop one node from the stack");
//        stack.pop();
//        
//        System.out.println("\nThe element on the top of the stack is "+stack.peek());
//        stack.showStack();
//        
//        System.out.println("\nThe number of elements in the stack is "+stack.getSize());
//        stack.showStack();
//        
//        System.out.println();
        
        //Q2
//        ArrayStack<Character> arr = new ArrayStack(10);
//        System.out.println("Stack implementation using Array");
//        System.out.println("Insert three nodes into the stack");
//        arr.push('A');
//        arr.push('N');
//        arr.push('D');
//        arr.showStack();
//        System.out.println("Pop one node from the stack");
//        arr.pop();
//        arr.showStack();
//        System.out.println("The element on the top of the stack is " + arr.peek());
//        arr.showStack();
//        System.out.println("The number of elements in the stack is " + arr.getSize());
//        
////        for(int i = 1 ; i < 10 ; i++){
////            arr.push('c');
////            arr.showStack();
////        }

          //Q3
          Scanner s=new Scanner(System.in);
          Stack<Character> c=new Stack();
          Stack<String> d=new Stack();
          
          System.out.print("Enter a sentence : ");
          String sentence=s.nextLine();
          String[] word = sentence.split(" ");
          System.out.println(word.length);
          int a=0;
          for (int i = 0; i < word.length; i++) {
              for (int j = 0; j < word[i].length(); j++) {
                  c.push(word[i].charAt(j));
              }
              c.push(' ');
        }
          
          for (int i = 0; i < word.length; i++) {
            d.push(word[i]);
            d.push(" ");
        }
          
          c.pop();
          System.out.print("Reversed sentence : " );
          c.showStack();
          System.out.print("\nReversed word : ");
          d.showStack();
//          
//          System.out.println("\nReversed sentence : "+reverseSentence(word));      AFIQ punya 
//          System.out.println("Reversed word : "+reverseWord(word));
          
          //Question 4
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter N : ");
//        int n=sc.nextInt();
//        
//        Stack<Integer> g=new Stack<>();
//        
//        g.push(n);
//        g.push(8);
//        g.push(5);
//        g.push(1);
//        
//        for (int i = 0; i < g.getSize(); i++) {
//            System.out.println("Fib("+g.get(i)+"): "+Fibo(g.get(i)));
//        }
//        LinkedList<Integer> list = new LinkedList<>(); // afiq pnya
//        list.add(1);
//        list.add(5);
//        list.add(8);
//        list.add(14);
//        
//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println("Fib(" + list.get(i) + "): " + Fibonacci(list.get(i)));
//        }

        //Q5
//                LinkedList<String> list = new LinkedList();
//        list.add("(())");
//        list.add(")()(");
//        list.add("((())())()");
//        list.add("(())()))");
//        list.add("())");
//        list.add("((((((((");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) + " " + checkbalanced(list.get(i)));
//        }

        //Q6
//        int[] arr = new int[10];
//        Random random = new Random();
//        System.out.print("The random numbers are : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        Stack<Integer> stack = new Stack<>();
//        boolean isOdd = true;
//        int currentIndex = 0;
//        int iterationRound = 0;
//        while (iterationRound != 20) {
//            int currentNumber = arr[currentIndex];
//            if (currentNumber != -1) {
//                if (isOdd && currentNumber % 2 != 0) {
//                    stack.push(currentNumber);
//                    arr[currentIndex] = -1; // Change value to -1 as done
//                    isOdd = false;
//                } else if (!isOdd && currentNumber % 2 == 0) {
//                    stack.push(currentNumber);
//                    arr[currentIndex] = -1;
//                    isOdd = true;
//                }
//            }
//            if (currentIndex == arr.length - 1) {
//                currentIndex = 0;
//                iterationRound++;
//            } else {
//                currentIndex++;
//            }
//        }
//        System.out.print("The numbers in the stack : ");
//        stack.showStack();
//        System.out.println("\nThe numbers remain in the array : " + stack.getSize());
    }
    public static int Fibo(int n){
        if(n==1 || n==2)
            return 1;
        int sum=0;
        int temp=0;
        Stack<Integer> f=new Stack<>();
        
        f.push(1); //for 1
        f.push(1); //for 2
        for (int i = 2; i < n; i++) {
            temp=f.pop();
            sum = temp+f.pop();
            f.push(temp);
            f.push(sum);
        }
        
        return sum;
    }
     public static String checkbalanced(String a) {
        if (a.charAt(0) == ')') {
            return "is not balanced";
        } else {
            Stack s = new Stack();
            s.push(a.charAt(0));
            int i = 1;
            while (i < a.length()) {
                if (a.charAt(i) == '(') {
                    s.push(a.charAt(i));
                } else if (a.charAt(i) == ')') {
                    if (s.isEmpty()) {
                        return "is not balanced";
                    }
                    s.pop();
                }
                i++;
            }
            if (!s.isEmpty()) {
                return "is not balanced";
            } else {
                return "is balanced";
            }
        }
    }
//     public static int Fibonacci(int n) {          AFIQ pnya
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            Stack<Integer> stack = new Stack();
//            int sum = 0;
//            int index = 2;
//            stack.push(1);
//            stack.push(1);
//            while (index != n) {
//                int temp = stack.pop();
//                sum = temp + stack.pop();
//                stack.push(temp);
//                stack.push(sum);
//                index++;
//            }
//            return sum;
//        }
//    }
      public static String reverseSentence(String[] arr) {
        Stack a = new Stack();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            StringBuffer buff = new StringBuffer(arr[i]);
            buff = buff.reverse();
            a.push(buff);
        }
        while (!a.isEmpty()) {
            str += a.pop() + " ";
        }
        return str;
    }

    public static String reverseWord(String[] arr) {
        Stack<String> b = new Stack();
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            b.push(arr[i]);
        }
        while (!b.isEmpty()) {
            str += b.pop() + " ";
        }
        return str;
    }
    
}
