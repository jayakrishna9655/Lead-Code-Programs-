package Programs;

class TreeNodes {
     int val;
     TreeNodes left;
     TreeNodes right;
      TreeNodes() {}
      TreeNodes(int val) { this.val = val; }
      TreeNodes(int val, TreeNodes left, TreeNodes right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
class SameTreeSolution {
    public boolean isSameTree(TreeNodes p, TreeNodes q) {
    	  // case 1: both null
        if (p == null && q == null) {
            return true;
        }
        
        // case 2: one is null
        if (p == null || q == null) {
            return false;
        }
        
        // case 3: value mismatch
        if (p.val != q.val) {
            return false;
        }
       
		return isSameTree(p.left, q.left) && 
				isSameTree(p.right, q.right);
    }
}
public class SameTree {

	public static void main(String[] args) {
		  // Tree 1
        TreeNodes t1 = new TreeNodes(1);
        t1.left = new TreeNodes(2);
        t1.right = new TreeNodes(3);

        TreeNodes t2 = new TreeNodes(1);
        t2.left = new TreeNodes(2);
        t2.right = new TreeNodes(3);

        TreeNodes t3 = new TreeNodes(1);
        t3.left = new TreeNodes(2);

        SameTreeSolution sol = new SameTreeSolution();

        System.out.println("Tree1 vs Tree2: " + sol.isSameTree(t1, t2)); 
        System.out.println("Tree1 vs Tree3: " + sol.isSameTree(t1, t3)); 
		
	}
	
}
