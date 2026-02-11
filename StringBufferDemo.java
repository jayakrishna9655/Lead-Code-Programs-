package Programs;

 class program {
	 
	String data(String d) {
		
StringBuffer str=new StringBuffer(d);
		
		str.append(" hi jai");
		
		str.delete(1, 3);
		
		str.indexOf("j");
		System.out.println(str.indexOf("j"));
		System.out.println(str);
		
		return null;
		
	}
}

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="jai";
		program pro = new program();
		pro.data(str);
	}

}
