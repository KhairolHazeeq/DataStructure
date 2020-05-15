/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q2;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.FileWriter;
public class LAB3Q2 {

    public static void main(String[] args)throws IOException, FileNotFoundException{
    Scanner a = new Scanner(new FileInputStream("LAB3Q2Input.txt"));
    FileOutputStream b = new FileOutputStream("LAB3Q2Output.txt");    
    while(a.hasNextLine()){
            String line = a.nextLine();
            int length = line.length();
            rec(line,length,b);
            System.out.println("");
        }
    b.close();
    }
    public static void rec(String line, int length,FileOutputStream lol)throws IOException, FileNotFoundException  {
         String skipline ="\n";
         byte b[] = skipline.getBytes();
        if(length==0){
            lol.write(0);
        }else{
            //PrintWriter a = new PrintWriter(new FileWriter("L3Q2Output.txt",true));//kalau tak pakai ni nanti dia akan keep 
                                                                                     //overwrite the old file so end up with 'h' je
            char Char = line.charAt(length-1);//atau just guna cara ni
            lol.write(Char);
            System.out.print(Char);
            rec(line,length-1,lol);
        }
    }
}
