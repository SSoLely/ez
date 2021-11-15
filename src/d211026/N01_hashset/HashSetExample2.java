package d211026.N01_hashset;
import java.util.*;
public class HashSetExample2
{
	public static void main(String[] args)
	{
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("이솔", 31));
		set.add(new Member("이솔", 31));
		
		System.out.println("총 객체 수 : " + set.size());
	}
}