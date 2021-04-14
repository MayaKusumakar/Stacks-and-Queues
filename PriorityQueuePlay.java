import java.io.*;
import java.util.*;

public class PriorityQueuePlay{
   public static void main(String[] args){
      MyPriorityQueue pq = new MyPriorityQueue();
      pq.add("Knezek");
      pq.add("Tran");
      pq.add("Loomis");
      pq.add("Eaton");
      pq.add("Jefferson");
      pq.add("Kusumakar");
      
      while(!pq.isEmpty()){
         System.out.print(pq.remove() + " ");      
      }
      System.out.println();
   }
}