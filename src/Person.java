import java.util.ArrayList;



public class Person 
{
	private Name name;
	private Address address;
	private char gender;
	private double income;
	
	Person() {
		
	}
	
	public Person(Name nam, Address addr, char gen, double inc)
	{
		this.name = nam;
		this.address = addr;
		this.gender = gen;
		this.income = inc;
		ArrayList<String> studentArray = new ArrayList<String>();
		ArrayList<String> presidentArray = new ArrayList<String>();
	}
	public void setName(Name nam)	// mutator -- values are validated in this method
	{
		// call Name Class to transfer values from there to here?
		name = nam;
	}
	public Name getName()	// accessor -- method used to display outputs
	{
		return name;
	}
	public void setAddress(Address addr)
	{
		// call Address Class to transfer values from there to here?
		address = addr;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setGender(char gen)
	{
		// user's input will be stored in gen
		gender = gen;
	}
	public char getGender()
	{
		return gender;	
	}
	public void setIncome(double inc)
	{
		income = inc;
	}
	public double getIncome()
	{
		return income;
	}
	public String toString()
	{
		String result = null;
		result = name + "\t" + address + "\t" + gender + "\t" + income;
		return result;
	}
}
