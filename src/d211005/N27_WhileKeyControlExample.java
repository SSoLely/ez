package d211005;
public class  N27_WhileKeyControlExample
{
	public static void main(String[] args) throws Exception
	{
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		while(run)							//반복문의 조건으로 true를 주면, 이 반복문은 무한대로 돈다.
		{
			if(keyCode!=13 && keyCode!=10)	//만약에 KeyCode가 13이나 10(13이나 10은 Enter 키를 뜻한다.)이 아니면,
			{
				System.out.println("---------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------------");
				System.out.print("선택: ");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49)
			{
				speed++;
				System.out.println("현재 속도=" + speed);
			}
			else if (keyCode == 50)
			{
				speed--;
				System.out.println("현재 속도=" + speed);
			}
			else if (keyCode == 51)
			{
				run = false;				//3을 누르는 순간, 반복은 중지가 된다.
			}
		}	
		System.out.println("프로그램 종료");	//"프로그램 종료" 출력.
	}
}