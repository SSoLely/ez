package d211001;
public class N05_AccuracyExample1
{
	public static void main(String[] args)
	{
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;	//1-7*0.1=0.3
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
	}
}