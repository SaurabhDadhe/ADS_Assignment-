import java.util.LinkedList;
import java.util.Queue;
public class QueueStack<T> {
 private Queue<T> queue1;
 private Queue<T> queue2;

 public QueueStack() {
 queue1 = new LinkedList<>();
 queue2 = new LinkedList<>();
 }

 public void push(T item) {

 queue2.add(item);
 while (!queue1.isEmpty()) {
 queue2.add(queue1.remove());
 }

 Queue<T> temp = queue1;
 queue1 = queue2;
 queue2 = temp;
 System.out.println("Pushed element: " + item);
 }

 public T pop() {
 if (isEmpty()) {
 System.out.println("Stack Underflow: Unable to pop element.Stack is empty.");
 return null;
 }
 System.out.println("Popped element: " + queue1.peek());
 return queue1.remove();
 }

 public boolean isEmpty() {
 return queue1.isEmpty();
 }
 public static void main(String[] args) {
 QueueStack<Integer> stack = new QueueStack<>();
 stack.push(10);
 stack.push(20);
 stack.push(30);
 stack.pop();
 stack.pop();
 stack.pop();
 stack.pop();
 }
}