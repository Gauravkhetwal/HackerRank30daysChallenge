package hackerrank;
import java.util.*;
import java.lang.Math;
class Calculator{
	int result;
	
    int power(int n,int p)throws Exception
	  {
    	if(n<0 || p<0)
    		throw  new Exception("n and p should be non-negative");
    	result = (int)Math.pow(n, p);
    	
    	return result;
	  }
    

}
	public class MoreException {

	    public static void main(String[] args) {
	    
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t-- > 0) {
	        
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try {
	                int ans = myCalculator.power(n, p);
	                System.out.println(ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	    }
	}
