/*
3 x 3 빙고 만들기
 ────┬────┬────┐
│   1│   2│   3│
├────┼────┼────┤
│   4│   5│   6│
├────┼────┼────┤
│   7│   8│   9│
└────┴────┴────┘
플레이어 1과 플레이어 2가 O, X 중 하나를 선택해 1~9까지 채운 수 중 하나를 선택해 O, X로 표시함
이전에 둔 곳에는 다시 둘 수 없다(중복 불가)
가로, 세로, 대각선으로 3칸을 하나의 O, X로 채우는 플레이어가 승리한다
플레이어 2 승리시, 플레이어 2가 승리했습니다 라고 보여주기
그리고 프로그램 종료 또는 새 게임으로 이동
*/
import java.util.Scanner;
class HomeWork_191025_2_bingo 
{
	public static void playerSelection()	
	{	
		System.out.println("오목은 가로, 세로, 대각선으로 한 줄을 완성시키면 승리합니다.");
		System.out.println("첫번째 플레이어는 마킹시 O가 됩니다.");
		System.out.println("두번째 플레이어는 마킹시 X가 됩니다.");
	} // playerSelection() 메서드

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char bingoRoom [][] = new char [3][3];
		int turn = 1; // 순서 결정
		int number = 49;	// 유니코드 49는 숫자 1이다.
		int p1, p2;		// 1 ~ 9 중 하나	
		//String select;		// 게임 종료 후 다시 할 것인지 말 것인지 결정하게 함.
		//boolean checkItem = true;	
		boolean same1, same2, same3, same4, same5, same6, same7, same8, same9; //각 번호의 사용가능여부 체크	

		// 3 * 3 빙고칸 만들기
		for(int i = 0; i < bingoRoom.length; i++)
		{
			for(int j = 0; j < bingoRoom.length; j++)
			{
				bingoRoom[i][j] = (char)number; // char 값을 int로 바꿨다가(int) String으로 바꿈("" 사용)
				number++;
			}
		}
		
		// 빙고판 출력
		System.out.println("┏━━━━┳━━━━┳━━━━┓");	// 선을 굴게 하면 선의 미세한 차이가 없어진다.
		for(int i = 0; i < bingoRoom.length; i++)
		{	
			
			for(int j = 0; j < bingoRoom[i].length;j++)
			{	
				System.out.printf("┃ %3s", bingoRoom[i][j]);
			}
			System.out.println("┃");
			if(i < bingoRoom[i].length - 1)
			{
				System.out.println("┣━━━━┃━━━━┃━━━━┫");
			}		
		}
		System.out.println("┗━━━━┻━━━━┻━━━━┛");
		
		// 값 입력받기
		playerSelection();
		
