package Programs;

public class CheckStringIsAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="madam";
      String tem ="";
      for(int i =0;i<str.length();i++) {
    	   tem=str.charAt(i)+tem;
    	  
    	  
      }
      System.out.println(tem   +" jk "+str);
      if(str.equals(tem)) {
    	  System.out.println("yes");
      }
      else {
    	  System.out.println("no");
      }
      
      
	}

}
