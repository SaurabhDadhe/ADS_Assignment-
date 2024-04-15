import java.util.Stack;
public class TwoStack<T> {
 private Stack<T> stack1; // Stack for enqueue operation
 private Stack<T> stack2; // Stack for dequeue operation
 // Constructor to initialize the two stacks
 public TwoStack() {
 stack1 = new Stack<>();
 stack2 = new Stack<>();
 }
 // Method to enqueue an element into the queue
 public void enqueue(T item) {
 stack1.push(item); // Push the element onto stack1
 System.out.println("Enqueued element: " + item);
 }
 // Method to dequeue an element from the queue
 public T dequeue() {
 if (isEmpty()) {
 System.out.println("Queue is empty. Unable to dequeue.");
 return null;
 }
 // If stack2 is empty, transfer elements from stack1 to stack2
 if (stack2.isEmpty()) {
 while (!stack1.isEmpty()) {
 stack2.push(stack1.pop());
 }
 }
 // Pop the top element from stack2 (which is the front of the queue)
 T dequeuedItem = stack2.pop();
 System.out.println("Dequeued element: " + dequeuedItem);
 return dequeuedItem;
 }
 // Method to check if the queue is empty
 public boolean isEmpty() {
 return stack1.isEmpty() && stack2.isEmpty();
 }
 public static void main(String[] args) {
 TwoStack<Integer> queue = new TwoStack<>();
 queue.enqueue(10);
 queue.enqueue(20);
 queue.enqueue(30);
 queue.dequeue();
 queue.dequeue();
 queue.dequeue();
 queue.dequeue(); // Trying to dequeue from an empty queue
 }
}
