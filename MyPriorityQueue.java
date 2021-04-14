public class MyPriorityQueue{
   private MinHeap m;
   public MyPriorityQueue(){
      m = new MinHeap();
   }
   
   public boolean add(Comparable c){
      m.add(c);
      return true;
   }
   
   public Comparable remove(){
      return m.remove();
      
   }
   
   public boolean isEmpty(){
      return m.isEmpty();
   }
   
   public boolean remove(Comparable c){
      return m.remove(c);
   }
   
   public String toString(){
      return m.toString();
   }
   
   
}