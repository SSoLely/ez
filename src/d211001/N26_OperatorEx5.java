package d211001;
class N26_OperatorEx5
{
	public static void main(String[] args) 
	{
		byte b = 10;						//00001010			
		System.out.println("b = " + b );	//그냥 출력하면 10이 나온다.
		System.out.println("~b = " + ~b);	//~를 주면 비트가 뒤집어진다.
		System.out.println("~b+1 = " + (~b+1));
	}
}