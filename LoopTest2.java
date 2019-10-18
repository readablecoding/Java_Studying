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
					i=0,j=0 i=0,j=1 프로그램 종료
					*/
					//continue out;
					/*
					 i=0,j=0 i=0,j=1 i=1,j=0 i=1,j=1 i=2,j=0 i=2,j=1 i=3,j=0 i=3,j=1 i=4,j=0 i=4,j=1 프로그램 종료
					*/
					//break in;
					/*
					i=0,j=0 i=0,j=1
					i=1,j=0 i=1,j=1
					i=2,j=0 i=2,j=1
					i=3,j=0 i=3,j=1
					i=4,j=0 i=4,j=1
					프로그램 종료
					*/

					//continue in;
					/*
					i=0,j=0 i=0,j=1 i=0,j=3 i=0,j=4
					i=1,j=0 i=1,j=1 i=1,j=3 i=1,j=4
					i=2,j=0 i=2,j=1 i=2,j=3 i=2,j=4
					i=3,j=0 i=3,j=1 i=3,j=3 i=3,j=4
					i=4,j=0 i=4,j=1 i=4,j=3 i=4,j=4
					프로그램 종료
					*/
				}
				System.out.print("i=" + i + ",j=" + j + "\t"); //25번 실행
			} //for문 int j
			System.out.println();
		} // for문 int i
		System.out.println("프로그램 종료"); //
	}
}
