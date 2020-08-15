package kalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomeN extends Class_With_Result{

	public static String RomeNumb,RomeNumb2,save;
	
	public static void Swtch() 
	{
		 // Передаем значение
		RomeNumb=Class_With_Result.Number.replaceAll("[qazwsedcrftgbyhnujmik,op.]", "");
		  // Сохраняемся, прям как в Скайриме
		 save=RomeNumb;
		
	    ifa();
	    // Получаем римские цифрs
	    try
	    {
	      Integer.parseInt(RomeN.RomeNumb);
	      Integer.parseInt(RomeN.RomeNumb2);
	    }
	    catch(Exception ex)
	    {
	      RomeNumb = MenRome(RomeNumb);
		  RomeNumb2 = MenRome(RomeNumb2, 1);
		  //Преобразовываем в римские цифры
	    }
 }
			
   public static void ifa() 
	{
	  RomeNumb2 = RomeNumb;
	  if(RomeNumb.contains("+")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("+"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("+")+1, RomeNumb2.length());}
	  if(RomeNumb.contains("-")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("-"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("-")+1, RomeNumb2.length());}
	  if(RomeNumb.contains("/")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("/"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("/")+1, RomeNumb2.length());}
	  if(RomeNumb.contains("*")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("*"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("*")+1, RomeNumb2.length());}
	}
		
//.........................................................................................................................		
	public static String MenRome(String Start_Number) 
		{
		if(RomeNumb.equals("x")) {boolword=true; return Start_Number="10";}
        if(RomeNumb.equals("lx")) {boolword=true; return Start_Number="9";}
	    if(RomeNumb.equals("vlll")) {boolword=true; return Start_Number="8";}
		if(RomeNumb.equals("vll")) {boolword=true; return Start_Number="7";}
		if(RomeNumb.equals("vl")) {boolword=true; return Start_Number="6";}
		if(RomeNumb.equals("lv")) {boolword=true; return Start_Number="4";}
		if(RomeNumb.equals("lll")) {boolword=true; return Start_Number="3";}
		if(RomeNumb.equals("ll")) {boolword=true; return Start_Number="2";}
		if(RomeNumb.equals("v")) {boolword=true; return Start_Number="5";}
		if(RomeNumb.equals("l")) {boolword=true; return Start_Number="1";}
		 else
		  {
		    System.out.println("Вы ввели неккоректныое число");
   		    System.exit(0); 
   		    return Start_Number;
		  }
		}

	public static String MenRome(String Start_Number, int Refer) 
		{
		if(RomeNumb2.equals("x")) {bool2=true; return Start_Number="10";}
        if(RomeNumb2.equals("lx")) {bool2=true; return Start_Number="9";}
	    if(RomeNumb2.equals("vlll")) {bool2=true; return Start_Number="8";}
		if(RomeNumb2.equals("vll")) {bool2=true; return Start_Number="7";}
		if(RomeNumb2.equals("vl")) {bool2=true; return Start_Number="6";}
		if(RomeNumb2.equals("lv")) {bool2=true; return Start_Number="4";}
		if(RomeNumb2.equals("lll")) {bool2=true; return Start_Number="3";}
		if(RomeNumb2.equals("ll")) {bool2=true; return Start_Number="2";}
		if(RomeNumb2.equals("v")) {bool2=true; return Start_Number="5";}
		if(RomeNumb2.equals("l")) {bool2=true; return Start_Number="1";}
		else
		  {
		    System.out.println("Вы ввели неккоректныое число");
  		    System.exit(0); 
  		    return Start_Number;
		  }
		}
//..........................................................................................................................	
	
	public static void ReshRome(int results) {
	if(results==1) {System.out.println("l");}else {
		if(results==2) {System.out.println("ll");}else {
			if(results==3) {System.out.println("lll");}else {
				if(results==4) {System.out.println("lv");}else {
					if(results==5) {System.out.println("v");}else {
						if(results==6) {System.out.println("vl");}else {
							if(results==7) {System.out.println("vll");}else {
								if(results==8) {System.out.println("vlll");}else {
									if(results==9) {System.out.println("lx");}else {
										if(results==10) {System.out.println("x");}else {System.out.println(results);}}}}}}}}}}}
	  //Тут по времени не успел переделать в нормальный вид, и в нормальное решение, поэтому тут оставил все как было
}