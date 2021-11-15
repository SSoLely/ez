package d211005;
public class  N29_BreakExample
{
	public static void main(String[] args) throws Exception
	{
		while(true)
		{
			int num = (int)(Math.random()*6) + 1;	//1부터 6까지 사이의 임의의 정수가 num 변수로 출력될 것.
			System.out.println(num);
			if(num == 6)							//조건: 랜덤하게 뽑은 num 변수의 값이 6이면,
			{
				break;								//반복 그만.
			}
		}
		System.out.println("프로그램 종료");
	}
}