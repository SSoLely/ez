package d211022.N11_wait_notify;
public class WaitNotifyExample
{
	public static void main(String[] args)
	{
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}