		loop1 : // 빙고 게임 탈출을 위해 만들어 놓은 루프
		while(true)
		{	
			// 게임 시작 전 중복 방지를 위한 작업으로 값 초기화 단계를 보여줌
			same1 =	 bingoRoom[0][0] == (char)49;
			same2 =  bingoRoom[0][1] == (char)50;
			same3 =  bingoRoom[0][2] == (char)51;
			same4 =  bingoRoom[1][0] == (char)52;
			same5 =  bingoRoom[1][1] == (char)53;
			same6 =  bingoRoom[1][2] == (char)54;
			same7 =  bingoRoom[2][0] == (char)55;
			same8 =  bingoRoom[2][1] == (char)56;
			same9 =  bingoRoom[2][2] == (char)57;
			
			// 플레이어1 자리 놓기
			if(turn % 2 == 1)
			{
				System.out.println("플레이어 1(O)은 1부터 9까지 입력하세요.");
				System.out.print("숫자 입력: ");
				for (int i = 1; i < 2; i++)
				{
					p1 = scan.nextInt();
					if (p1 < 1 || p1 > 9)
					{
						System.out.println("1~9 범위의 값을 입력해주십시오.");
					}
					if(p1 == 1 && same1 == true)
					{
						bingoRoom[0][0] = (char)79;
						break;
					}
					if(p1 == 2 && same2 == true)
					{
						bingoRoom[0][1] = (char)79;		
						break;
					}
					if(p1 == 3 && same3 == true)
					{
						bingoRoom[0][2] = (char)79;
						break;
					}
					if(p1 == 4 && same4 == true)
					{
						bingoRoom[1][0] = (char)79;	
						break;
					}
					if(p1 == 5 && same5 == true)
					{
						bingoRoom[1][1] = (char)79;	
						break;
					}
					if(p1 == 6 && same6 == true)
					{
						bingoRoom[1][2] = (char)79;
						break;
					}
					if(p1 == 7 && same7 == true)
					{
						bingoRoom[2][0] = (char)79;	
						break;
					}
					if(p1 == 8 && same8 == true)
					{
						bingoRoom[2][1] = (char)79;		
						break;
					}
					if(p1 == 9 && same9 == true)
					{
						bingoRoom[2][2] = (char)79;	
						break;
					}
					else
					{
						System.out.println("놓을 수 없는 자리입니다. 다시 입력해주십시오");		
					}
					i--;
				} //for문

			} //turn % 2 == 1일때
				
			// 빙고 됐는지 알아보기
			for(int i = 0; i < bingoRoom.length; i++)
			{
				for(int j = 0; j < bingoRoom[i].length; j++)
				{

					if((bingoRoom[i][0] == bingoRoom[i][1]) && (bingoRoom[i][1] == bingoRoom[i][2]))	// 가로
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[j][0] == bingoRoom[j][1]) && (bingoRoom[j][1] == bingoRoom[j][2]))	// 세로
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[0][0] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][2]))	// 대각선 1
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[0][2] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][0]))	//대각선 2
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
				}	// for문 변수 j
			}	// for문 변수 i
			
				// 플레이어1 자리 놓기
				if(turn % 2 == 0)
				{
					System.out.println("플레이어 2(X)는 1부터 9까지 입력하세요.");
					System.out.print("숫자 입력: ");
					for (int i = 1; i < 2; i++)
					{
						p2 = scan.nextInt();
						if (p2 < 1 || p2 > 9)
						{
							System.out.println("1~9 범위의 값을 입력해주십시오.");
						}
						if(p2 == 1 && same1 == true)
						{
							bingoRoom[0][0] = (char)88;
							break;
						}
						if(p2 == 2 && same2 == true)
						{
							bingoRoom[0][1] = (char)88;		
							break;
						}
						if(p2 == 3 && same3 == true)
						{
							bingoRoom[0][2] = (char)88;
							break;
						}
						if(p2 == 4 && same4 == true)
						{
							bingoRoom[1][0] = (char)88;	
							break;
						}
						if(p2 == 5 && same5 == true)
						{
							bingoRoom[1][1] = (char)88;	
							break;
						}
						if(p2 == 6 && same6 == true)
						{
							bingoRoom[1][2] = (char)88;
							break;
						}
						if(p2 == 7 && same7 == true)
						{
							bingoRoom[2][0] = (char)88;	
							break;
						}
						if(p2 == 8 && same8 == true)
						{
							bingoRoom[2][1] = (char)88;		
							break;
						}
						if(p2 == 9 && same9 == true)
						{
							bingoRoom[2][2] = (char)88;	
							break;
						}
						else
						{
							System.out.println("놓을 수 없는 자리입니다. 다시 입력해주십시오");
							
						}
						i--;
					}
				} //turn % 2 == 0 일때
				
				// 빙고 됐는지 알아보기
			
			for(int i = 0; i < bingoRoom.length; i++)
			{
				for(int j = 0; j < bingoRoom[i].length; j++)
				{

					if((bingoRoom[i][0] == bingoRoom[i][1]) && (bingoRoom[i][1] == bingoRoom[i][2]))	// 가로
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[j][0] == bingoRoom[j][1]) && (bingoRoom[j][1] == bingoRoom[j][2]))	// 세로
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[0][0] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][2]))	// 대각선 1
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
					if((bingoRoom[0][2] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][0]))	//대각선 2
					{
						if(turn % 2 == 1)
						{
							System.out.println("플레이어 1의 승리입니다.");
							break loop1;
						}
						else
						{
							System.out.println("플레이어 2의 승리입니다.");
							break loop1;
						}
					}
				}	// for문 변수 j
			}	// for문 변수 i
				
			turn++; // 횟수를 1 증가시켜 다른 플레이어에게 순서를 넘김

			// 빙고판 출력
			System.out.println("┏━━━━┳━━━━┳━━━━┓");	// 선을 굴게 하면 선의 미세한 차이가 없어진다.
			for(int i = 0; i < bingoRoom.length; i++)
			{	
			
				for(int j = 0; j < bingoRoom[i].length; j++)
				{	
				
					System.out.printf("┃ %3s", bingoRoom[i][j]);
				}
				System.out.println("┃");
				if(i < bingoRoom[i].length - 1)
				{
					System.out.println("┣━━━━┃━━━━┃━━━━┫");
				}		
			}
			System.out.println("┗━━━━┻━━━━┻━━━━┛");
			
			if(turn == 10)
			{	
				System.out.println("무승부입니다.");
				System.out.println("다시 하려면 숫자 1을 끝내려면 숫자 0을 입력하세요");
				System.out.print("숫자 입력 : ");
				int select = scan.nextInt();
				if(select == 1)
				{
					turn = 1;
					number = 49;
					for(int i = 0; i < bingoRoom.length; i++)
					{
						for(int j = 0; j < bingoRoom.length; j++)
						{
							bingoRoom[i][j] = (char)number; // char 값을 int로 바꿨다가(int) String으로 바꿈("" 사용)
							number++;
						}
					}
					continue;
				}// if문
				else
				{
					System.out.println("프로그램을 종료합니다.");
					return;
				}						
			} //if문 turn = 10일때	
		}
		// while문
			
			//결과 출력
			System.out.println("┏━━━━┳━━━━┳━━━━┓");	// 선을 굴게 하면 선의 미세한 차이가 없어진다.
			for(int i = 0; i < bingoRoom.length; i++)
			{	
			
				for(int j = 0; j < bingoRoom[i].length; j++)
				{	
				
					System.out.printf("┃ %3s", bingoRoom[i][j]);
				}
				System.out.println("┃");
				if(i < bingoRoom[i].length - 1)
				{
					System.out.println("┣━━━━┃━━━━┃━━━━┫");
				}		
			}
			System.out.println("┗━━━━┻━━━━┻━━━━┛");
	
	} //main
} // class

