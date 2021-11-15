package d211001;
public class N11_CompareOperatorExample1
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);	//num1과 num2가 같다.			//true
		boolean result2 = (num1 != num2); 	//num1과 num2가 같지 않다.		//false
		boolean result3 = (num1 <= num2);	//num1과 num2가 작거나 같다.	//true
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';					//65
		char char2 = 'B';					//66
		boolean result4 = (char1 < char2);	//char1이 char2보다 작다.		//true
		System.out.println("result4=" + result4);	
	}
}