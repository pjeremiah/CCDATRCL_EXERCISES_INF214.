import java.util.LinkedList;
import java.util.Queue;

public class App {

public static void main(String[] args) {
Queue<String> StudentName = new LinkedList<>();

// Adds elements to the queue
 StudentName.add("Ma. Teresa Jesmari Erl Labon");
 StudentName.add("Winna Jane Bablis");
 StudentName.add("Jamil Valencia");
 StudentName.add("James Francis Jalalon");
 StudentName.add(" Idel Lawrence Aranilla");

// Display all elements of the queue.
System.out.println("Students Name: " + StudentName);

// Get the size of the queue
System.out.println("Size of the Queue is: " + StudentName.size());

 // Get the front of the queue
System.out.println("Front of the Queue is: " + StudentName.peek());

 // Dequeue 5 of your classmates
 System.out.println("Removing all Students: " + StudentName);
 StudentName.remove();
 StudentName.remove();
 StudentName.remove();
 StudentName.remove();
 StudentName.remove();

// Display all elements of the queue.
System.out.println(StudentName);

//Enqueue another 5 of you classmates
 StudentName.add("Neil Rifarial");
 StudentName.add("Alliyah Almocera");
 StudentName.add("Marvin John Gonzales");
 StudentName.add("Jethro Ruiz D. Vargas");
 StudentName.add("Hani Hafiz Elhag,");

 // Display all elements of the queue.
System.out.println("Students Name: " + StudentName);

 // Get the size of the queue
 System.out.println("Size of the Queue is: " + StudentName.size());

 // Get the front of the queue
 System.out.println("Front of the Queue is: " + StudentName.peek());

 }
}
