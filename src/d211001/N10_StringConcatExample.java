package d211001;
public class N10_StringConcatExample
{
	public static void main(String[] args)
	{
		String str1 = "JDK" + 6.0;		//JDK6.0
		String str2 = str1 + " 특징";		//JDK6. 특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	//JDK33.0	//앞에 문자열이 있으면 다 문자열로 연산된다.
		String str4 = 3 + 3.0 + "JDK";	//6.0JDK	//앞에 숫자가 먼저 나오니까 연산된 후 문자열을 붙여준다.
		System.out.println(str3);
		System.out.println(str4);		
	}
}