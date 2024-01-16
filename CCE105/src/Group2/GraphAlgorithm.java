package Group2;



import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;



import javax.swing.JOptionPane;



public class GraphAlgorithm extends JFrame {


static JButton[][] cellbuttons;

private int rows;

private int columns;



JButton executeBTn, removeBTn, exitBTn, addBTn;




public GraphAlgorithm(int rows, int columns) {

this.rows = rows;

this.columns = columns;


cellbuttons = new JButton[rows][columns];



initializeUI();

}



private void initializeUI() {


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setTitle("Graph Algorithm");

setLayout(new BorderLayout());



JPanel buttonPanel = new JPanel();

buttonPanel.setLayout(new GridLayout(rows, columns));



for (int i = 0; i < rows; i++) {

for (int j = 0; j < columns; j++) {

JButton button = new JButton("<html><center>X</center></html>");

button.setBackground(new Color(0x28145c));

button.setForeground(new Color(0xFA05EC));


button.addActionListener(new ButtonClickListener(i, j));

button.setFont(new Font("Arial", Font.BOLD, 30));

cellbuttons[i][j] = button;

button.setFocusable(false);

buttonPanel.add(button);

}

}



JPanel optionsPanel = new JPanel(); //panel para sa options buttons

optionsPanel.setLayout(new GridLayout(4, 1));



executeBTn = new JButton("EXECUTE");

addBTn = new JButton("ADD");

removeBTn = new JButton("REMOVE");

exitBTn = new JButton("EXIT");


executeBTn.setFont(new Font("Arial", Font.BOLD,20));

addBTn.setFont(new Font("Arial", Font.BOLD,20));

removeBTn .setFont(new Font("Arial", Font.BOLD,20));

exitBTn.setFont(new Font("Arial", Font.BOLD,20));


executeBTn.addActionListener(e -> {

executeFunction();

});


addBTn.addActionListener(e -> {

addFunction();

});


removeBTn.addActionListener(e -> {

removeFunction();

});


exitBTn.addActionListener(e -> {

exitFunction();

});


executeBTn.setBackground(new Color(0x28145c));

executeBTn.setForeground(new Color(0xB0FA05));

addBTn.setBackground(new Color(0x28145c));

addBTn.setForeground(new Color(0xB0FA05));

removeBTn.setBackground(new Color(0x28145c));

removeBTn.setForeground(new Color(0xB0FA05));

exitBTn.setBackground(new Color(0x28145c));

exitBTn.setForeground(new Color(0xB0FA05));


MouseListener menuButtonListener = new MouseAdapter() {


public void mouseEntered(MouseEvent e) {


JButton button = (JButton) e.getSource();

button.setBackground(new Color(0xB0FA05));

button.setForeground(new Color(0xFA05EC));

}




public void mouseExited(MouseEvent e) {

JButton button = (JButton) e.getSource();

button.setBackground(new Color(0x28145c));

button.setForeground(new Color(0xB0FA05));

}

};



JButton[] menuButtons = {executeBTn, addBTn, removeBTn, exitBTn};



for (JButton button : menuButtons) {

button.addMouseListener(menuButtonListener);

}





executeBTn.setFocusable(false);

exitBTn.setFocusable(false);

addBTn.setFocusable(false);

removeBTn.setFocusable(false);


optionsPanel.add(executeBTn);

optionsPanel.add(addBTn);

optionsPanel.add(removeBTn);

optionsPanel.add(exitBTn);




add(buttonPanel, BorderLayout.CENTER);

add(optionsPanel, BorderLayout.WEST);


pack();

setLocationRelativeTo(null);

setVisible(true);

}




private class ButtonClickListener implements ActionListener {

private int row;

private int column;



public ButtonClickListener(int row, int column) {

this.row = row;

this.column = column;

}



@Override

public void actionPerformed(ActionEvent e) {


JButton button = (JButton) e.getSource();

String buttonText = button.getText();


if (buttonText.equals("<html><center>X</center></html>")) {


button.setText("<html><center>O</center></html>");

button.setBackground(new Color(0xB0FA05));

button.setForeground(new Color(0xFA1F05));





} else if (buttonText.equals("<html><center>O</center></html>")) {


button.setText("<html><center>X</center></html>");

button.setBackground(new Color(0x28145c));

button.setForeground(new Color(0xFA05EC));

}



//System.out.println("Button clicked at row " + row + ", column " + column);


}



}

private void executeFunction() {


char[][] board = new char[rows][columns];


for (int i = 0; i < rows; i++) {

for (int j = 0; j < columns; j++) {


JButton button = cellbuttons[i][j];

String buttonText = button.getText();


if (buttonText.equals("<html><center>X</center></html>")) {

board[i][j] = 'X';


} else if (buttonText.equals("<html><center>O</center></html>")) {

board[i][j] = 'O';

}

}

}



solve(board);



// Update the button texts based on the modified board

for (int i = 0; i < rows; i++) {


for (int j = 0; j < columns; j++) {

JButton button = cellbuttons[i][j];

char cellValue = board[i][j];

if (cellValue == 'X') {


button.setText("<html><center>X</center></html>");

button.setBackground(new Color(0x28145c));

button.setForeground(new Color(0xFA05EC));


} else if (cellValue == 'O') {

button.setText("<html><center>O</center></html>");

button.setBackground(new Color(0xB0FA05));

button.setForeground(new Color(0xFA1F05));



}

}

}

}


private void addFunction() {


++rows;

++columns;


SwingUtilities.invokeLater(() -> new GraphAlgorithm(rows, columns));

dispose();


}



private void removeFunction() {


--rows;

--columns;


SwingUtilities.invokeLater(() -> new GraphAlgorithm(rows, columns));

dispose();


if (rows<3 && columns<3) {


JOptionPane.showMessageDialog(null, "You have reached the limit for the function to work", "Limit Reached", JOptionPane.WARNING_MESSAGE);


rows = 3;

columns = 3;

SwingUtilities.invokeLater(() -> new GraphAlgorithm(rows, columns));


}


}


private void exitFunction() {

System.exit(0);;

}


private void solve(char[][] board) {


if (board == null || board.length == 0) {

return;

}



int rows = board.length;

int cols = board[0].length;



// Traverse the first and last columns

for (int i = 0; i < rows; i++) {


if (board[i][0] == 'O') {

dfs(board, i, 0);

}



if (board[i][cols - 1] == 'O') {

dfs(board, i, cols - 1);

}

}



// Traverse the first and last rows

for (int j = 0; j < cols; j++) {


if (board[0][j] == 'O') {

dfs(board, 0, j);

}



if (board[rows - 1][j] == 'O') {

dfs(board, rows - 1, j);

}

}



// Flip the remaining 'O' cells to 'X'

for (int i = 0; i < rows; i++) {

for (int j = 0; j < cols; j++) {


if (board[i][j] == 'O') {

board[i][j] = 'X';

} else if (board[i][j] == '#') {

board[i][j] = 'O';

}

}

}

}


private void dfs(char[][] board, int i, int j) {

if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {

return;

}



board[i][j] = '#'; // Mark 'O' as visited



// Explore the neighboring cells

dfs(board, i - 1, j); // Up

dfs(board, i + 1, j); // Down

dfs(board, i, j - 1); // Left

dfs(board, i, j + 1); // Right

}



public static void main(String[] args) {

SwingUtilities.invokeLater(() -> new GraphAlgorithm(6, 6));

}

}