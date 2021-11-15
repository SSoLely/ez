package d211008.N04_overloading;
public class CalculatorExample
{
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();			//객체를 생성.
		
		double result1 = myCalcu.areaRectangle(10);		//가로 세로가 10인 정사각형의 넓이를 구할 수 있다.

		double result2 = myCalcu.areaRectangle(10, 20);	//가로의 길이와 높이를 받아서 넓이를 구할 수 있다.
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
}