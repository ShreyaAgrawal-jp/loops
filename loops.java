import java.io.*;
import java.util.*;
public class Practiceproject1 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        
       //Switch case
       int ch;
       System.out.println("1.hi \t2.hey \t3.hello \t");
       System.out.println("choice: ");
       ch =s.nextInt();
       switch(ch)
       {
           case 1: System.out.println("you said hi.");
                break;
           case 2: System.out.println("you said hey.");
                break;
           case 3: System.out.println("you said hello.");
                break;
           default:System.out.println("invalid choice.");     
       }
       
       //if else statement
       int a;
       System.out.println("1.morning \t2.evening \t");
       System.out.println("option: ");
       a =s.nextInt();
       if(a==1)
           System.out.println("good morning");
       else if(a==2)
           System.out.println("good evening");
       else
           System.out.println("good night");
       
       //while loop
       int i=0;
       while(i<5)
       {
           System.out.println(i);
           i++;
       }
           
       //do-while loop
       int j=6;
       do
       {
           System.out.println(j);
           j++;
       }while(j<5);
       
       //for loop
       for(int k=0;k<5;k++)
       {
           System.out.println(k);
       }
    }  
}

