class ForTest3 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5;  i++ )
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(j + " "); 
			} // for문 int j 끝
			System.out.println(); // 줄 바꾸는 용도
		} //for문 int i 끝
		System.out.println("-------------");

		/*
		0 1 2 3 4
		1 2 3 4
		2 3 4
		3 4
		4
		----------
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		----------
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1
		-----------
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		-----------
		1 0 0 0 0
		0 1 0 0 0
		0 0 1 0 0
		0 0 0 1 0
		0 0 0 0 1
		-----------
		0
		1 2
		2 3 4
		3 4 5 6
		4 5 6 7 8
		-----------
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		-----------
		*/

		/*
		0 1 2 3 4
		1 2 3 4
		2 3 4
		3 4
		4
		----------
		*/


		/*
	     *
	     **
	     ***
	     ****
	     *****
		 ------------
	     */

		 /*
		 *****
		 ****
		 ***
		 **
		 *
		 ------------
		 */

		 /*
		    *
		   **
		  ***
		 ****
		*****
		-------------
		*/

		/*
		*****
		 ****
		  ***
		   **
		    *
		-------------
		*/

		/*
		  *
		 ***
		*****
	   ********
	   --------------
	   */

		/*
			*
		   ***
		  *****
	       ***
			*
		-------------
		*/


		for(int i = 0; i < 5; i++)
		{ 
			for(int j = i; j < 5 ; j++)
			{
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");
			
		/*
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		----------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = 5; j > 0 ; j--)
			{
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");

		/*
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1
		-----------
		*/

		for(int i = 5; i > 0; i--)
		{ 
			for(int j = i; j > 0 ; j--)
			{
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");
		
		/*
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		-----------
		*/
		for(int i = 1; i < 6; i++)
		{ 
			for(int j = 1; j < 7 - i ; j++)
			{
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");


		/*
		1 0 0 0 0
		0 1 0 0 0
		0 0 1 0 0
		0 0 0 1 0
		0 0 0 0 1
		-----------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; j < 5 ; j++)
			{
				
					System.out.print(i == j ? "1 " : "0 ");
			}
			System.out.println();
		}
			System.out.println("-------------");

			for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; j < 5 ; j++)
			{
				
					System.out.print(i == j ? "* " : " ");
			}
			System.out.println();
		}
			System.out.println("-------------");


		/*
		0
		1 2
		2 3 4
		3 4 5 6
		4 5 6 7 8
		-----------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; i >= j; j++)
			{
				
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");

		/*
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		-----------
		*/
		int cnt = 0; // 세는 용도
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; j < 5; j++)
			{
				cnt++; // 세었으니 1 증가함
				System.out.print(cnt + " "); // 증가한 값을 보여줌
			}
			System.out.println();
		}
			System.out.println("-------------");
      /*

	  *
	  **
	  ***
	  ****
	  *****

	  */

	  for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; i >= j; j++)
			{
				
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
			System.out.println("-------------");
		
		/*
	     *
	     **
	     ***
	     ****
	     *****
		 ------------
	     */
	
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = 0; i >= j; j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println("-------------");

		/*
		 *****
		 ****
		 ***
		 **
		 *
		 ------------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			for(int j = i; j < 5; j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println("-------------");

		/*
		    *
		   **
		  ***
		 ****
		*****
		-------------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			
			for(int j = 0; j < 5; j++)
			{
				
				System.out.print(i + j >= 4 ? "*" : " ");
			}
			System.out.println();
		}
			System.out.println("-------------");

		/*
		*****
		 ****
		  ***
		   **
		    *
		-------------
		*/
		for(int i = 0; i < 5; i++)
		{ 
			
			for(int j = 0; j < 5; j++)
			{
				
				System.out.print(i <= j ? "*" : " ");
			}
		    System.out.println();
		}
		System.out.println("-------------");
		
		/*
		  *
		 ***
		*****
	   ********
	   --------------
	   */
	   
		for(int i = 3; i >= 0; i--)
		{ 
			for(int j = 0; j < 7 ; j++)
			{
				if(j <= (6 - i)  && j >= i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		

		for(int i = 0; i < 5; i++)
		{
			
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			for (int j = 0; j < i - 1; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
		}
		System.out.println("-------------");

		   
		
		/*
			*
		   ***
		  *****
	       ***
			*
		-------------
		*/
		
		// 인터넷 참고
		for (int i = 0; i < 3; i++) 
		{
			
            for (int j = i; j < 3; j++) 
			{
                System.out.print(" ");
            }
			
            for (int j = 0; j < i; j++) 
			{
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) 
			{
                System.out.print("*");
            }
			System.out.println();
        }
 
        // 하단 역삼각형을 출력하는 반복문
        for (int i = 0; i < 3; i++)
		{
 
            for (int j = 0; j < i; j++) 
			{
                System.out.print(" ");
            }
 
            for (int j = i; j < 3; j++) 
			{
                System.out.print("*");
            }
            for (int j = i + 1; j < 3; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
		System.out.println("-------------");


		//다른 방법 - 인터넷 참고
		int num = 4;
		for (int i = 0; i < num; i++) 
		{   
			for (int j = 1; j < num - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		for (int i = num; i > 0; i--) 
		{
			for (int j = num - i; j > 0; j--) 
			{
				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k > 0; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

	}	
}
		
	
		
		
