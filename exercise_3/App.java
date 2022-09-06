// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Mask_stack = new Stack(5);
  
      // Insert new elements into the stack
      Mask_stack.push("Blue Mask");
      Mask_stack.push("Green Mask");
      Mask_stack.push("Yellow Mask");
      Mask_stack.push("Black Mask");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Mask_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Mask_stack.peek());
  
      // Remove top element in the stack
      Mask_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Mask_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Mask_stack.peek());
    }
  }
