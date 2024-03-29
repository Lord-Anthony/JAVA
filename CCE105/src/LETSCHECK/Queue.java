package LETSCHECK;


class Queue { 

    private static int front, rear, capacity; 

    private static int queue[]; 

   

    Queue(int size) { 

        front = rear = 0; 

        capacity = size; 

        queue = new int[capacity]; 

    } 

   

    static void queueEnqueue(int item) {      // insert an element into the queue

                   if (capacity == rear) {                       // check if the queue is full

            System.out.printf("\nQueue is full\n"); 

            return; 

        } 



        else {           // insert element at the rear 

            queue[rear] = item; 

            rear++; 

        } 

        return; 

    } 

   

    static void queueDequeue() {     //remove an element from the queue

          if (front == rear) {         // check if queue is empty 

                    System.out.printf("\nQueue is empty\n"); 

            return; 

        } 

   

 

        // shift elements to the right by one place uptil rear 

        else { 

            for (int i = 0; i < rear - 1; i++) { 

                queue[i] = queue[i + 1]; 

            } 

         

          if (rear < capacity)             // set queue[rear] to 0

                  queue[rear] = 0; 

                         rear--;    // decrement rear 

          } 

        return; 

    } 

   

       static void queueDisplay()   {     // print queue elements 

        int i; 

        if (front == rear) { 

            System.out.printf("Queue is Empty\n"); 

            return; 

        } 

   

        for (i = front; i < rear; i++) {           // traverse front to rear and print elements 

                  System.out.printf(" %d = ", queue[i]); 

        } 

        return; 

    } 

   

 static void queueFront()    {     // print front of queue 

           if (front == rear) { 

            System.out.printf("Queue is Empty\n"); 

            return; 

        } 

        System.out.printf("\nFront Element of the queue: %d", queue[front]); 

        return; 

    } 



 



    public static void main(String[] args) { 

                Queue q = new Queue(4);   // Create a queue of capacity 4 

   

        System.out.println("Initial Queue:");

               q.queueDisplay();    // print Queue elements 

   

        // inserting elements in the queue 

        q.queueEnqueue(10); 

        q.queueEnqueue(30); 

        q.queueEnqueue(50); 

        q.queueEnqueue(70); 

   

       System.out.println("Queue after Enqueue Operation:");   // print Queue elements 

        q.queueDisplay(); 

   

       q.queueFront();                                                                      // print front of the queue 

        q.queueEnqueue(90);                                                            // insert element in the queue 

q.queueDisplay();                                                                   // print Queue elements 

         q.queueDequeue(); 

        q.queueDequeue(); 



        System.out.printf("\nQueue after two dequeue operations:"); 

        q.queueDisplay();                                                                  // print Queue elements 

         q.queueFront();                                                                    // print front of the queue 

   

    } 

}

