package d211001;
class N27_OperatorEx6
{
	public static void main(String[] args)
	{
		byte b = 10;
		//byte result =~b;		//이게 안 되는 이유는 [~b]의 연산 결과가 int이기 때문이다. 그래서 byte에는 담을 수가 없다.
		byte result =(byte)~b;	//[~b]를 byte에 담으려면 변환해서 작업해야 한다.

		System.out.println("b = " + b );
		System.out.println("~b = " + result );
	}
}