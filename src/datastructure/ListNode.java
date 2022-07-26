package datastructure;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        listNode.next = listNode1;
        listNode.val = 5;
        listNode1.val = 7;
        listNode1.next = listNode2;
        listNode2.next = null;
        listNode2.val = 10;
        Solution solution = new Solution();
        solution.addTwoNumbers(listNode, listNode);
    }

}

    class Solution {
        public void addTwoNumbers(ListNode l1, ListNode l2) {

            int size1 = 0;
            int size2 = 0;
            ListNode listNode1 = l1;
            ListNode listNode2 = l2;
            ListNode sumNode = new ListNode();
            sumNode.val = 0;
            sumNode.next = null;
            while (listNode1.next != null) {
                System.out.println(listNode1.val);
                listNode1 = listNode1.next;
                size1++;
            }
            while (listNode2.next != null) {
                System.out.println(listNode2.val);
                listNode2 = listNode2.next  ;
                size2++;
            }
            int greater_size = 0;
            if (size1 > size2) {

               greater_size = size1;
            }else{

                greater_size = size2;
            }

            while(greater_size!=0){

                sumNode.val = sumNode.val +  listNode1.val + listNode2.val;
                listNode1 = listNode1.next.next;
                sumNode.next = new ListNode();
                int carry = sumNode.val%10;
                if(carry > 0){
                    sumNode.next.val = carry;
                }

            }
            System.out.println(size1);
            System.out.println(size2);
        }
    }