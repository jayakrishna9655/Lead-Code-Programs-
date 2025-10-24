package Programs;

public class FindTheLongestWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hi jai";
		
		String arr[]= str.split(" ");
		
		String lon = "";

		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		    if(arr[i].length() > lon.length()) {
		    	lon= arr[i];
		    }
		}
		 System.out.println(lon);

		
	}

}
