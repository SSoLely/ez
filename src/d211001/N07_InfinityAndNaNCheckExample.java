package d211001;
public class N07_InfinityAndNaNCheckExample
{
	public static void main(String[] args)
	{
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		
		System.out.println(z);
		System.out.println(Double.isInfinite(z));	//isInfinite()는 ()가 Infinity인지 아닌지 알려준다.
		System.out.println(Double.isNaN(z));		//isNaN()은 ()가 NaN인지 아닌지 알려준다.
		
		System.out.println(z + 2);
		
		if(Double.isInfinite(z) || Double.isNaN(z))
		{
			System.out.println("값 산출 불가");
		}											//NaN이나 Infinity면 "값 산출 불가"가 나와야 되고,
		else
		{
			System.out.println(z + 2);
		}											//아니면 연산이 돼라.
	}
}