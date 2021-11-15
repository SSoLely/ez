package d211001;
public class N16_BitShiftExample
{
	public static void main(String[] args)
	{
		System.out.println("1 << 3 = " + (1<<3));		//정수 1을 왼쪽으로 3만큼 이동	
		System.out.println("-8 >> 3 = " + (-8>>3));		//-8을 오른쪽으로 3만큼 이동
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		
		System.out.println(toBinaryString(1));
		System.out.println("<< 3");
		System.out.println(toBinaryString(1<<3));
	}
	
	public static String toBinaryString(int value)
	{
		String str = Integer.toBinaryString(value);
		while(str.length() < 32)
		{
			str = "0" + str;
		}
		return str;
	}
}