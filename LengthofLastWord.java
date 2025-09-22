package Programs;

public class LengthofLastWord {

	
	public static void main(String []arg) {
		String myStr = "Split a string by spaces, and also punctuation.";
		String regex = "[,\\.\\s]";
		String[] myArray = myStr.split(regex);
//		for (String s : myArray) {
//		  System.out.println(s);
//		}
		int arr = myArray.length-1;
		
		 int len = myArray[arr].length();		
		 System.out.println(arr);
		 System.out.println(len);
	}
	
}
