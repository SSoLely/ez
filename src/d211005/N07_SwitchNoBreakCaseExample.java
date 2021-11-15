package d211005;
public class N07_SwitchNoBreakCaseExample
{
	public static void main(String[] args)
	{
		int time = (int)(Math.random()*4) + 8;			//Math.random()*4: 0에서 3까지의 int 값 중 랜덤. 여기에 8을 더하면 8에서 11까지 중 랜덤한 값이 나온다.
		System.out.println("[현재시간: " + time + " 시]");	//화면에 먼저 출력.
			
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}