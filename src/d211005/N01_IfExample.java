package d211005;
public class N01_IfExample
{
	public static void main(String[] args)
	{
		int score = 93;
		
		if(score>=90)									//true
		{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}												//true가 됐을 때는 두 줄의 실행문을 실행
		
		if(score< 90) 
			System.out.println("점수가 90보다 작습니다.");	//블록으로 감싸지 않았을 때는 한 줄만 실행 //조건을 만족하지 않으니 실행되지 않는다.
			System.out.println("등급은 B 입니다.");
	}
}