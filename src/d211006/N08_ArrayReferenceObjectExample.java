package d211006;
public class N08_ArrayReferenceObjectExample
{
	public static void main(String[] args)
	{		
		String[] strArray = new String[3];						//String 타입의 배열을 생성. 3개를 저장할 수 있다.
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println( strArray[0] == strArray[1]);		//비교 연산자로 비교. //strArray 안에 들어가는 것은 값이 아닌, 메모리 주소가 들어간다. //주소가 같기 때문에 true.
		System.out.println( strArray[0] == strArray[2] );		//주소값이 다르니까 false.
		System.out.println( strArray[0].equals(strArray[2]) );
	} 
}