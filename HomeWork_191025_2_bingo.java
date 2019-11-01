/*
3 x 3 ���� �����
 ������������������������������
��   1��   2��   3��
��������������������������������
��   4��   5��   6��
��������������������������������
��   7��   8��   9��
��������������������������������
�÷��̾� 1�� �÷��̾� 2�� O, X �� �ϳ��� ������ 1~9���� ä�� �� �� �ϳ��� ������ O, X�� ǥ����
������ �� ������ �ٽ� �� �� ����(�ߺ� �Ұ�)
����, ����, �밢������ 3ĭ�� �ϳ��� O, X�� ä��� �÷��̾ �¸��Ѵ�
�÷��̾� 2 �¸���, �÷��̾� 2�� �¸��߽��ϴ� ��� �����ֱ�
�׸��� ���α׷� ���� �Ǵ� �� �������� �̵�
*/
import java.util.Scanner;
class HomeWork_191025_2_bingo 
{
	public static void playerSelection()	
	{	
		System.out.println("������ ����, ����, �밢������ �� ���� �ϼ���Ű�� �¸��մϴ�.");
		System.out.println("ù��° �÷��̾�� ��ŷ�� O�� �˴ϴ�.");
		System.out.println("�ι�° �÷��̾�� ��ŷ�� X�� �˴ϴ�.");
	} // playerSelection() �޼���

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char bingoRoom [][] = new char [3][3];
		int turn = 1; // ���� ����
		int number = 49;	// �����ڵ� 49�� ���� 1�̴�.
		int p1, p2;		// 1 ~ 9 �� �ϳ�	
		//String select;		// ���� ���� �� �ٽ� �� ������ �� ������ �����ϰ� ��.
		//boolean checkItem = true;	
		boolean same1, same2, same3, same4, same5, same6, same7, same8, same9; //�� ��ȣ�� ��밡�ɿ��� üũ	

		// 3 * 3 ����ĭ �����
		for(int i = 0; i < bingoRoom.length; i++)
		{
			for(int j = 0; j < bingoRoom.length; j++)
			{
				bingoRoom[i][j] = (char)number; // char ���� int�� �ٲ�ٰ�(int) String���� �ٲ�("" ���)
				number++;
			}
		}
		
		// ������ ���
		System.out.println("��������������������������������");	// ���� ���� �ϸ� ���� �̼��� ���̰� ��������.
		for(int i = 0; i < bingoRoom.length; i++)
		{	
			
			for(int j = 0; j < bingoRoom[i].length;j++)
			{	
				System.out.printf("�� %3s", bingoRoom[i][j]);
			}
			System.out.println("��");
			if(i < bingoRoom[i].length - 1)
			{
				System.out.println("��������������������������������");
			}		
		}
		System.out.println("��������������������������������");
		
		// �� �Է¹ޱ�
		playerSelection();
		
