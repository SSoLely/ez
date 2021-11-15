package d211005;
class N15_FlowEx6
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random() * 10) + 1;							//1에서 10사이의 값을 얻는다.

		switch(score*100)													//그 값에 *100을 한다. 100에서 1000이 나올 것이다.
		{
			case 100 :
				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");	//case가 100이면 출력.
				break;
			case 200 :
				System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");	
				break;
			case 300 :
				System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
				break;
			case 400 :
				System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");	//400이면 출력.
				break;
			default :
				System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");	//400이상, 500부터 1000이면 출력.
		}
	}
}