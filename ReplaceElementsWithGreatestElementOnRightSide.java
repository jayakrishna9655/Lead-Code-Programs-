package Programs;

class ReplaceElementsWithGreatestElementOnRightSideSolution {

    public int[] replaceElements(int[] arr) {
    	
    	int[] tem = new int[arr.length];
    	
//    	for(int i =0;i<arr.length;i++) {
//    		
//    		int max=0;
//    		
//    		for(int j=i+1;j<arr.length;j++) {
//    			
//    			if(arr[j]>max) {
//    				max=arr[j];
//    			}
//    			
//    		}
//    		
//    		if(i != arr.length-1) {
//    			tem[i]=max;
//    		}
//    		else {
//    			tem[i]=-1;
//    		}
//    		
//    	}
    	int max=-1;
    	for(int i = arr.length-1;i>=0;i--) {
    		
    		tem[i]=max;
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    		
    	}
    	
		return tem;
    }
	
}

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		
		ReplaceElementsWithGreatestElementOnRightSideSolution sol = new ReplaceElementsWithGreatestElementOnRightSideSolution();
		int[] data = {17,18,5,4,6,1};
		for(int i : sol.replaceElements(data)) {
			System.out.print(" "+i+" ");
		}
		
	}
	
}
