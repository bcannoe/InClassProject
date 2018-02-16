//Blake Cannoe
//Ester Aguilera
import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class MainClass 
{
		public static void main(String[] args) 
		{

			//Person student = new Person(new Name("best"), "coral", 'F', 2);	// calling constructor method -- hard coding values
			//Person president = new Person("Honest Abe", "No clue", 'M', 1000);
			Person person = new Person();
			Person student = new Person();
			//System.out.println(president);
			//System.out.println(student);
		
			
			System.out.println(person.getName().getFirst());
			
			String message = null;
			String input;
			char choice = 0;
			do {
				
				choice = selection(message, choice);
				switch(choice) {
				case 'A':
					
					break;
					
				case 'B':
					
					break;
					
				
				case 'C':
					
					break;
				
				case 'D':
		
					break;
				
				case 'F':
		
					break;
				
				case 'G':
		
					break;
				
				case 'Q':
		
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"invalid");
					break;
				
				}
				
				
				
			}while(choice != 'Q');

		}

		public static char selection(String message, char choice) {
			String input;
			message = "A. add president. \n";
			message += "B. Add a student\n";
			message += "C. Display all presidents\n";
			message += "D. Display all students\n";
			message += "F. Display all student gender\n";
			message += "B. Display all president from a state\n";
			message += "Q. Quit Program\n";
			input = JOptionPane.showInputDialog(message, "selection");
			choice = input.toUpperCase().charAt(0);
			
			
			System.out.println(choice);
			
			return choice;
			
			
		}

	}


