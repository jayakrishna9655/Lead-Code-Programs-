package Programs;

import java.util.LinkedList;
import java.util.Queue;

class SolutionSameTreeByBFS {
    public boolean isSameTree(TreeNode p, TreeNode q) {

    	Queue<TreeNode> queueP = new LinkedList<TreeNode>();
    	Queue<TreeNode> queueQ = new LinkedList<TreeNode>();
    	
    	queueP.add(p);
    	queueQ.add(q);
    	
    	while(!queueP.isEmpty() && !queueQ.isEmpty()) {
    		
    		TreeNode treeP = queueP.poll();
    		TreeNode treeQ = queueQ.poll();
    		
    		if(treeP ==null && treeQ ==null) {
    			continue;
    		}
    		
    		if(treeP ==null || treeQ ==null) {
    			return false;
    		}
    		
    		if(treeP.val != treeQ.val) {
    			return false;
			}
    		 
			queueP.add(treeP.left);
			queueQ.add(treeQ.left);
			
			queueP.add(treeP.right);
			queueQ.add(treeQ.right);
    	}
    	return true;
    }
}

public class SameTreeByBFS {

	public static void main(String[] args) {
		
		SolutionSameTreeByBFS tree = new SolutionSameTreeByBFS();
		
		TreeNode node11= new TreeNode(1);
		TreeNode node12= new TreeNode(2);
		TreeNode node13= new TreeNode(3);
		
		node11.left = node12;
		node11.right = node13;
		
		TreeNode node21= new TreeNode(1);
		TreeNode node22= new TreeNode(2);
		TreeNode node23= new TreeNode(3);
		
		node21.left=node22;
		node21.right=node23;
		
		System.out.println(tree.isSameTree(node11, node21));
	}
	
}
