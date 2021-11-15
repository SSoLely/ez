package d211005;
class N11_FlowEx2 
{ 
      public static void main(String[] args) 
      { 
            int visitCount = 5; 
            if (visitCount < 1)											//조건문 //방문 수가 1보다 작으면, 
            {
            	System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");	//"처음 오셨군요. 방문해 주셔서 감사합니다." 출력
            }
            else														//1보다 작지 않다.=1보다 크거나 같다.
            {
            	System.out.println("다시 방문해 주셔서 감사합니다.");
            } 
            System.out.println("방문횟수는 " + ++visitCount + "번입니다.");	//문자열과 int 타입의 변수와 문자열을 + 연산자로 연결해주고 있다.
      } 
}