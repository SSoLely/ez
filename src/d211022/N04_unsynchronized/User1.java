package d211022.N04_unsynchronized;
public class User1 extends Thread
{	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator)
	{
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run()
	{
		calculator.setMemory(100);
	}
}