package LETSANAL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class CircularQueueGUI extends JFrame {

    private JTextArea outputTextArea;
    private JTextField inputTextField;
    private JButton enqueueButton;
    private JButton dequeueButton;
    private JButton displayButton;
    private CircularQueue queue;

    CircularQueueGUI(int size) {
        super("Circular Queue GUI");
        queue = new CircularQueue(size);

        // Create GUI components
        outputTextArea = new JTextArea(10, 20);
        outputTextArea.setEditable(false);
        inputTextField = new JTextField(10);
        enqueueButton = new JButton("Enqueue");
        dequeueButton = new JButton("Dequeue");
        displayButton = new JButton("Display");

        // Set layout
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter value: "));
        inputPanel.add(inputTextField);
        inputPanel.add(enqueueButton);
        inputPanel.add(dequeueButton);
        inputPanel.add(displayButton);

        // Add components to the frame
        add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        // Add event listeners
        enqueueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputTextField.getText());
                    queue.enQueue(value);
                    inputTextField.setText("");
                    outputTextArea.append("Enqueued: " + value + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CircularQueueGUI.this, "Invalid input!");
                }
            }
        });

        dequeueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = queue.deQueue();
                if (value != -1) {
                    outputTextArea.append("Dequeued: " + value + "\n");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputTextArea.setText("");
                queue.displayQueue(outputTextArea);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CircularQueueGUI(5);
            }
        });
    }
}

class CircularQueue {

    private int size, front, rear;
    private ArrayList<Integer> queue;

    CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
        this.queue = new ArrayList<Integer>();
    }

    public void enQueue(int data) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            JOptionPane.showMessageDialog(null, "Queue is Full");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            queue.add(rear, data);
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            queue.set(rear, data);
        } else {
            rear = (rear + 1) % size;
            if (front <= rear) {
                queue.add(rear, data);
            } else {
                queue.set(rear, data);
            }
        }
    }

    public int deQueue() {
        if (front == -1) {
            JOptionPane.showMessageDialog(null, "Queue is Empty");
            return -1;
        }
        int temp = queue.get(front);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = (front + 1) % size;
        }
        return temp;
    }

    public void displayQueue(JTextArea outputTextArea) {
        if (front == -1) {
            outputTextArea.append("Queue is Empty");
            return;
        }
        outputTextArea.append("Elements in the circular queue are: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                outputTextArea.append(queue.get(i) + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                outputTextArea.append(queue.get(i) + " ");
            }
            for (int i = 0; i <= rear; i++) {
                outputTextArea.append(queue.get(i) + " ");
            }
        }
        outputTextArea.append("\n");
    }
}


