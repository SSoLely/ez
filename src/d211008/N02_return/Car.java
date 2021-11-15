package d211008.N02_return;
public class Car
{
	int gas;	//클래스 블록에 선언한 변수는, 객체를 생성하면, 어디서든지 접근할 수 있다. //변수 gas
	
				//생성자 정의 안 함. 기본 생성자 쓰는 것.
	
	void setGas(int gas)	//setGas 메소드는 int 타입의 값을 받아서 리턴 안 할 것이다. 값을 받아와서, 변수만 설정.
	{
		this.gas = gas;		//필드의 값을, 받아오는 값으로 설정. 멤버변수 gas를 매개변수 gas로 설정함. 멤버변수를 지칭하기 위해서 this를 붙인 것.
	}						//앞에 있는 this.gas가 멤버변수, 뒤에 있는 gas는 setGas가 받아오는 매개변수.
	
	boolean isLeftGas()								//isLeftGas 메소드는 매개변수 없이, true·false를 리턴.
	{
		if(gas==0)									//조건문 //변수 gas에 들어있는 값이 0이면,
		{
			System.out.println("gas가 없습니다."); 	//"gas가 없습니다."를 출력한 다음에,
			return false;							//return에 걸리는 순간, false를 리턴하면서, 메소드 밖으로 나가 버린다.
		}
		System.out.println("gas가 있습니다."); 		//조건을 만족시키지 않으면(gas가 0이 아니면), "gas가 있습니다."를 출력하고,
		return true;								//true를 리턴하고 마무리.
	}
	
	void run()														//run은 매개변수도 없고, 리턴도 안 한다.
	{
		while(true)													//무한루프로 도는 while문.
		{
			if(gas > 0)												//gas가 0보다 크면,
			{
				System.out.println("달립니다.(gas잔량: " + gas + ")");	//출력하고,
				gas -= 1;											//gas를 1만큼 감소시킨다.
			}
			else													//gas가 0보다 크지 않으면(gas가 0),
			{
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");	//출력하고,
				return;												//return이 붙으면, 메소드를 빠져나간다.
			}
		}
	}
}