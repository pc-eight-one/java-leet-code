package dev.eightyone.coding.leetcode.solutions.lc2;


import dev.eightyone.coding.leetcode.core.ProblemUrl;

@ProblemUrl(url = "https://leetcode.com/problems/add-two-numbers/")
public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode current = resultNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return resultNode.next;
    }
}
