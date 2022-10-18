package linkedlist;


class ListNode {

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

}

public class CreateAList {


    public static void main(String[] args) {

        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.val = 1;
        listNode2.val = 2;
        listNode3.val = 3;
        listNode1.next =listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
        printList(listNode1);
    }

    private static void printList(ListNode head){

        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}


