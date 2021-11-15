package d211005;
import java.util.Scanner;
public class  N28_DoWhileExample
{
	public static void main(String[] args)
	{
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 exit를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do
		{
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}
		while( ! inputString.equals("exit") );	//while문의 조건: inputString에 들어간 게, "exit"가 아니라면.
												//"exit"를 주면 프로그램이 종료된다. //"exit"를 주지 않으면 계속 반복하게끔 만들었다.
		System.out.println();
		System.out.println("프로그램 종료");
	}
}