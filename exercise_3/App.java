// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack cellphonebrand_stack = new Stack(5);
  
      // Insert new elements into the stack
      cellphonebrand_stack.push("Oppo");
      cellphonebrand_stack.push("Xiaomi Redmi");
      cellphonebrand_stack.push("Apple");
      cellphonebrand_stack.push("SamSung");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + cellphonebrand_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + cellphonebrand_stack.peek());
  
      // Remove top element in the stack
      cellphonebrand_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      cellphonebrand_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + cellphonebrand_stack.peek());
    }
  }
