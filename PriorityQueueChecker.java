//Team #3
//PriorityQueueChecker

import java.util.*;
import java.io.*;

public class PriorityQueueChecker 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//PriorityQueue<Integer> pqInt = new PriorityQueue<Integer>();
      MyPriorityQueue pqInt = new MyPriorityQueue();

		pqInt.add(100);
		pqInt.add(33);
		pqInt.add(89);
		pqInt.add(-4);
		pqInt.add(25);
		pqInt.add(-99);
		
		System.out.println(pqInt); //[-99, 25, -4, 100, 33, 89]
		
		System.out.println(pqInt.remove()); // -99
		System.out.println(pqInt.remove()); // -4
		System.out.println(pqInt.remove(100)); // true
		System.out.println(pqInt.remove(-45)); // false
		
      System.out.println(pqInt);
      
		//PriorityQueue<String> pqString = new PriorityQueue<String>();
      MyPriorityQueue pqString = new MyPriorityQueue();

		pqString.add("Mr. Cadle");
		pqString.add("Tran");
		pqString.add("Jing");
		pqString.add("Maya");
		pqString.add("Nick");
		pqString.add("Alex");
		pqString.add("Hemanth");
      pqString.add("Olivia");
		
		System.out.println(pqString);//[Alex, Maya, Hemanth, Olivia, Nick, Mr. Cadle, Jing, Tran]		
		pqString.remove("Matthew");
		pqString.remove("Mr. Cadle");
		
      //Alex Hemanth Jing Maya Nick
      for(int i=0; i<5; i++)
      {
      System.out.print(pqString.remove() + " ");
      }
      
      System.out.println(pqString); //[Olivia,Tran]
      System.out.println();
      
      //Olivia, Tran
      while(!pqString.isEmpty())
      {
         System.out.print(pqString.remove() + " ");
      }
      
		System.out.println(pqString.remove()); //null 
			  		
	}
}