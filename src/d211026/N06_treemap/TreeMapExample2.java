package d211026.N06_treemap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapExample2
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(90), "이솔");
		scores.put(new Integer(91), "박꼬득");
		scores.put(new Integer(88), "신희진");
		scores.put(new Integer(92), "이수빈");
		scores.put(new Integer(98), "이정민");
		
		NavigableMap<Integer,String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingEntrySet)
		{
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}
}