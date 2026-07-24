package Programs;

class TwoFurthestHousesWithDifferentColorsSolution{
	
	public int maxDistance(int[] colors) {
		
		int left=0;
		int max=0;
		
		for(int i=colors.length-1 ;i>=0;i--) {
			
			if(colors[i] != colors[left]) {
				int tem = i-left;
				if(max < tem) {
					max=tem;
				}
				//break;
			}
			
		}
		int right = colors.length - 1;
		for (int i = 0; i < colors.length; i++) {
	        if (colors[i] != colors[right]) {
	        	int tem = right - i;
	        	if(max < tem) {
					max=tem;
				}
	           // break;
	        }
	    }
		
	     return max;  
	} 	
	
}

public class TwoFurthestHousesWithDifferentColors {

	public static void main(String[] args) {
		
		int[] colors= {6,6,6,6,6,6,6,6,6,19,19,6,6};
		
		TwoFurthestHousesWithDifferentColorsSolution sol = new TwoFurthestHousesWithDifferentColorsSolution();
		
		System.out.println(sol.maxDistance(colors));
		
	}
	
}
