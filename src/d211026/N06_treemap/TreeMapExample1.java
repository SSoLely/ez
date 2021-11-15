package d211026.N06_treemap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample1
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(90), "이솔");
		scores.put(new Integer(91), "박꼬득");
		scores.put(new Integer(88), "신희진");
		scores.put(new Integer(92), "이수빈");
		scores.put(new Integer(98), "이정민");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}