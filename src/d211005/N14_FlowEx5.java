package d211005;
class N14_FlowEx5 
{
	public static void main(String[] args) 
	{
		int score = 98;
		String grade ="";

		System.out.println("당신의 점수는 " + score + "입니다.");		//"당신의 점수는 98입니다." 출력.
		if (score >= 90)										//90보다 크거나 같으면,
		{
			grade = "A";										//학점은 A.
			if ( score >= 98)									//98보다 크거나 같으면,
			{
					grade += "+";								//기존의 grade에 "+"를 붙여서 A+가 되도록 한다.
			}
			else if ( score < 94)								//94보다 작으면,
			{
					grade += "-";								//A-가 된다.
			}
		}
		else if  (score >= 80)
		{														//80보다 크거나 같으면,
			grade = "B";										//B.
			if ( score >= 88)									//88보다 크거나 같으면,
			{
				grade += "+";									//B+
			}
			else if ( score < 84)								//84보다 작으면,
			{
				grade += "-";									//B-
			}
	     }
		else
		{
			grade = "C";
	     }
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}