// 陥製引 旭戚 窒径
// 沿けけ 28室 18.7 舛雌
// 沿けけ 21室 55.1 搾幻
// 沿けけ 28室 18.7 舛雌
// 沿けけ 28室 18.7 舛雌
// 沿けけ 28室	 18.7 舛雌

import java.util.Scanner;
public class Membertest2 
{
	// 5誤税 噺据舛左研 眼聖 壕伸 持失
	Member ar[] = new Member[5]; // 呉獄 梓端 5鯵税 爽社研 眼聖 呪 赤惟 廃陥. 焼送 梓端 持失精 照喫 new虞壱 掬醤 益凶 紫遂 亜管
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Membertest2 m = new Membertest2(); // 薄仙 適掘什 梓端研 幻窮陥.
		m.test(); // 五社球 叔楳喫 -> // main精 static生稽 梓端 蒸戚 叔楳鞠澗汽 test()澗 static戚 焼艦嬢辞 梓端亜 赤嬢醤 叔楳戚 鞠糠稽 照吉陥 static五辞球澗 static戚 焼観 五辞球研 硲窒 公敗
		m.input(); // 鋼差庚生稽 5誤 舛左研 減澗陥.
		m.output();	// 窒径 五社球研 搭背 薄仙 ar壕伸税 噺据 舛左研 窒径馬澗 依
	} //main()

	public void test()
	{
		System.out.println("五社球 叔楳喫");
	} //test()
	
	// 徹左球稽 噺据舛左 脊径閤焼 壕伸拭 煽舌
	public void input()
	{
		for(int i = 0; i < ar.length; i++)
		{
			/*
			ar[0] = new Member();	// Member 梓端研 幻級嬢 0腰 爽社拭 隔澗陥.	
			ar[0].setName("zaaa"); // 壕伸税 0腰 号拭 走榎 null葵戚 級嬢赤陥. 梓端亜 蒸陥. 梓端 持失 照喫.焼巷依亀 亜軒徹走 省澗陥. nullpointerexception戚陥.  ar[0] = new Member(); 背操醤 廃陥.
			*/

			ar[i] = new Member();	// Member 梓端研 幻級嬢 i腰 爽社拭 隔澗陥.
			System.out.print("戚硯 : ");
			ar[i].getName(scan.next());	// 脊径 閤精 依聖 setName()五社球研 硲窒背 葵聖 左浬陥.
			System.out.print("持鰍杉析(YYMMDD) : ");
			ar[i].setBirth(scan.next()); // 脊径 閤精 依聖 setBirth()五社球研 硲窒背 葵聖 左浬陥.
			System.out.print("徹 : ");
			ar[i].setHeight(scan.nextDouble()); // 脊径 閤精 依聖 setHeight()五社球研 硲窒背 葵聖 左浬陥.
			System.out.print("倖巷惟 : ");
			ar[i].setWeight(scan.nextDouble()); // 脊径 閤精 依聖 setWeight()五社球研 硲窒背 葵聖 左浬陥.
			System.out.print("迫衝莫 : ");
			ar[i].setType(scan.next()); // 脊径 閤精 依聖 setType()五社球研 硲窒背 葵聖 左浬陥.
			System.out.println();
		}
	} //input()

	// 壕伸稽 乞窮 噺据舛左 窒径
	public void output()
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "室\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
	} //output()
} //class

/*

五社球 叔楳喫
戚硯 : a
持鰍杉析(YYMMDD) : 900101
徹 : 167
倖巷惟 : 68
迫衝莫 : o

戚硯 : b
持鰍杉析(YYMMDD) : 890202
徹 : 176
倖巷惟 : 89
迫衝莫 : a

戚硯 : c
持鰍杉析(YYMMDD) : 950303
徹 : 162
倖巷惟 : 47
迫衝莫 : b

戚硯 : d
持鰍杉析(YYMMDD) : 970404
徹 : 178
倖巷惟 : 70
迫衝莫 : o

戚硯 : e
持鰍杉析(YYMMDD) : 930505
徹 : 180
倖巷惟 : 89
迫衝莫 : a

a       29室    24.0    引端掻  O
b       30室    29.0    搾幻    A
c       24室    18.0    煽端掻  B
d       22室    22.0    舛雌端掻        O
e       26室    27.0    搾幻    A

*/