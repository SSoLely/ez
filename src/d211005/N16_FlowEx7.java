package d211005;
class N16_FlowEx7
{
	public static void main(String[] args) 
	{
		char ch = (char)(Math.random() * 4 + 'A');	//0에서 3(0, 1, 2, 3). A(65)를 더하면 65, 66, 67, 68이다. char 타입에 넣으면 A, B, C, D 중에 하나가 나온다.
		int score = 0;
		
		switch (ch)									//Switch문
		{
			case 'A':
				score = 90;
				break;
			case 'B':
				score = 80;
				break;
			case 'C':
				score = 70;
				break;
			case 'D':
				score = 60;
				break;
		}
		System.out.println("당신의 점수는 "+ score +"점 이상 입니다.");		
	}
}