package d211018.N14_test;
import java.util.HashMap;
import java.util.Scanner;
public class N3_Test12
{
	public static void main(String[] args)
	{
		String name = null;
		String phone = null;
		String search = null;
	
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("[전화번호 저장하기]");
		System.out.println("사용자 수 입력: ");
		int selectNo = scanner.nextInt();
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		for(int i = 0; i < selectNo; i++)
		{
			System.out.println("1. 이름입력: ");
			name = scanner.next();
			System.out.println("2. 전화번호 입력: ");
			phone = scanner.next();
			hashMap.put(name, phone);
		}
		System.out.println("저장완료!");
		
		System.out.println("[검색하기]");
		while(run)
		{
			System.out.println("검색할 이름 입력: ");
			search = scanner.next();
			
			if(search.equals("stop"))
			{
				System.out.println("프로그램을 종료합니다!");
				run = false;
				break;
			}
			if(hashMap.get(search) != null)
			{
				phone = hashMap.get(search);
				System.out.println(name + "씨의 번호는 " + phone + "입니다.");
			}
			else
			{
				System.out.println("입력하신 이름은 존재하지 않습니다.");
			}
		}
	}
}