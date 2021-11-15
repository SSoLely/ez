package d211008.N01_method_declaration;
public class ComputerExample
{
	public static void main(String[] args)
	{
		Computer myCom = new Computer();	//Computer 클래스의 객체를 생성.
		
		int[] values1 = {1, 2, 3};			//배열을 만들어 준 다음에,
		int result1 = myCom.sum1(values1);	//이 배열을 sum1이라는 메소드에 넣어준다.
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});	//5개짜리 배열을 집어 넣어서,
		System.out.println("result2: " + result2);				//합계 구해서 출력.
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);	//sum2는 배열을 넣는 게 아니라, 값 3개, 5개를 넣어도 된다. 매개 변수 개수 제한 없이 넣어서 작업.
	}
}