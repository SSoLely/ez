package d211007.N6_constructor_overloading;
public class Car		//필드(멤버변수·전역변수)
{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car()				//기본 생성자
	{
	}
	
	Car(String model)
	{
		this.model = model;
	}
	
	Car(String model, String color)					//매개변수 2개
	{	
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed)	//매개변수 3개
	{	
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}