import java.util.Scanner;
class ArrayChar 
{
	public static void main(String[] args) 
	{

		Scanner b = new Scanner(System.in);
		String winner = "a";
		char ch[][] = new char[3][3];
		int round = 1;								// 라운드 체크값
		int aa=49;									// ch[][]에 1~9를 입력하기 위한 초기값
		int p1, p2;									// 플레이어의 입력을 저장
		int draw;									// 무승부 체크용 변수
		int newgame = 0;								// 새로하기 컨트롤 변수
		boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;		//각 번호의 사용가능여부 체크
		boolean oga1, oga2, oga3, ose1, ose2, ose3, ode1, ode2, ofin;	// 1플레이어 승리조건
		boolean tga1, tga2, tga3, tse1, tse2, tse3, tde1, tde2, tfin;	// 2플레이어 승리조건
		
	
		//ch[][]에 1~9를 입력하는 장치
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = 0; j < ch[0].length; j++)
			{
				ch[i][j] = (char)aa;
				aa++;
			}
		}

		//표 출력
			System.out.println("┏━━┳━━┳━━┓");
			for (int i = 0; i < ch.length; i++)
			{
				
				for (int j = 0; j < ch[0].length; j++)
				{
					System.out.print("┃"+" "+ch[i][j]);
				}
				if (i != 2)
				{
					System.out.println("┃\n┣━━╋━━╋━━┫");
				}
				else
					System.out.println("┃\n┗━━┻━━┻━━┛");
			}

		while (true)
		{
			//boolean에 true값 집어넣기
			//o = 111
			//x = 120
				//1플레이어
			oga1 = ch[0][0] + ch[0][1] + ch[0][2] == 333;
			oga2 = ch[1][0] + ch[1][1] + ch[1][2] == 333;
			oga3 = ch[2][0] + ch[2][1] + ch[2][2] == 333;

			ose1 = ch[0][0] + ch[1][0] + ch[2][0] == 333;
			ose2 = ch[0][1] + ch[1][1] + ch[2][1] == 333;
			ose3 = ch[0][2] + ch[1][2] + ch[2][2] == 333;

			ode1 = ch[0][0] + ch[1][1] + ch[2][2] == 333;
			ode2 = ch[0][2] + ch[1][1] + ch[2][0] == 333;

			ofin = oga1 || oga2 || oga3 || ose1 || ose2 || ose3 || ode1 || ode2;

				//2플레이어
			tga1 = ch[0][0] + ch[0][1] + ch[0][2] == 360;
			tga2 = ch[1][0] + ch[1][1] + ch[1][2] == 360;
			tga3 = ch[2][0] + ch[2][1] + ch[2][2] == 360;

			tse1 = ch[0][0] + ch[1][0] + ch[2][0] == 360;
			tse2 = ch[0][1] + ch[1][1] + ch[2][1] == 360;
			tse3 = ch[0][2] + ch[1][2] + ch[2][2] == 360;

			tde1 = ch[0][0] + ch[1][1] + ch[2][2] == 360;
			tde2 = ch[0][2] + ch[1][1] + ch[2][0] == 360;

			tfin = tga1 || tga2 || tga3 || tse1 || tse2 || tse3 || tde1 || tde2;



				//각 버튼별 번호 체크
			b1 = ch[0][0] == (char)49;
			b2 = ch[0][1] == (char)50;
			b3 = ch[0][2] == (char)51;
			b4 = ch[1][0] == (char)52;
			b5 = ch[1][1] == (char)53;
			b6 = ch[1][2] == (char)54;
			b7 = ch[2][0] == (char)55;
			b8 = ch[2][1] == (char)56;
			b9 = ch[2][2] == (char)57;

			
				//무승부체크
			draw = 0;
			for (int i = 0; i < ch.length; i++)
			{
				for (int j = 0; j < ch[0].length; j++)
				{
					draw = ch[i][j] > 57 ? draw + 1 : draw;
				}
			}

				//승리체크
			if (draw == 9)
			{
				winner = "무승부";
			}
			if (ofin == true)
			{
				winner = "플레이어 1의 승리";
				draw = 9;
			}
			if (tfin == true)
			{
				winner = "플레이어 2의 승리";
				draw = 9;
			}

			if (draw == 9)
			{
				System.out.println(winner +"입니다. 다시 하시려면 1, 종료하시려면 아무 숫자나 입력해주세요.");
				newgame = b.nextInt();
				switch (newgame)
				{
				case 1 : round = 1;
						p1 = 0;
						p2 = 0;
						newgame = 0;
						aa=49;
						for (int i = 0; i < ch.length; i++)
						{
							for (int j = 0; j < ch[0].length; j++)
							{
								ch[i][j] = (char)aa;
								aa++;
							}
						}
						//표 재출력
						System.out.println("┏━━┳━━┳━━┓");
						for (int i = 0; i < ch.length; i++)
						{
							
							for (int j = 0; j < ch[0].length; j++)
							{
								System.out.print("┃"+" "+ch[i][j]);
							}
							if (i != 2)
							{
								System.out.println("┃\n┣━━╋━━╋━━┫");
							}
							else
								System.out.println("┃\n┗━━┻━━┻━━┛");
						}
						b1 = ch[0][0] == (char)49;
						b2 = ch[0][1] == (char)50;
						b3 = ch[0][2] == (char)51;
						b4 = ch[1][0] == (char)52;
						b5 = ch[1][1] == (char)53;
						b6 = ch[1][2] == (char)54;
						b7 = ch[2][0] == (char)55;
						b8 = ch[2][1] == (char)56;
						b9 = ch[2][2] == (char)57;
						break;

				default :
				case 2 : return;
				}
			}

			



			//게임 플레이
			//플레이어1 차례
			if (round%2 == 1)
			{
				System.out.println("플레이어1의 차례.");
				System.out.print("어디에 두시겠습니까? (1~9)");
				for (int i = 1; i < 2; i++)
				{
					p1 = b.nextInt();
					if (p1 < 1 || p1 > 9)
					{
						System.out.println("1~9 범위의 값을 입력해주십시오.");
					}
					if (p1 == 1 && b1 == true)
					{
						ch[0][0] = (char)111;
						break;
					}
					if (p1 == 2 && b2 == true)
					{
						ch[0][1] = (char)111;
						break;
					}
					if (p1 == 3 && b3 == true)
					{
						ch[0][2] = (char)111;
						break;
					}
					if (p1 == 4 && b4 == true)
					{
						ch[1][0] = (char)111;
						break;
					}
					if (p1 == 5 && b5 == true)
					{
						ch[1][1] = (char)111;
						break;
					}
					if (p1 == 6 && b6 == true)
					{
						ch[1][2] = (char)111;
						break;
					}
					if (p1 == 7 && b7 == true)
					{
						ch[2][0] = (char)111;
						break;
					}
					if (p1 == 8 && b8 == true)
					{
						ch[2][1] = (char)111;
						break;
					}
					if (p1 == 9 && b9 == true)
					{
						ch[2][2] = (char)111;
						break;
					}
					else
					{
						System.out.println("놓을 수 없는 자리입니다. 다시 입력해주십시오");
					}
					i--;
				}
			}


			//플레이어2 차례
			if (round%2 == 0)
			{
				System.out.println("플레이어2의 차례.");
				System.out.print("어디에 두시겠습니까? (1~9)");
				
				for (int i = 1; i < 2; i++)
				{
					p2 = b.nextInt();
					if (p2 < 1 || p2 > 9)
					{
						System.out.println("1~9 범위의 값을 입력해주십시오.");
						
					}
					if (p2 == 1 && b1 == true)
					{
						ch[0][0] = (char)120;
						break;
					}
					if (p2 == 2 && b2 == true)
					{
						ch[0][1] = (char)120;
						break;
					}
					if (p2 == 3 && b3 == true)
					{
						ch[0][2] = (char)120;
						break;
					}
					if (p2 == 4 && b4 == true)
					{
						ch[1][0] = (char)120;
						break;
					}
					if (p2 == 5 && b5 == true)
					{
						ch[1][1] = (char)120;
						break;
					}
					if (p2 == 6 && b6 == true)
					{
						ch[1][2] = (char)120;
						break;
					}
					if (p2 == 7 && b7 == true)
					{
						ch[2][0] = (char)120;
						break;
					}
					if (p2 == 8 && b8 == true)
					{
						ch[2][1] = (char)120;
						break;
					}
					if (p2 == 9 && b9 == true)
					{
						ch[2][2] = (char)120;
						break;
					}
					else
					{
						System.out.println("놓을 수 없는 자리입니다. 다시 입력해주십시오");
						i--;
					}
					
				}
			}
			round++;

			//표 출력
			System.out.println("┏━━┳━━┳━━┓");
			for (int i = 0; i < ch.length; i++)
			{
				
				for (int j = 0; j < ch[0].length; j++)
				{
					System.out.print("┃"+" "+ch[i][j]);
				}
				if (i != 2)
				{
					System.out.println("┃\n┣━━╋━━╋━━┫");
				}
				else
					System.out.println("┃\n┗━━┻━━┻━━┛");
			}
		}//while 끝

		
	}//main()
}