		loop1 : // ���� ���� Ż���� ���� ����� ���� ����
		while(true)
		{	
			// ���� ���� �� �ߺ� ������ ���� �۾����� �� �ʱ�ȭ �ܰ踦 ������
			same1 =	 bingoRoom[0][0] == (char)49;
			same2 =  bingoRoom[0][1] == (char)50;
			same3 =  bingoRoom[0][2] == (char)51;
			same4 =  bingoRoom[1][0] == (char)52;
			same5 =  bingoRoom[1][1] == (char)53;
			same6 =  bingoRoom[1][2] == (char)54;
			same7 =  bingoRoom[2][0] == (char)55;
			same8 =  bingoRoom[2][1] == (char)56;
			same9 =  bingoRoom[2][2] == (char)57;
			
			// �÷��̾�1 �ڸ� ����
			if(turn % 2 == 1)
			{
				System.out.println("�÷��̾� 1(O)�� 1���� 9���� �Է��ϼ���.");
				System.out.print("���� �Է�: ");
				for (int i = 1; i < 2; i++)
				{
					p1 = scan.nextInt();
					if (p1 < 1 || p1 > 9)
					{
						System.out.println("1~9 ������ ���� �Է����ֽʽÿ�.");
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
						System.out.println("���� �� ���� �ڸ��Դϴ�. �ٽ� �Է����ֽʽÿ�");		
					}
					i--;
				} //for��

			} //turn % 2 == 1�϶�
				
			// ���� �ƴ��� �˾ƺ���
			for(int i = 0; i < bingoRoom.length; i++)
			{
				for(int j = 0; j < bingoRoom[i].length; j++)
				{

					if((bingoRoom[i][0] == bingoRoom[i][1]) && (bingoRoom[i][1] == bingoRoom[i][2]))	// ����
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[j][0] == bingoRoom[j][1]) && (bingoRoom[j][1] == bingoRoom[j][2]))	// ����
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[0][0] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][2]))	// �밢�� 1
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[0][2] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][0]))	//�밢�� 2
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
				}	// for�� ���� j
			}	// for�� ���� i
			
				// �÷��̾�1 �ڸ� ����
				if(turn % 2 == 0)
				{
					System.out.println("�÷��̾� 2(X)�� 1���� 9���� �Է��ϼ���.");
					System.out.print("���� �Է�: ");
					for (int i = 1; i < 2; i++)
					{
						p2 = scan.nextInt();
						if (p2 < 1 || p2 > 9)
						{
							System.out.println("1~9 ������ ���� �Է����ֽʽÿ�.");
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
							System.out.println("���� �� ���� �ڸ��Դϴ�. �ٽ� �Է����ֽʽÿ�");
							
						}
						i--;
					}
				} //turn % 2 == 0 �϶�
				
				// ���� �ƴ��� �˾ƺ���
			
			for(int i = 0; i < bingoRoom.length; i++)
			{
				for(int j = 0; j < bingoRoom[i].length; j++)
				{

					if((bingoRoom[i][0] == bingoRoom[i][1]) && (bingoRoom[i][1] == bingoRoom[i][2]))	// ����
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[j][0] == bingoRoom[j][1]) && (bingoRoom[j][1] == bingoRoom[j][2]))	// ����
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[0][0] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][2]))	// �밢�� 1
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
					if((bingoRoom[0][2] == bingoRoom[1][1]) && (bingoRoom[1][1] == bingoRoom[2][0]))	//�밢�� 2
					{
						if(turn % 2 == 1)
						{
							System.out.println("�÷��̾� 1�� �¸��Դϴ�.");
							break loop1;
						}
						else
						{
							System.out.println("�÷��̾� 2�� �¸��Դϴ�.");
							break loop1;
						}
					}
				}	// for�� ���� j
			}	// for�� ���� i
				
			turn++; // Ƚ���� 1 �������� �ٸ� �÷��̾�� ������ �ѱ�

			// ������ ���
			System.out.println("��������������������������������");	// ���� ���� �ϸ� ���� �̼��� ���̰� ��������.
			for(int i = 0; i < bingoRoom.length; i++)
			{	
			
				for(int j = 0; j < bingoRoom[i].length; j++)
				{	
				
					System.out.printf("�� %3s", bingoRoom[i][j]);
				}
				System.out.println("��");
				if(i < bingoRoom[i].length - 1)
				{
					System.out.println("��������������������������������");
				}		
			}
			System.out.println("��������������������������������");
			
			if(turn == 10)
			{	
				System.out.println("���º��Դϴ�.");
				System.out.println("�ٽ� �Ϸ��� ���� 1�� �������� ���� 0�� �Է��ϼ���");
				System.out.print("���� �Է� : ");
				int select = scan.nextInt();
				if(select == 1)
				{
					turn = 1;
					number = 49;
					for(int i = 0; i < bingoRoom.length; i++)
					{
						for(int j = 0; j < bingoRoom.length; j++)
						{
							bingoRoom[i][j] = (char)number; // char ���� int�� �ٲ�ٰ�(int) String���� �ٲ�("" ���)
							number++;
						}
					}
					continue;
				}// if��
				else
				{
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}						
			} //if�� turn = 10�϶�	
		}
		// while��
			
			//��� ���
			System.out.println("��������������������������������");	// ���� ���� �ϸ� ���� �̼��� ���̰� ��������.
			for(int i = 0; i < bingoRoom.length; i++)
			{	
			
				for(int j = 0; j < bingoRoom[i].length; j++)
				{	
				
					System.out.printf("�� %3s", bingoRoom[i][j]);
				}
				System.out.println("��");
				if(i < bingoRoom[i].length - 1)
				{
					System.out.println("��������������������������������");
				}		
			}
			System.out.println("��������������������������������");
	
	} //main
} // class

