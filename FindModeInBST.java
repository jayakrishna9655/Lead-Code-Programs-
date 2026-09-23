package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
}
class SolutionFindModeInBST {
    public int[] findMode(TreeNode root) {
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	defaultfun(root,map);
    	
    	int maxfr=0;
    	
    	for(int key : map.keySet()) {
    		maxfr = Math.max(maxfr, map.get(key));
    	}
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int key : map.keySet()) {
    		if(maxfr == map.get(key)) {
    			list.add(key);
    		}
    	}
    	
    	int[] arr = new int[list.size()];
    	
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=list.get(i);
    		System.out.println(arr[i]);
    	}
    	
		return arr;
    }

	private void defaultfun(TreeNode root, HashMap<Integer, Integer> map) {
		
		if(root == null) {
			return;
		}
		
		map.put(root.val, map.getOrDefault(root.val, 0)+1);
		
		defaultfun(root.left,map);
		defaultfun(root.right,map);
		
		
	}
    
}
public class FindModeInBST {
	public static void main(String[] args) {
		TreeNode node1= new TreeNode(1);
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(2);
		node2.left = node1;
		node2.right = node3;
		
//		System.out.println(node2.val);
//		System.out.println(node2.left.val);
//		System.out.println(node2.right.val);
		SolutionFindModeInBST tree = new SolutionFindModeInBST();
		tree.findMode(node2);
	}
}
