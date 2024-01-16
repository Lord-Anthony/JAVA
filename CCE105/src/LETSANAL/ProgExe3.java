package LETSANAL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ProgExe3 extends JFrame {

    private JTextArea outputTextArea;
    private JTextField inputTextField;
    private JButton enqueueButton;
    private JButton dequeueButton;
    private JButton displayButton;
    private JButton frontButton;
    private Queue queue;

    ProgExe3(int size) {
        super("Queue GUI");
        queue = new Queue(size);

        // Create GUI components
        outputTextArea = new JTextArea(10, 20);
        outputTextArea.setEditable(false);
        inputTextField = new JTextField(10);
        enqueueButton = new JButton("Enqueue");
        dequeueButton = new JButton("Dequeue");
        displayButton = new JButton("Display");
        frontButton = new JButton("Front");

        // Set layout
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter value: "));
        inputPanel.add(inputTextField);
        inputPanel.add(enqueueButton);
        inputPanel.add(dequeueButton);
        inputPanel.add(displayButton);
        inputPanel.add(frontButton);

        // Add components to the frame
        add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        // Add event listeners
        enqueueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputTextField.getText());
                    queue.queueEnqueue(value);
                    inputTextField.setText("");
                    outputTextArea.append("Enqueued: " + value + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ProgExe3.this, "Invalid input!");
                }
            }
        });

        dequeueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                queue.queueDequeue();
                outputTextArea.append("Dequeued\n");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputTextArea.append("Queue: ");
                queue.queueDisplay(outputTextArea);
                outputTextArea.append("\n");
            }
        });

        frontButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                queue.queueFront(outputTextArea);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProgExe3(4);
            }
        });
    }
}

class Queue {

    private int front, rear, capacity;
    private int queue[];

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    void queueEnqueue(int item) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    void queueDequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
    }

    void queueDisplay(JTextArea outputTextArea) {
        if (front == rear) {
            outputTextArea.append("Queue is Empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            outputTextArea.append(queue[i] + " ");
        }
    }

    void queueFront(JTextArea outputTextArea) {
        if (front == rear) {
            outputTextArea.append("Queue is Empty");
            return;
        }
        outputTextArea.append("Front Element of the queue: " + queue[front]);
    }
}