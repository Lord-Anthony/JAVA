package JCOMBOBOX;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main extends JFrame implements ActionListener{
			// JComboBox = combines a button or editable field and a drop down list
	
	JComboBox box;
	
	Main (){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//---------------------------------------------------------------------------------
		
		// Integer[]
		// Double[]
		String [] pet = {"dog","cat","bird"};		// string inside the combobox
		
		
		box = new JComboBox(pet);
		box.addActionListener(this);
		
		box.setEditable(true);     // input type
		System.out.println(box.getItemCount());
		box.addItem("Lion");  // add a selection
		box.insertItemAt("Shark",0);    // item, index
		box.setSelectedIndex(0); // asa mag sugod
		box.removeItem("cat");  // remove the name
		box.removeItemAt(0);  // remove ang naa sa index na gipili
		box.removeAll();  // wala na
		
		
		
		
		
		//---------------------------------------------------------------------------------
		this.add(box);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == box) {
//			System.out.println(box.getSelectedItem());
			System.out.println(box.getSelectedIndex());
		}
		
	}

}
