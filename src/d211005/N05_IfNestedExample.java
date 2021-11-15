package d211005;
public class N05_IfNestedExample
{
	public static void main(String[] args)
	{
		int score = (int)(Math.random()*20) + 81;	//(int)(Math.random()*20): 0에서 19까지의 랜덤한 값이 나온다. 81을 더하니 81에서 100 사이의 랜덤한 값을 뽑아준다.
		System.out.println("점수: " + score);			//score에 저장해서 출력
		
		String grade;
		
		if(score>=90)								//뽑아낸 score 점수가 90보다 크거나 같을 때,
 		{
			if(score>=95)
			{
				grade = "A+";						//95보다 크거나 같으면 "A+"
			}										
			else
			{
				grade = "A";						//아니면 "A"
			}	
		}
		else										//90보다 작을 때,
		{
			if(score>=85)
			{
				grade = "B+";						//85보다 크거나 같으면 "B+"
			}
			else
			{
				grade = "B";						//아니면 "B"
			}
		}
		
		System.out.println("학점: " + grade);
	}
}