package d211008.N02_return;
public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();	//Car 클래스를 가져다 쓰기 위해 객체 생성.
		
		myCar.setGas(5);		//gas를 5만큼 주입. 5는 매개변수 gas에 저장이 돼서, 멤버변수 gas에 설정된다.
		
		boolean gasState = myCar.isLeftGas();	//gas가 5니까, true를 리턴할 것.
		if(gasState)							//리턴한 값을 변수 gasState에 저장.
		{
			System.out.println("출발합니다.");		//이 값이 true가 맞으면, "출발합니다."라고 출력하고,
			myCar.run();						//run 호출.
		}
		
		if(myCar.isLeftGas())								//isLeftGas로,
		{
			System.out.println("gas를 주입할 필요가 없습니다.");	//gas가 있으면,
		} else {
			System.out.println("gas를 주입하세요.");			//없으면.
		}
	}
}