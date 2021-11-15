package d211001;
public class N13_StringEqualsExample
{
	public static void main(String[] args)
	{
		String strVar1 = "이솔";
		String strVar2 = "이솔";
		String strVar3 = new String("이솔");

		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));	
	}
}