package InterviewQuestion;

public class ReverseLinked_List {


	    static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    public static void main(String[] args) {
	        // Create linked list: 1 -> 2 -> 3
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);

	        ListNode reversed = reverseList(head);

	        // Print reversed list
	        while (reversed != null) {
	            System.out.print(reversed.val + " ");
	            reversed = reversed.next;
	        }
	    }

	    public static ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode curr = head;

	        while (curr != null) {
	            ListNode next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }

	        return prev;
	    }
	}


