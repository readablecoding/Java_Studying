class TypeTest
{
	public static void main(String[] args) 
	{   byte a;
		short b;
		int c;
		long d;
		char e;

		// a = 200;
		b = 300;
		c = 400;

		a = 100;
		a = (byte)(a + 1);

		c = 1;
		//a = c;

		d = 10000000000L;

		e = '\n';

        System.out.println(e);
		System.out.println((int)e);

		System.out.println("ab\tcd\nefg\bx");

		float f;
		double g;

		f = 1.2F;
		g = 123.456;
		g = 1e3;
		g = 10 / 3.0;

		System.out.println(f);
		System.out.println(g);

		boolean h;
		h = true;


	}
}
