/* I have commented out the state String variable, its inclusion in the constructor method, its setter & getter
 * and its existence in the toString until we decide whether or not we need it in here.
 */
public class Address 
{
	String street;
	String city;
	String state;
	int postalCode;
	
	public Address(String stre, String cit, String sta, int postCo) 
	{
		street = stre;
		city = cit;
		state = sta;
		postalCode = postCo;
	}
	public void setStreet(String stre)
	{
		street = stre;
	}
	public String getStreet()
	{
		return street;
	}
	public void setCity(String cit)
	{
		city = cit;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String sta)
	{
		state = sta;
	}
	public String getState()
	{
		return state;
	}
	public void setPostalCode(int postCo)
	{
		postalCode = postCo;
	}
	public int getPostalCode()
	{
		return postalCode;
	}
	public String toString()
	{
		String result;
		result = street + "\n" + city + "" + state + ""  + postalCode;
		return result;
	}
	
}
