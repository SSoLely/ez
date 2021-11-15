package d211001;
public class N08_InputDataCheckNaNExample1
{
	public static void main(String[] args)
	{
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		System.out.println(val);
		double currentBalance = 10000.0;
		
		currentBalance += val;	//10000.0에 "NaN"을 double 형으로 바꾼 값을 더해라.
		System.out.println(currentBalance);
	}
}