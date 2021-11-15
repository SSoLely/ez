package d211005;
public class  N30_BreakOutterExample
{
	public static void main(String[] args) throws Exception
	{
		Outter: for(char upper='A'; upper<='Z'; upper++)
		{
					for(char lower='a'; lower<='z'; lower++)
					{
						System.out.println(upper + "-" + lower);
						if(lower=='g')		//만약에 lower 알파벳 'g'가 걸리면,
						{
							break Outter;	//모든 반복문을 빠져 나간다.
						}
					}
				}
		System.out.println("프로그램 종료");
	}
}