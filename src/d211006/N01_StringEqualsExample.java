package d211006;
public class N01_StringEqualsExample
{
	public static void main(String[] args)
	{	
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2)		//strVar1과 strVar2의 메모리 주소가 같은지 비교.
		{
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2))	//strVar1과 strVar2가 가지고 있는 값을 비교할 때는 equals를 쓰면 된다.
		{
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4)		//strVar3과 strVar4 메모리 주소를 비교하니까, 다르다.
		{
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4))	//값이 같으니까 같다.
		{
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	} 
}