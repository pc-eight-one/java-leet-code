package dev.eightyone.coding.leetcode.solutions.lc1171;

import dev.eightyone.coding.leetcode.core.ProblemUrl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ProblemUrl(url = "https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list")
public class LC1171 {

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;

        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode node = result; node != null; node = node.next) {
            sum += node.val;
            map.put(sum, node);
        }

        sum = 0;
        for (ListNode node = result; node != null; node = node.next) {
            sum += node.val;
            node.next = map.get(sum).next;
        }

        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        public static ListNode fromArray(int... arr) {
            ListNode head = new ListNode(arr[0]);
            ListNode current = head;
            for (int i = 1; i < arr.length; i++) {
                current.next = new ListNode(arr[i]);
                current = current.next;
            }
            return head;
        }
    }
}
