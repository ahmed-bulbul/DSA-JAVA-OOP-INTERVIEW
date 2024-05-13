package leetcode.linkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Convert array to LinkedList of ListNode objects
        ListNode head = arrayToLinkedList(array);

        // Print the LinkedList
        System.out.println("Main LinkedList Data :: ");
        printLinkedList(head);

        //reverse
        ReverseLinkedList206 rev = new ReverseLinkedList206();
        ListNode revHead = rev.reverseList(head);
        System.out.println("Reversed data :: ");
        printLinkedList(revHead);

        System.out.println("Cycle detection:: ");
        System.out.println(LinkedListCycle141.hasCycle(head));
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static ListNode arrayToLinkedList(int[] array) {
        ListNode dummy = new ListNode(); 
        ListNode current = dummy;

        for (int val : array) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next; 
    }
}
