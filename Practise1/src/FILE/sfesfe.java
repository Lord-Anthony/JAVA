package FILE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sfesfe {

	public static void main(String[] args) throws IOException {
		
		int size = 0; // get count of rows that will serve as size of array
		Scanner reader = new Scanner(new FileReader("src/input.txt"));
		while(reader.hasNext()) // loop to count number of rows
		{
			size++; // pag naay mabasa na value mag increment ug 1
			reader.nextLine(); // read the entire line
			
		}
		
		String[] firstname = new String[size];
		String[] lastname = new String[size];
		Double[] firstg = new Double[size];
		Double[] secondg = new Double[size];
		Double[] thirdg = new Double[size];

		reader = new Scanner(new FileReader("src/input.txt")); //Reset reader
		
		for (int i = 0; i < size; i++) {
			
			firstname[i] = reader.next();
			lastname[i] = reader.next();
			firstg[i] = reader.nextDouble();
			secondg[i] = reader.nextDouble();
			thirdg[i] = reader.nextDouble();
			
			System.out.println("Cycle #" + i + ": ");
			System.out.println("First Name: " + firstname[i]);
			System.out.println("Last Name: " + lastname[i]);
			System.out.println("Prelim: " + firstg[i]);
			System.out.println("Midterm: " + secondg[i]);
			System.out.println("Finals: " + thirdg[i]);
			System.out.println();

		}
		
		FileWriter writer = new FileWriter("src/output.txt");
		
		double average;
		writer.write("List of Students:\n");
		for (int i = 0; i < size; i++) 
		{
			
			average = (firstg[i] + secondg[i] + thirdg[i]) / 3;
			writer.write(firstname[i] + " " + lastname[i] + ": " + average + "\n");
			
		}
		
		writer.write("\nList of Passers:\n");
		for (int i = 0; i < size; i++) 
		{
			average = (firstg[i] + secondg[i] + thirdg[i]) / 3;
			if(average >= 75)
			writer.write(firstname[i] + " " + lastname[i] + ": " + average + "\n");
		}
		
		writer.write("\nList of Failed:\n");
		for (int i = 0; i < size; i++) 
		{
			average = (firstg[i] + secondg[i] + thirdg[i]) / 3;
			if(average <= 75)
			writer.write(firstname[i] + " " + lastname[i] + ": " + average + "\n");
		}
		writer.close();
	}

}


