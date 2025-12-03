package Programs;

public class BinaryTreeTraversals_DFS_Inorder_Preorder_Postorder {
    
    // 1. Node Class Definition
	static class Node {
		int data;
		Node right, left;
	    
        // Constructor
        Node(int data) {
	    	this.data = data;
            this.right = null; // Good practice to explicitly set to null
            this.left = null;  // Good practice to explicitly set to null
	    }
	}
	
    // 2. Insertion Method (Recursive for a BST)
    // This method returns the updated root of the subtree
    public static Node insert(Node root, int val) {
        // Base case: If the current node is null, we create a new node here
        if (root == null) {
            return new Node(val);
        }

        // Recursive step: Decide to go left or right 
        if (root.data > val) {
            // Go Left: Assign the result of the recursive call to root.left
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            // Go Right: Assign the result of the recursive call to root.right
            root.right = insert(root.right, val);
        }
        
        // Return the unchanged root node (since it was already there)
        return root;
    }
    
    // --- Traversal Methods ---

    // 3. Inorder Traversal (L-N-R)
    // Used for printing elements in a sorted order in a BST
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);       // 1. Left (L)
        System.out.print(root.data + " "); // 2. Node (N)
        inorder(root.right);      // 3. Right (R)
    }

    // 4. Preorder Traversal (N-L-R)
    // Used for making a copy of the tree
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // 1. Node (N)
        preorder(root.left);      // 2. Left (L)
        preorder(root.right);     // 3. Right (R)
        System.out.println( "left"+root.left + " ");
        System.out.println("right"+root.right + " ");
    }
    public static void preorder_trace(Node root) {
        if (root == null) {
            // This is where the recursion stops
            System.out.println("-> Base Case: Reached null.");
            return;
        }

        // 1. Visit (N)
        System.out.println("\n*** Entering Node: " + root.data + " (N)");

        // Print the data of the children (or "null" if they don't exist)
        String leftData = (root.left != null) ? String.valueOf(root.left.data) : "null";
        String rightData = (root.right != null) ? String.valueOf(root.right.data) : "null";
        System.out.println("   [Children: Left=" + leftData + ", Right=" + rightData + "]");
        
        // The actual traversal output (the printed value)
        System.out.print("   -> Output: " + root.data + " "); 

        // 2. Go Left (L)
        System.out.println("\n   -> Stepping Left from " + root.data + "...");
        preorder_trace(root.left);
        
        // 3. Go Right (R)
        System.out.println("   -> Stepping Right from " + root.data + "...");
        preorder_trace(root.right);

        System.out.println("--- Exiting Node: " + root.data + " ---");
    }

    // 5. Postorder Traversal (L-R-N)
    // Used for deleting the tree (deleting children before the parent)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);     // 1. Left (L)
        postorder(root.right);    // 2. Right (R)
        System.out.print(root.data + " "); // 3. Node (N)
    }

    // 6. Main Method to Test
	public static void main(String[] args) {
		
        // Start with the initial root node
		Node root = new Node(50);
		
		// Note: The insert method returns the (potentially new) root of the entire tree.
        // For a BST, the first call to insert() will always return the original root (50) 
        // unless you pass a null root initially.
        // It's safer to reassign or check the result, but since 'root' is not null, 
        // we use the return value to update the tree structure:
        
        insert(root, 30); // 30 goes left of 50
		insert(root, 40); // 40 goes right of 30 (which is left of 50)
		insert(root, 10); // 10 goes left of 30
		insert(root, 70); // Added a node to the right side (70 > 50)
        insert(root, 60); // 60 goes left of 70
        
        /* * The resulting tree structure looks like this:
         * * 50 (Root)
         * /  \
         * 30    70
         * /  \  /
         * 10  40 60
         * * 
        */
        
        System.out.println("--- Traversal Results ---");

		System.out.print("Preorder Traversal (NLR): ");
		preorder_trace(root); // Expected: 50 30 10 40 70 60 
        System.out.println();
        
        System.out.print("Inorder Traversal (LNR):  ");
       // inorder(root); // Expected (Sorted): 10 30 40 50 60 70 
        System.out.println();
        
        System.out.print("Postorder Traversal (LRN):");
       // postorder(root); // Expected: 10 40 30 60 70 50 
        System.out.println();
	}
}