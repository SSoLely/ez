package d211001;
public class N25_Exercise08
{
	public static void main(String[] args)
	{
	  double x = 5.0;
		double y = 1.0;
		
		double z = 5 % y;
		
		if( Double.isNaN(z) )
		{
			System.out.println("0.0으로 나눌 수 없습니다.");	//NaN이 맞으면, "0.0으로 나눌 수 없습니다."
		}
		else
		{
			double result = z + 10;
			System.out.println("결과: " + result);		//NaN이 아니면, 연산 결과를 출력.
		}
	}
}