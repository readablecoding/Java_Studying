class LoopTest2 
{
	public static void main(String[] args) 
	{
		out:
		for( int i = 0; i < 5; i++)
		{
			in: 
			for(int j = 0; j < 5; j++)
			{
				if(j == 2)
				{
					break out; 
					/*
					i=0,j=0 i=0,j=1 ���α׷� ����
					*/
					//continue out;
					/*
					 i=0,j=0 i=0,j=1 i=1,j=0 i=1,j=1 i=2,j=0 i=2,j=1 i=3,j=0 i=3,j=1 i=4,j=0 i=4,j=1 ���α׷� ����
					*/
					//break in;
					/*
					i=0,j=0 i=0,j=1
					i=1,j=0 i=1,j=1
					i=2,j=0 i=2,j=1
					i=3,j=0 i=3,j=1
					i=4,j=0 i=4,j=1
					���α׷� ����
					*/

					//continue in;
					/*
					i=0,j=0 i=0,j=1 i=0,j=3 i=0,j=4
					i=1,j=0 i=1,j=1 i=1,j=3 i=1,j=4
					i=2,j=0 i=2,j=1 i=2,j=3 i=2,j=4
					i=3,j=0 i=3,j=1 i=3,j=3 i=3,j=4
					i=4,j=0 i=4,j=1 i=4,j=3 i=4,j=4
					���α׷� ����
					*/
				}
				System.out.print("i=" + i + ",j=" + j + "\t"); //25�� ����
			} //for�� int j
			System.out.println();
		} // for�� int i
		System.out.println("���α׷� ����"); //
	}
}
