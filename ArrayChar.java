import java.util.Scanner;
class ArrayChar 
{
	public static void main(String[] args) 
	{

		Scanner b = new Scanner(System.in);
		String winner = "a";
		char ch[][] = new char[3][3];
		int round = 1;								// ���� üũ��
		int aa=49;									// ch[][]�� 1~9�� �Է��ϱ� ���� �ʱⰪ
		int p1, p2;									// �÷��̾��� �Է��� ����
		int draw;									// ���º� üũ�� ����
		int newgame = 0;								// �����ϱ� ��Ʈ�� ����
		boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;		//�� ��ȣ�� ��밡�ɿ��� üũ
		boolean oga1, oga2, oga3, ose1, ose2, ose3, ode1, ode2, ofin;	// 1�÷��̾� �¸�����
		boolean tga1, tga2, tga3, tse1, tse2, tse3, tde1, tde2, tfin;	// 2�÷��̾� �¸�����
		
	
		//ch[][]�� 1~9�� �Է��ϴ� ��ġ
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = 0; j < ch[0].length; j++)
			{
				ch[i][j] = (char)aa;
				aa++;
			}
		}

		//ǥ ���
			System.out.println("��������������������");
			for (int i = 0; i < ch.length; i++)
			{
				
				for (int j = 0; j < ch[0].length; j++)
				{
					System.out.print("��"+" "+ch[i][j]);
				}
				if (i != 2)
				{
					System.out.println("��\n��������������������");
				}
				else
					System.out.println("��\n��������������������");
			}

		while (true)
		{
			//boolean�� true�� ����ֱ�
			//o = 111
			//x = 120
				//1�÷��̾�
			oga1 = ch[0][0] + ch[0][1] + ch[0][2] == 333;
			oga2 = ch[1][0] + ch[1][1] + ch[1][2] == 333;
			oga3 = ch[2][0] + ch[2][1] + ch[2][2] == 333;

			ose1 = ch[0][0] + ch[1][0] + ch[2][0] == 333;
			ose2 = ch[0][1] + ch[1][1] + ch[2][1] == 333;
			ose3 = ch[0][2] + ch[1][2] + ch[2][2] == 333;

			ode1 = ch[0][0] + ch[1][1] + ch[2][2] == 333;
			ode2 = ch[0][2] + ch[1][1] + ch[2][0] == 333;

			ofin = oga1 || oga2 || oga3 || ose1 || ose2 || ose3 || ode1 || ode2;

				//2�÷��̾�
			tga1 = ch[0][0] + ch[0][1] + ch[0][2] == 360;
			tga2 = ch[1][0] + ch[1][1] + ch[1][2] == 360;
			tga3 = ch[2][0] + ch[2][1] + ch[2][2] == 360;

			tse1 = ch[0][0] + ch[1][0] + ch[2][0] == 360;
			tse2 = ch[0][1] + ch[1][1] + ch[2][1] == 360;
			tse3 = ch[0][2] + ch[1][2] + ch[2][2] == 360;

			tde1 = ch[0][0] + ch[1][1] + ch[2][2] == 360;
			tde2 = ch[0][2] + ch[1][1] + ch[2][0] == 360;

			tfin = tga1 || tga2 || tga3 || tse1 || tse2 || tse3 || tde1 || tde2;



				//�� ��ư�� ��ȣ üũ
			b1 = ch[0][0] == (char)49;
			b2 = ch[0][1] == (char)50;
			b3 = ch[0][2] == (char)51;
			b4 = ch[1][0] == (char)52;
			b5 = ch[1][1] == (char)53;
			b6 = ch[1][2] == (char)54;
			b7 = ch[2][0] == (char)55;
			b8 = ch[2][1] == (char)56;
			b9 = ch[2][2] == (char)57;

			
				//���º�üũ
			draw = 0;
			for (int i = 0; i < ch.length; i++)
			{
				for (int j = 0; j < ch[0].length; j++)
				{
					draw = ch[i][j] > 57 ? draw + 1 : draw;
				}
			}

				//�¸�üũ
			if (draw == 9)
			{
				winner = "���º�";
			}
			if (ofin == true)
			{
				winner = "�÷��̾� 1�� �¸�";
				draw = 9;
			}
			if (tfin == true)
			{
				winner = "�÷��̾� 2�� �¸�";
				draw = 9;
			}

			if (draw == 9)
			{
				System.out.println(winner +"�Դϴ�. �ٽ� �Ͻ÷��� 1, �����Ͻ÷��� �ƹ� ���ڳ� �Է����ּ���.");
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
						//ǥ �����
						System.out.println("��������������������");
						for (int i = 0; i < ch.length; i++)
						{
							
							for (int j = 0; j < ch[0].length; j++)
							{
								System.out.print("��"+" "+ch[i][j]);
							}
							if (i != 2)
							{
								System.out.println("��\n��������������������");
							}
							else
								System.out.println("��\n��������������������");
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

			



			//���� �÷���
			//�÷��̾�1 ����
			if (round%2 == 1)
			{
				System.out.println("�÷��̾�1�� ����.");
				System.out.print("��� �νðڽ��ϱ�? (1~9)");
				for (int i = 1; i < 2; i++)
				{
					p1 = b.nextInt();
					if (p1 < 1 || p1 > 9)
					{
						System.out.println("1~9 ������ ���� �Է����ֽʽÿ�.");
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
						System.out.println("���� �� ���� �ڸ��Դϴ�. �ٽ� �Է����ֽʽÿ�");
					}
					i--;
				}
			}


			//�÷��̾�2 ����
			if (round%2 == 0)
			{
				System.out.println("�÷��̾�2�� ����.");
				System.out.print("��� �νðڽ��ϱ�? (1~9)");
				
				for (int i = 1; i < 2; i++)
				{
					p2 = b.nextInt();
					if (p2 < 1 || p2 > 9)
					{
						System.out.println("1~9 ������ ���� �Է����ֽʽÿ�.");
						
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
						System.out.println("���� �� ���� �ڸ��Դϴ�. �ٽ� �Է����ֽʽÿ�");
						i--;
					}
					
				}
			}
			round++;

			//ǥ ���
			System.out.println("��������������������");
			for (int i = 0; i < ch.length; i++)
			{
				
				for (int j = 0; j < ch[0].length; j++)
				{
					System.out.print("��"+" "+ch[i][j]);
				}
				if (i != 2)
				{
					System.out.println("��\n��������������������");
				}
				else
					System.out.println("��\n��������������������");
			}
		}//while ��

		
	}//main()
}
