package d211006;
public class N06_MainStringArrayArgument
{
	public static void main(String[] args)
	{
		if(args.length != 2)	//args라는 배열의 length(배열에 저장된 값들의 개수)가 2가 아니라면,
		{
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}