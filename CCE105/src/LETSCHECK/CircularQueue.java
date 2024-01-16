package LETSCHECK;

//Java program for insertion and deletion in Circular Queue

import java.util.ArrayList;

class CircularQueue{



private int size, front, rear;                                                                 // Declaring the class variables.

private ArrayList<Integer> queue = new ArrayList<Integer>();    // Declaring array list of integer type.

CircularQueue(int size) {                                                                      // Constructor

 this.size = size;

 this.front = this.rear = -1;

}



public void enQueue(int data) {       // Method to insert a new element in the queue.

 // Condition if queue is full.

 if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1)))  {

     System.out.print("Queue is Full");

 }

  else if(front == -1)   {     // condition for empty queue.

      front = 0;

     rear = 0;

     queue.add(rear, data);

 }



 else if(rear == size - 1 && front != 0) {

     rear = 0;

     queue.set(rear, data);

 }

  else {

     rear = (rear + 1);

    if(front <= rear)   { 

                 queue.add(rear, data);       // Adding a new element if

     }

              else    {

         queue.set(rear, data);   // else updating old value



     }

 }

}



public int deQueue() {     // Function to dequeue an element form the queue.

 int temp;



    if(front == -1) {        // Condition for empty queue.

     System.out.print("Queue is Empty");

     return -1;            // Return -1 in case of empty queue

 }

  temp = queue.get(front);



 if(front == rear) {        // Condition for only one element

     front = -1;

     rear = -1;

 }

  else if(front == size - 1) {

     front = 0;

 }

 else { 

     front = front + 1;

 }

     return temp;                          // Returns the dequeued element

}



public void displayQueue() {      // Method to display the elements of queue

 if(front == -1) {                           // Condition for empty queue.

     System.out.print("Queue is Empty");

     return;

 }



 // If rear has not crossed the max size or queue rear is still greater then front.

 System.out.print("Elements in the " +  "circular queue are: ");



 if(rear >= front) {

       for(int i = front; i <= rear; i++) {         // Loop to print elements from front to rear.

         System.out.print(queue.get(i));

         System.out.print(" ");

     }

     System.out.println();

 }



  else {                                                      // If rear crossed the max index and indexing has started in loop

      for(int i = front; i < size; i++) {      // Loop for printing elements from front to max size or last index

         System.out.print(queue.get(i));

         System.out.print(" ");

     }



     for(int i = 0; i <= rear; i++) {         // Loop for printing elements from 0th index till rear position

        System.out.print(queue.get(i));

         System.out.print(" ");

     }

     System.out.println();

 }

}



public static void main(String[] args) {                                     // Driver code

 CircularQueue q = new CircularQueue(5);                          // Initialising new object of CircularQueue class.

 

 q.enQueue(14);   q.enQueue(22);      q.enQueue(13);       q.enQueue(-6);

  q.displayQueue();



 int x = q.deQueue();



    if(x != -1) {        // Checking for empty queue.

     System.out.print("Deleted value = ");

     System.out.println(x);

 }

  x = q.deQueue();



    if(x != -1) {                                          // Checking for empty queue.

     System.out.print("Deleted value = ");

     System.out.println(x);

 }



  q.displayQueue();

q.enQueue(9);

  q.enQueue(20);

  q.enQueue(5);

  q.displayQueue();

  q.enQueue(20);

}

}
