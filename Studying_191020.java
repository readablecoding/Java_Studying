class Studying_191020 
{
  public static void main(String[] args) 
  {
    int i, j, k;
    
    // �Ƕ�̵� ����� 
   for(i = 0; i < 5; i++)
   {	
      for(j = 4 - i ; j > 0; j--) // 4, 3, 2, 1, 0ĭ�� ��ĭ ä��� �뵵
      {	
        System.out.print(" "); 
      } // for�� ù��° ���� j
      for(j = 0; j < (2 * i + 1); j++) // 1, 2, 3, ... 8, 9ĭ���� �� ä��� �뵵
      {	
        System.out.print("*"); 
      } // for�� �ι�° ���� j
      System.out.println();	// �� �ٲ�
    } // for�� ���� i
    System.out.println("----------------");

   i = 0;
   while(i < 5)
   {
     j = 4 - i;
     while(j > 0)
     {
       System.out.print(" "); 
       j--;
     } // while�� ���� j ù��
    j = 0;
    while(j < (2 * i + 1))
    {
      System.out.print("*");
      j++;
    } // while�� ���� j �ι�°
    System.out.println();
    i++;
   }  // while�� ���� i
   System.out.println("----------------");

    // ���Ƕ�̵� �����
    for(i = 0; i < 5; i++) // i�� 0���� 4���� ������ ������
    {	
      for(j = 0; j < (9 - i); j++) // j�� 0���� �ִ� 9���� ���� ä��� �ּҷδ� 1������ ä��
      {	
        System.out.print(j < i ? " " : "*"); // i�� j���� ũ�� ��ĭ�� ����� �� �ܿ��� ���� ä�� 
      } // for�� ���� j
      System.out.println(); // �� �ٲ�
    }  // for�� ���� i
    System.out.println("----------------");

    i = 0;
    while(i < 5)
    {
      j = 0;
      while(j < (9 - i))
      {
        System.out.print(j < i ? " " : "*");
        j++;
      } // while�� ���� j
      System.out.println();
      i++;
    } // while�� ���� i
    System.out.println("----------------");


    // ���̾Ƹ�� �����
    for(i = 1; i < 10; i++)	
    {	
      for(j = 1; j < 10; j++) 
      { if(i <= 5)	                  // 1 ~ 5 ����� ��ĭ ����, �� ����(1 ~ 9)
        {	if(5 - i < j && j < 5 + i)  // �� ä���
          {	
            System.out.print("*");	
          }	
          else	                      // ��ĭ ä���
          { 
            System.out.print(" ");	
          } 
        }                             // if��
        else                          // 6 ~ 9����� ��ĭ ����, �� ����(7 ~ 1)
        {	
          if(i - 5 < j && j < 15 - i)	// �� ä���
          {	
            System.out.print("*");	
          } 
          else	                      // ��ĭ ä���
          { 
            System.out.print(" ");	
          } 
        }                             // else  
      }                               // for�� ���� j 
      System.out.println();	
    }                                 // for�� ���� i
    System.out.println("----------------");	

    i = 1;
    while(i < 10)
    {
      j = 1;
      while(j < 10)
      {
        if(i <= 5)	                 
        {	if(5 - i < j && j < 5 + i)  
          {	
            System.out.print("*");	
          } // 	
          else	                      
          { 
            System.out.print(" ");	
          } 
        } // ù��° if��                            
        else                          
        {	
          if(i - 5 < j && j < 15 - i)	
          {	
            System.out.print("*");	
          } 
          else	                      
          { 
            System.out.print(" ");	
          } 
        } // ù��° else
        j++;           
      } // while�� ���� j
      System.out.println();
      i++;
    } // while�� ���� i
    System.out.println("----------------");



    // ������ ������ ���
    for(i = 1; i < 10; i++)  // i�� ���� ��Ÿ��. 1 ~ 9 ����
    {
			for(j = 1; j < 10; j++)  // j�� ���� ��Ÿ�� 1 ~ 9 ����
      {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t"); 
        // �������� �պκ��� ���� �� �ڸ��� �ٲ�� ���� �������� �Ǳ� ������ ����. \t �� ���� ������ ���� �������� ����
			} // for�� ���� j
      System.out.println(); // 9�� ���� ��Ÿ���� �����ٷ� �ű�
    } // for�� ���� i
    System.out.println("----------------");
    
    i = 1;
    while(i < 10)
    {
      j = 1;
      while(j < 10)
      {
        System.out.print(j + "*" + i + "=" + (j * i) + "\t");
        j++;
      } // while�� ���� j
      System.out.println();
      i++;
    } // while�� ���� i
    System.out.println("----------------");


    // ������ 3�� ���
    for(i = 1; i < 10; i += 3)  // i�� 1, 4, 7�� ��Ÿ������ �Ѵ�.
    {
      for(j = 1; j < 10; j++) // j�� ���� ��(1 ~ 9), �������� ���ڸ��� ��Ÿ���� ����
      {
        for(k = i; k < i + 3; k++) // k�� i�� �����θ� ���̵��� ���� ��. �������� ���ڸ��� ��Ÿ���� ����
        {
          System.out.print(k + "*" + j + "=" + (k * j) + "\t"); // �������� ��Ÿ��
        } // for�� ���� k
        System.out.println(); // �� �ٲ�
      } // for�� ���� j
      System.out.println(); // 3�ܿ��� 4��, 6�ܿ��� 7������ �� �� �� �� �絵�� ����
    } // for�� ���� i
    System.out.println("----------------");

    i = 1;
    while(i < 10)
    {
      j = 1;
      while(j < 10)
      {
        k = i;
        while(k < i + 3)
        {
          System.out.print(k + "*" + j + "=" + (k * j) + "\t");
          k++;
        } // while�� ���� k
        System.out.println();
        j++;
      } // while�� ���� j
      System.out.println();
      i += 3;
    } // while�� ���� i 
    System.out.println("----------------");

  } // main

} // class