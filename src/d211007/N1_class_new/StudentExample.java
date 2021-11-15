package d211007.N1_class_new;
public class StudentExample
{
	public static void main(String[] args)						//메인 메소드를 만들어 놓고,
	{
		Student s1 = new Student();								//Student 클래스를 가져다 쓰기 위해, s1이라는 객체명을 주고, new와 생성자를 붙여서 객체 생성을 한다.
		System.out.println("s1 변수가 Student 객체를 참조합니다.");	//출력
		System.out.println(s1.toString());
		
		Student s2 = new Student();								//s2라는 이름의 객체를 생성하고, 메모리를 받아서 사용한다.
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2.toString());
	}
}