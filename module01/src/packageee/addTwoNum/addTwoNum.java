package packageee.addTwoNum;

public class addTwoNum {
	public static void main(String[] args) {


	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}
		int value = l1.val+l2.val;

		ListNode result = new ListNode(value%10);
		result.next = addTwoNumbers(l1.next,l2.next);
		if (value>=10){
			result.next = addTwoNumbers(result.next,new ListNode(1));
		}
		return result;
	}


}

