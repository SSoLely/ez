package d211008.N01_method_declaration;
public class Computer
{
	int sum1(int[] values)					//int 타입의 배열으르 재료로 받는다.
	{
		int sum = 0;						//int 타입의 변수를 선언.
		for(int i=0; i<values.length; i++)	//i는 0부터, 받아오는 배열의 크기만큼 반복.
		{
			sum += values[i];				//sum 변수에 배열의 값을 더한다.
		}
		return sum;
	}
	
	int sum2(int ... values)	//...의 의미: sum2는 매개 변수를 하나도 안 받아도 되고, 개수의 제한 없이 받아도 된다. ...을 이용해서 개수 제한을 없애는 것.
	{							//()(int v, int v2,, int v3...) 제한이 없는 것. 매개 변수 없는 것까지 포함된다.
		int sum = 0;
		for(int i=0; i<values.length; i++)
		{
			sum += values[i];
		}
		return sum;
	}
}