package Programs;

//public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class SolutionisSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	
    	if(p ==null && q == null) {
    		return true;
    	}
    	
    	if(p ==null || q == null) {
    		return false;
    	}
    	
    	if(p.val != q.val) {
    		return false;
    	}
    		boolean left= isSameTree(p.left,q.left);
    		boolean right= isSameTree(p.right,q.right);
    	
    	
    	return left && right;
    }
}

public class SameTreeDFS {
	
	public static void main(String[] args) {
		
		SolutionisSameTree tree = new SolutionisSameTree();
		
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
