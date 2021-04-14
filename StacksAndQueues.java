import java.util.*;
import java.io.*;

public class StacksAndQueues{
   public static void main(String [] args){
      Queue<String> names = new LinkedList<String>();
      names.add("Caleb");
      names.offer("Maya");
      names.add("Eaton");
      names.add("Alex");
      names.add("Nick");
      
      String n = names.remove();
      names.add(n);
            
      names.add("Payton");
      names.add("Jason");
      names.add("Arnav");
      names.add("Wortman");
      names.add("Hemaanth");
      
     //  int count = 0;
//       String first = names.remove();
//       names.add(first);
//       while (!(names.peek().equals(first))){
//          if(first.contains("a"))
//             count++;
//          
//       }
//       System.out.println(count);
      
      Stack<String> clever = new Stack<String>();
      
      while(!names.isEmpty()){
         clever.push(names.remove());
      }
      System.out.println("Queue" + names);

      System.out.println("Stack: " + clever);
      
      //no way to look at entire stack w/out destroying it
      //we need an additional data structure
      
      Stack<String> temp =new Stack<String>();
      
      while(!clever.isEmpty()){
         temp.push(clever.pop());
      }
      
      int count = 0; 
      while(!temp.isEmpty()){
         if(temp.peek().toLowerCase().contains("h"))
            count++;
         clever.push(temp.pop());
      }
      
      System.out.println(count);
   }
}