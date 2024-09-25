package JaveFirstDay;
import InterviewPreperation.StaticTest.division;

public class FirstProgram {

	public static void main(String[] args) {
		//I'm working on feature merge
    System.out.print("Hi Rukshara, Mohit");
    System.out.print(" And Prem");
    System.out.println("\nI'm seeking job right now\n");
    System.out.println("Need to be more strict in planning");   
    System.out.println("Need high focus to recollect everything and memorize for interview");
    
    //division dv = new division();
    //dv.divisiontest();
    division.divisiontest();
    String s1 ="Check";
    String s2 ="Check";
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    if(s1==s2)
    {
    	System.out.println("Equal true");
    }
    String s3 = new String("Learn");
    String s4 = new String("Learn");
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());
    if(s3==s4)
    {
    	System.out.println("Equal true");
    }
   
	}

}
