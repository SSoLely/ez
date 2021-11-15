package d211001;
public class N14_LogicalOperatorExample
{
	public static void main(String[] args)
	{
		int charCode = '5';
		
		if( (charCode>=65) & (charCode<=90) )	//if(조건)의 결과는 무조건 true 아니면 false
		{
			System.out.println("대문자이군요.");	//[true&true]면 "대문자이군요."가 출력이 될 것이다.
		}
		
		if( (charCode>=97) && (charCode<=122) )	//charCode가 97보다 크거나 같고, 122보다 작거나 같으면
		{
			System.out.println("소문자이군요.");
		}
		
		if( !(charCode<48) && !(charCode>57) )	//charCode가 48보다 크거나 같고, 57보다 작거나 같으면
		{
			System.out.println("0~9 숫자이군요.");
		}
		int value = 6;
		
		if( (value%2==0) | (value%3==0) )				//(value를 2로 나눈 나머지는 0이어서 true) 또는 (3으로 나눈 나머지가 0이어서 true)
		{
			System.out.println("2 또는 3의 배수이군요.");	//둘 중에 하나로라도 나눠지면 "2 또는 3의 배수이군요."를 출력 //or 연산은 둘 중에 하나가 true면 동작이 된다.
		}
		if( (value%2==0) || (value%3==0) )
		{
			System.out.println("2 또는 3의 배수이군요.");
		}
	}
}