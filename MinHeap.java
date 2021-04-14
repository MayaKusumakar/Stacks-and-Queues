import java.io.*;
import java.util.*;

public class MinHeap{
   private ArrayList<Comparable> list;
//child index/2 = parent
//parent index * 2 = left child
//parent index * 2 + 1 = right child   
   
   public MinHeap(){
   list = new ArrayList<>();
   list.add(null);
   }               
                     
   public void add(Comparable c){
      list.add(c);
      if(list.size() <= 2){
         return;
      }
      else{
      int i = list.size()-1;
      while(i>1 && list.get(i).compareTo(list.get(parent(i)))<0){
         swap(i, parent(i));
         i = parent(i);
      }   
      }
      //heapifyUp(i);
      
   }
   
  
   
   private int min(Comparable a, Comparable b){
      if(a.compareTo(b)<0){
         return list.indexOf(a);
      }
      else if(a.compareTo(b)>0){
         return list.indexOf(b);
      }
      return 0;
   }
   
   public boolean isEmpty(){
      if(list.size() == 1)
         return true;
      return false;
   }
   
   private int parent(int i){
      return i/2;
   }
   
   private int leftChild(int i){
      return i*2;
   }
   
   private int rightChild(int i){
      return (i*2) +1;
   }
   
   private void swap(int first, int second){
      Comparable temp = list.get(first);
      list.set(first, list.get(second));
      list.set(second, temp);
   }
   
   
   
   //used in add() method
   public void heapifyUp(int i){
      while(i < list.size()/2 && list.get(i).compareTo(list.get(parent(i)))<0){
         swap(i, parent(i));
         i = parent(i);
      }     
   }
   
   public boolean remove(Comparable c){
      if(!(list.contains(c))){
         return false;
      }
      int index = list.indexOf(c);
      
      list.set(index, list.get(list.size()-1));
      list.remove(list.size()-1);
      heapifyDown(1);
      return true;
    
   }
   
    public Comparable remove(){
      if(list.size() ==1){
         return null;
      }
      
      Comparable val = list.get(1);
      list.set(1, list.get(list.size()-1));
      list.remove(list.size()-1);
      heapifyDown(1);
      return val;
   }
   
   //used in remove() method
   
   private void heapifyDown(int i){
   if(i<=(list.size()/2)-1){
   
       if (list.get(i).compareTo( list.get(leftChild(i)))>0 || list.get(i).compareTo( list.get(rightChild(i)))>0){  
 
           if(list.get(leftChild(i)).compareTo( list.get(rightChild(i)))>0){
                //int iTemp = rightChild(i);
                swap(i, rightChild(i));
                heapifyDown((i*2) + 1);
           }
           else {
               // int iTemp2 = leftChild(i);
                swap(i, leftChild(i));
                heapifyDown(i*2);
                
             }
             
             
          }
       
       }
       
       if(list.size() == 3){
         if(list.get(1).compareTo(list.get(2))>0){
            swap(1,2);
         }
       }
       }
     //  if(i<(list.size()/2)-1){
//       if(list.get(i).compareTo(list.get(i*2))>0){
//          swap(i, leftChild(i));
//          heapifyDown(i*2);
//       }
//       }
      
  
           
        
        
      // while(i<list.size() && list.get(i).compareTo(min(list.get(leftChild(i)), list.get(rightChild(i)))) >0){
//          swap(min(list.get(leftChild(i)), list.get(rightChild(i))),i);
//          //swap(min(list.get(leftChild(i)), list.get(rightChild(i)), i));
//          i=min(list.get(leftChild(i)), list.get(rightChild(i)));
         

   
   //returns the heap without first element
   public String toString(){
   String str = "[";
   for(int i = 1; i < list.size()-1; i++){
      str+=list.get(i);
      str+=", ";
   }
   str+= list.get(list.size()-1) + "]";
   return str;
   }
   
   
   public static void main(String[] args){
      MinHeap pqString = new MinHeap();
     pqString.add("Mr. Cadle");
		pqString.add("Tran");
		pqString.add("Jing");
		pqString.add("Maya");
		pqString.add("Nick");
		pqString.add("Alex");
		pqString.add("Hemanth");
      pqString.add("Olivia");
      
      pqString.remove("Matthew");
		pqString.remove("Mr. Cadle");
		
      //Alex Hemanth Jing Maya Nick
      for(int i=0; i<5; i++)
      {
      System.out.print(pqString.remove() + " ");
      }
      
    
      
     
         
      
      
   }
}