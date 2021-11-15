package d211028.Test12;
public class Pay
{
	public static void main(String [] args)
	{
		Taxi t = new Taxi("서울택시");
		t.setFare(true);
		t.speedUp();
		t.speedUp(); 
		t.accounts();
		t.display();
	}
}