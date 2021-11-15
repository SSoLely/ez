package d211014.N05_exam07;
public class N3_SnowTireExample
{
	public static void main(String[] args)
	{
		N2_SnowTire snowTire = new N2_SnowTire();
		N1_Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}