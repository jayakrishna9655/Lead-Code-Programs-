package basic_programs;

class OneToTenPrintWithoutLoopSolution{
	
	public int solution(int n) {
		
		if(n==10) {
			return n;
		}
		else {
			return loop(n);
		}
		
		
	}
	
    public int loop(int n) {
    	n++;
    	System.out.println(n);
		return solution(n);
	}
	
}

public class OneToTenPrintWithoutLoop {

	public static void main(String[] args) {
		
		OneToTenPrintWithoutLoopSolution sol=new OneToTenPrintWithoutLoopSolution();
		
		sol.solution(8);
		
	}
	
}
