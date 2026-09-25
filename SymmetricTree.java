package Programs;

class SolutionisSymmetric {
    public boolean isSymmetric(TreeNode root) {
    	boolean isMirror = false;
    	if(root !=null) {
    		isMirror = isSymmetric1(root.left ,root.right);
    	}
    	
    	return isMirror;
    	
    }

    public boolean isSymmetric1(TreeNode rootLeft,TreeNode rootRight) {
    	
    	if(rootLeft ==null && rootRight == null) {
			return true;
		}
    	
    	if(rootLeft ==null || rootRight == null) {
			return false;
		}
		
		if(rootLeft.val != rootRight.val) {
			return false;
		}
		
		
		boolean isMirror= isSymmetric1( rootLeft.left, rootRight.right) && isSymmetric1( rootLeft.right, rootRight.left);
		
		return isMirror;
			
    }
    

public class SymmetricTree {

	public static void main(String[] args) {
		
		TreeNode node1= new TreeNode(1);
		
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(2);
		
		TreeNode node4= new TreeNode(4);
		TreeNode node5= new TreeNode(4);
		
		TreeNode node6= new TreeNode(4);
		TreeNode node7= new TreeNode(4);
		
		//node1=node1;
		
		node1.left = node2;
		node1.right = node3;
		
		node1.left.left=node4;
		node1.left.right=node5;
		
		node1.right.left=node6;
		node1.right.right=node7;
		
		SolutionisSymmetric tree = new SolutionisSymmetric();
		System.out.println(tree.isSymmetric(node1));
	}
	
}
