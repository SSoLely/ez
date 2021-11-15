package d211007.N5_field_initialize;
public class KoreanExample
{
	public static void main(String[] args)
	{
		Korean k1 = new Korean("이솔", "012345-0123456");		//Korean을 가져다 쓰기 위해서 Korean 클래스의 객체를 생성.
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("박꼬득", "123456-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
		Korean k3 = new Korean();							//객체 생성은 된다.
		k3.name="신희진";
		k3.ssn="234567-2345678";
		System.out.println("k3.name : " + k3.name);
		System.out.println("k3.ssn : " + k3.ssn);
	}
}