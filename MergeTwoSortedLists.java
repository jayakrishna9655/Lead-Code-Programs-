package Programs;

public class MergeTwoSortedLists {

    static class SolutionMergeTwoSortedLists {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while(list1 !=null && list2 !=null) {
            	if(list1.val < list2.val) {
            		current.next=list1;
            		list1=list1.next;
            	}
            	else {
            		current.next=list2;
            		list2=list2.next;
            	}
            	current = current.next;
            }
            if(list1 !=null) {
        		current.next=list1;
        		list1=list1.next;
        	}
        	else {
        		current.next=list2;
        		list2=list2.next;
        	}
            current = current.next;
            return dummy;
        }
    }

    // Helper method to create list from array
    public static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        SolutionMergeTwoSortedLists solution = new SolutionMergeTwoSortedLists();

        ListNode result = solution.mergeTwoLists(list1, list2);

        printList(result);
    }
}