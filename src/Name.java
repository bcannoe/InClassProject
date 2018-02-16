
import javax.swing.JOptionPane;

public class Name 
{
	String first;
	char initial;
	String last;
	
	public Name(String fir, char init, String las)
	{
		this.first = fir;
		this.initial = init;
		this.last = las;
	}
	public void setFirst(String fir)
	{
		fir = JOptionPane.showInputDialog("Enter your name");
		first = fir;
	}
	public String getFirst()	// changed to static to make it work
	{
		return first;
	}
	public void setInitial(char init)
	{
		initial = init;
	}
	public char getInitial()
	{
		return initial;
	}
	public void setLast(String las)
	{
		last = las;
	}
	public String getlast()
	{
		return last;
	}
	public String toString()
	{
		String result;
		result = first + "" + initial + ". " + last;
		return result;
	}
}
