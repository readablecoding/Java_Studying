class Studying_191020 
{
  public static void main(String[] args) 
  {
    int i, j, k;
    
    // 피라미드 만들기 
   for(i = 0; i < 5; i++)
   {	
      for(j = 4 - i ; j > 0; j--) // 4, 3, 2, 1, 0칸씩 빈칸 채우는 용도
      {	
        System.out.print(" "); 
      } // for문 첫번째 변수 j
      for(j = 0; j < (2 * i + 1); j++) // 1, 2, 3, ... 8, 9칸까지 별 채우는 용도
      {	
        System.out.print("*"); 
      } // for문 두번째 변수 j
      System.out.println();	// 줄 바꿈
    } // for문 변수 i
    System.out.println("----------------");

   i = 0;
   while(i < 5)
   {
     j = 4 - i;
     while(j > 0)
     {
       System.out.print(" "); 
       j--;
     } // while문 변수 j 첫번
    j = 0;
    while(j < (2 * i + 1))
    {
      System.out.print("*");
      j++;
    } // while문 변수 j 두번째
    System.out.println();
    i++;
   }  // while문 변수 i
   System.out.println("----------------");

    // 역피라미드 만들기
    for(i = 0; i < 5; i++) // i는 0부터 4까지 행으로 움직임
    {	
      for(j = 0; j < (9 - i); j++) // j는 0부터 최대 9까지 별을 채우고 최소로는 1개까지 채움
      {	
        System.out.print(j < i ? " " : "*"); // i가 j보다 크면 빈칸이 생기고 그 외에는 별로 채움 
      } // for문 변수 j
      System.out.println(); // 줄 바꿈
    }  // for문 변수 i
    System.out.println("----------------");

    i = 0;
    while(i < 5)
    {
      j = 0;
      while(j < (9 - i))
      {
        System.out.print(j < i ? " " : "*");
        j++;
      } // while문 변수 j
      System.out.println();
      i++;
    } // while문 변수 i
    System.out.println("----------------");


    // 다이아몬드 만들기
    for(i = 1; i < 10; i++)	
    {	
      for(j = 1; j < 10; j++) 
      { if(i <= 5)	                  // 1 ~ 5 행까지 빈칸 감소, 별 증가(1 ~ 9)
        {	if(5 - i < j && j < 5 + i)  // 별 채우기
          {	
            System.out.print("*");	
          }	
          else	                      // 빈칸 채우기
          { 
            System.out.print(" ");	
          } 
        }                             // if문
        else                          // 6 ~ 9행까지 빈칸 증가, 별 감소(7 ~ 1)
        {	
          if(i - 5 < j && j < 15 - i)	// 별 채우기
          {	
            System.out.print("*");	
          } 
          else	                      // 빈칸 채우기
          { 
            System.out.print(" ");	
          } 
        }                             // else  
      }                               // for문 변수 j 
      System.out.println();	
    }                                 // for문 변수 i
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
        } // 첫번째 if문                            
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
        } // 첫번째 else
        j++;           
      } // while문 변수 j
      System.out.println();
      i++;
    } // while문 변수 i
    System.out.println("----------------");



    // 구구단 옆으로 출력
    for(i = 1; i < 10; i++)  // i는 행을 나타냄. 1 ~ 9 까지
    {
		for(j = 1; j < 10; j++)  // j는 열을 나타냄 1 ~ 9 까지
		{
			System.out.print(j + "*" + i + "=" + (j * i) + "\t"); 
        // 구구단은 앞부분은 열로 한 자리씩 바뀌고 행은 다음줄이 되기 전까지 유지. \t 를 통해 간격을 넓혀 가독성을 높임
		} // for문 변수 j
      System.out.println(); // 9단 까지 나타내고 다음줄로 옮김
    } // for문 변수 i
    System.out.println("----------------");
    
    i = 1;
    while(i < 10)
    {
      j = 1;
      while(j < 10)
      {
        System.out.print(j + "*" + i + "=" + (j * i) + "\t");
        j++;
      } // while문 변수 j
      System.out.println();
      i++;
    } // while문 변수 i
    System.out.println("----------------");


    // 구구단 3단 출력
    for(i = 1; i < 10; i += 3)  // i는 1, 4, 7이 나타나도록 한다.
    {
      for(j = 1; j < 10; j++) // j는 열의 값(1 ~ 9), 구구단의 뒷자리를 나타내기 위함
      {
        for(k = i; k < i + 3; k++) // k는 i가 행으로만 쓰이도록 만든 것. 구구단의 앞자리를 나타내기 위함
        {
          System.out.print(k + "*" + j + "=" + (k * j) + "\t"); // 구구단을 나타냄
        } // for문 변수 k
        System.out.println(); // 줄 바꿈
      } // for문 변수 j
      System.out.println(); // 3단에서 4단, 6단에서 7단으로 갈 때 한 줄 띄도록 만듦
    } // for문 변수 i
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
        } // while문 변수 k
        System.out.println();
        j++;
      } // while문 변수 j
      System.out.println();
      i += 3;
    } // while문 변수 i 
    System.out.println("----------------");

  } // main

} // class