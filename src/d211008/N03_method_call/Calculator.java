package d211008.N03_method_call;
public class Calculator					//클래스 명: Calculator
{
										//필드 없음.
										//생성자 없음.
										//메소드만 4개.
	int plus(int x, int y)				//plus 메소드는 int 타입 값 2개를 받아서,
	{
		int result = x + y;
		return result;					//덧셈한 int 값 리턴.
	}
	
	double avg(int x, int y)			//avg 메소드에서,
	{
		double sum = plus(x, y);		//같은 클래스에 있는 plus 메소드를 그대로 갖다 씀. 동일 클래스에 존재하는 메소드는 별다른 선언 없이 쓸 수 있다.
		double result = sum / 2;		//2로 나눈 나머지를 저장하고,
		return result;					//double을 리턴.
	}
	
	void execute()						//execute 메소드는,
	{
		double result = avg(7, 10);		//avg 메소드를 가져다 쓴다.
		println("실행 결과: " + result);	//평균이 출력될 것.
	}									//execute 메소드는, 위에서 만든 avg도, 밑에서 만든 println도 갖다 쓴다.
	
	void println(String message)		//String 값 받아서,
	{
		System.out.println(message);	//출력.
	}	
}