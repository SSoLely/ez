package d211005;
public class N33_Exercise04
{
	public static void main(String[] args)
	{
		while(true)
		{
			int num1 = (int)(Math.random()*6) + 1;				//1~6이 랜덤하게 나온다.
			int num2 = (int)(Math.random()*6) + 1;				//1~6이 랜덤하게 나온다.
			System.out.println("(" + num1 + ", " + num2 + ")");	//나온 걸 화면에 출력.
			if( (num1+num2) == 5)								//조건: num1과 num2를 더했을 때, 5가 나오면,
			{
				break;											//빠져 나간다.
			}
		}
	}
}