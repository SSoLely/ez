package d211026.N02_hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample1
{
	public static void main(String[] args)
	{
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("이솔", 92);
		map.put("박꼬득", 90);
		map.put("신희진", 88);
		map.put("이솔", 90);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기		
		System.out.println("\t이솔 : " + map.get("이솔"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext())
		{
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		//객체 삭제
		map.remove("신희진");
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext())
		{
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}