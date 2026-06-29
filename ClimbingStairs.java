package Programs;

class SolutionClimbStairs {
    public int climbStairs(int n) {
    	
    	if (n == 1) return 1;
        if (n == 2) return 2;
    		//2
    		//11
    		//2
    		//-----
    		//3
    		//12
    		//111
    		//21
    		int prev1=1;
    		int prev2=2;
    		for(int i =3;i<=n;i++) {
    			int current = prev1+prev2;
    			prev1=prev2;
    			prev2 =current;
    			
    		}
    		return prev2;
    		
    	
    	
    }
    }


public class ClimbingStairs {

	public static void main(String[] args) {
		
		SolutionClimbStairs sol = new SolutionClimbStairs();
		System.out.println(sol.climbStairs(5));
		
	}
	
}
