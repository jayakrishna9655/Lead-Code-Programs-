package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="jaia";
		String str2="jiaa";
		int len1=str1.length();
		int len2=str2.length();
		String rem="";
		String ret="";
		int lenr=0;
		if(len1 != len2) {
			 System.out.println("No, Not Anagrams");
			return;
		}
		else {
			
char arr[]=str1.toCharArray();
char arr1[]=str2.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr1);
if(Arrays.equals(arr, arr1)) {
	 System.out.println("yes Anagrams");
}
else {
	 System.out.println("No, Not Anagrams");
}
	
}
			}
			}
			
		
	


