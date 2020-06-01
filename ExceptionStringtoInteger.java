package hackerrank;
import java.util.*;
public class ExceptionStringtoInteger {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();

	        in.close();
	        try{
	        	System.out.println(Integer.parseInt(s));
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Bad String");
	        	
	        }   
	}	    
}
