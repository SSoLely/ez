package d211007.N2_field_declaration;
public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();	//CarExmaple이라는 클래스에서 Car 클래스에 있는 다섯 개의 변수를 갖다 쓰려면 객체 생성이 첫 번째다.
		
		System.out.println("제작 회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);
		
		myCar.speed = 60;		//값을 넣을 수도 있다.
		System.out.println("수정된 속도: " + myCar.speed);
	}
}