package d211008.N01_method_declaration;
public class CalculatorExample
{
	public static void main(String[] args)			//실행할 것이기 때문에 main 메소드가 있다.
	{
		Calculator myCalc = new Calculator();		//Calculator 클래스의 객체를 생성.
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);			//객체.plus 메소드를 갖다 씀. 5가 x에 들어가고 6이 y에 들어간다.
		System.out.println("result1: " + result1);	//11이라는 값을 result1이 받아서 화면에 출력.
		
		byte x = 10;
		byte y = 4;									//byte 타입의 변수 두 개 생성.
		double result2 = myCalc.divide(x, y);		//두 변수를 divide 메소드에 넣어준다. byte 타입의 값을 int 타입에 넣어줄 수 있다.(자동으로 형 변환)
		System.out.println("result2: " + result2);	//연산된 결과 받아서 출력.
		
		myCalc.powerOff();
	}
}