package d211008.N01_method_declaration;
public class Calculator			//계산기
{
	void powerOn()
	{
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y)		//덧셈
	{
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y)	//나눗셈
	{
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff()
	{
		System.out.println("전원을 끕니다");
	}
}