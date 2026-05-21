package Programs;

class node_to_addNum {
    int data;
    node_to_addNum next;

    public node_to_addNum(int data) {
        this.data = data;
    }
}

class AddTwoNumbers_solution {

    public void addIt(int[] arr1, int[] arr2) {

        int num1 = 0;
        int num2 = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            num1 = num1 * 10 + arr1[i];
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            num2 = num2 * 10 + arr2[i]; // FIXED
        }

        int tol = num1 + num2;

        String str = String.valueOf(tol);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
    }

    public node_to_addNum addLists(node_to_addNum l1, node_to_addNum l2) {

        node_to_addNum dummy = new node_to_addNum(0);
        node_to_addNum current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new node_to_addNum(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}

public class AddTwoNumbers {

    public static void main(String[] args) {

        AddTwoNumbers_solution obj = new AddTwoNumbers_solution();

        // 🔹 Array test
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        obj.addIt(arr1, arr2);

        // 🔹 Linked list test

        // Create first list: 2 → 4 → 3
        node_to_addNum l1 = new node_to_addNum(2);
        l1.next = new node_to_addNum(4);
        l1.next.next = new node_to_addNum(3);

        // Create second list: 5 → 6 → 4
        node_to_addNum l2 = new node_to_addNum(5);
        l2.next = new node_to_addNum(6);
        l2.next.next = new node_to_addNum(4);

        // Call method
        node_to_addNum result = obj.addLists(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}