package d211026.N10_queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample
{
	public static void main(String[] args)
	{
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "이솔"));
		messageQueue.offer(new Message("sendSMS", "박꼬득"));
		messageQueue.offer(new Message("sendKakaotalk", "신희진"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + " 님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + " 님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk": 
					System.out.println(message.to + " 님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}