package d211008.N03_method_call;
public class Car
{
	int speed;														//변수 speed
	
	//메소드 getSpeed, keyTurnOn, run 3
	int getSpeed()													//getSpeed는,
	{
		return speed;												//위에 있는 speed 값을 리턴.
	}
	
	void keyTurnOn()												//keyTurnOn은,
	{
		System.out.println("키를 돌립니다.");							//"키를 돌립니다." 출력.
	}	
	
	void run()														//run 메소드는,
	{
		for(int i=10; i<=50; i+=10)									//i는 10부터 50까지 10씩 증가시킨다. 10,20,30,40,50 다섯 번 반복.
		{
			speed = i;												//speed는 변수 i의 값을 대입하고,
			System.out.println("달립니다.(시속:" + speed + "km/h)");	//출력.
		}
	}	
}