package kalculator;

import java.util.Scanner;

public class Class_With_Result {

	public static boolean boolword =false ,bool2 = false;
	public static String Number;
	
	public static void Search() 
	{
		Scanner oj = new Scanner(System.in);
		Number=oj.nextLine().replaceAll(" ", "").toLowerCase();
		//��������� ����� ����� �����
		RomeN.Swtch();
		
		if(boolword==false && bool2==false)
	     {
			int default_result = Result();
			System.out.println(default_result);
		 }
		else if(boolword==true && bool2==true) 
		 {
		    int rome_result = Result();
		    RomeN.ReshRome(rome_result);
	     }
		else 
		 {System.exit(0);System.out.println("�������e-��� ������� �������");}
	}
	
	private static void Exept(int a, int b)
	{
	   if((a<1 || a>10)||(b<1 || b>10)) 
	   {
	    System.out.println("�� ���� ����� ������ 10, ���� ������ 1, � ������ ��� ����������� -,-| ���� ����� �� ������� 0_o");
	    System.exit(0);
	   }
	}
	
	private static int Result()
	{
        int a, b, results = 0;
		  a=Integer.parseInt(RomeN.RomeNumb);
		  b=Integer.parseInt(RomeN.RomeNumb2);
      	   
		  Class_With_Result.Exept(a, b);
      	   //���������, ��������� �� ����� ���� ������������
      	  results = Resh_Operaion(a, b, results);
      	    //���������
      	    
		   return results;
	}
	
	private static int Resh_Operaion( int a, int b, int results) 
	{  
		if(RomeN.save.contains("+")) {return results=a+b;}
		if(RomeN.save.contains("-")) {return results=a-b;}
		if(RomeN.save.contains("/")) {return results=a/b;}
		if(RomeN.save.contains("*")) {return results=a*b;}
		 //ReshRome();
		System.exit(0); return 0;
	}
	
}