package kalculator;

public class ArifmDo extends Take1_Number
{
	
   public void Reshen(int First, int Second) 
   {
	  if(Number.contains("+")) {System.out.println(First=First+Second);}
	  if(Number.contains("-")) {System.out.println(First=First-Second);}
	  if(Number.contains("/")) {System.out.println(First=First/Second);}
	  if(Number.contains("*")) {System.out.println(First=First*Second);}
   }
}
