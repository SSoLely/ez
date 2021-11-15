package d211026.N02_hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample2
{
	public static void main(String[] args)
	{
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "이솔"), 90);
		map.put(new Student(1, "이솔"), 90);
		
		System.out.println("총 Entry 수: " + map.size());
	}
}