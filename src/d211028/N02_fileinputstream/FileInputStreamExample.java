package d211028.N02_fileinputstream;
import java.io.FileInputStream;
public class FileInputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("Users/ssolely/eclipse-workspace/study/src/d211028/N02_fileinputstream.java");
			int data;
			while ( (data = fis.read() ) != -1 )
			{
				System.out.write(data);
			}
			fis.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}