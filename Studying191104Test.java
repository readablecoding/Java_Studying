public class Studying191104Test 
{
	public static void main(String[] args) 
	{
		Studying191104 s = new Studying191104();
		Studying191104 s2 = new Studying191104("È«±æµ¿");
		Studying191104 s3 = new Studying191104(100, 90, 80);
		Studying191104 s4 = new Studying191104("±èÃ¶¼ö", 95, 95, 95);

		s.setKor(90);
		s.setEng(95);
		s.setMat(92);
		int t = s.getTotal();
		//System.out.println(t); // 277
		double d = s.getAvg(); 
		//System.out.println(d); // 92.0
		String g = s.getGrade();
		//System.out.println(g); // ¼ö






	}
}
