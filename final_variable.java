package basic_programs;

class cals{
public int cal(int n1 ,int n2) {
		
		return n1+n2;
	}
}

public class final_variable {
	
	public static void main(String[] args) {

		int num=18;
		int num1=10;
	    cals obj =new cals();
		obj.cal(num, num1);
		int tol=obj.cal(num, num1);
		System.out.println(tol);
	}

}
