package basic_programs;

public class StaticCallFunctions {

	static int age;
	static String name;
	static class   call{
		static int age() {
			age=22;
			return age ;
		}
		String name(String j) {
			name="jai";
			return name;
			
		}
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call obj = new call();
        System.out.println(call.age());
        
        System.out.println(obj.name("jai"));
	}

}
