package kalculator;

import java.util.Scanner;

public class Class_With_Result {

	public static boolean boolword =false ,bool2 = false;
	public static String Number;
	
	public static void Search() 
	{
		Scanner oj = new Scanner(System.in);
		Number=oj.nextLine().replaceAll(" ", "").toLowerCase();
		//Проверяем какие числа ввели
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
		 {System.exit(0);System.out.println("Бездельe-это игрушка дъявола");}
	}
	
	private static void Exept(int a, int b)
	{
	   if((a<1 || a>10)||(b<1 || b>10)) 
	   {
	    System.out.println("Ты ввел число больше 10, либо меньше 1, а поцаны так непоступают -,-| хотя вдруг ты девушка 0_o");
	    System.exit(0);
	   }
	}
	
	private static int Result()
	{
        int a, b, results = 0;
		  a=Integer.parseInt(RomeN.RomeNumb);
		  b=Integer.parseInt(RomeN.RomeNumb2);
      	   
		  Class_With_Result.Exept(a, b);
      	   //Проверяем, небольшое ли число ввел пользователь
      	  results = Resh_Operaion(a, b, results);
      	    //Результат
      	    
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