package d211007.N7_other_constructor_call;
public class Car
{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
	}
	
	Car(String model)
	{
		this.model = model;
		this.color = null;
		this.maxSpeed = 0;					
	}
	
	Car(String model, String color)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = 0;		
	}
	
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}