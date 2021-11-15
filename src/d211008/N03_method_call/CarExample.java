package d211008.N03_method_call;
public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();			//객체를 생성.
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();	//메소드를 호출.
		System.out.println("현재 속도: " + speed + "km/h");
	}
}