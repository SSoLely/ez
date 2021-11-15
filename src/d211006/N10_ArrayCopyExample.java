package d211006;
public class N10_ArrayCopyExample
{
	public static void main(String[] args)
	{
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);	//oldStrArray.length=3
		
		for(int i=0; i<newStrArray.length; i++)
		{
			System.out.print(newStrArray[i] + ", ");
		}
	}
}