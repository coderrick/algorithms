/* Finish this Class, its not a functioning Queue yet! Remember to add logic yeah*/
//TODO
public class SimpleQueue {
   private int maxSize;
   private long[] queueArray;
   private int front;
   private int back;
   public SimpleQueue(int s) {
      maxSize = s;
      queueArray = new long[maxSize];
      top = -1;
   }
   public void enQueue(long j) {
      queueArray[++top] = j;
   }
   
   public long deQueue() {
      return queueArray[top--];
   }
   public long peek() {
      return queueArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      SimpleQueue queue = new SimpleQueue(10); 
      queue.push(10);
      queue.push(20);
      queue.push(30);
      queue.push(40);
      queue.push(50);

      while (!queue.isEmpty()) {
         long value = queue.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}