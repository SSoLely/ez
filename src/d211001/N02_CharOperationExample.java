package d211001;
public class N02_CharOperationExample
{
	public static void main(String[] args)
	{
		char c1 = 'A' + 1;					//A는 65라는 정수값으로 대신할 수 있다. //65+1=66 //66은 char 타입으로 B가 된다.
		char c2 = 'A';
		char c3 = (char)(c2 + 1);			//char 타입으로 변환을 시켜주면 오류는 사라진다. //A+1=B

		System.out.println("c1: " + c1);	//c1=B
		System.out.println("c2: " + c2);	//c2=A
		System.out.println("c3: " + c3);
	}
}