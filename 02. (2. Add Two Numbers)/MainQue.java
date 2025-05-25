class ListNode {    //Node
    int data;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.data = val;
    }

    ListNode(int val, ListNode next) {
        this.data = val;
        this.next = next;
    }
}

public class MainQue {
    public static ListNode head;
    public static void main(String[] args) {
        ListNode l1 = buildList(new int[]{2, 4, 3});
        ListNode l2 = buildList(new int[]{5, 6, 4});

        print(l1);
        print(l2);
        System.out.println("---Ans---");
        Solution01 s1 = new Solution01();
        print(s1.addTwoNumbers(l1, l2));
    }

    public static ListNode buildList(int[] nums) {
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;

        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return newNode.next;
    }

    public static void print(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
