package d211001;
public class N03_OverflowExample
{
	public static void main(String[] args)
	{
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;	//1000000*1000000 //int 타입에 수용할 수 있는 숫자는 21억까지다.
		System.out.println(z);
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}