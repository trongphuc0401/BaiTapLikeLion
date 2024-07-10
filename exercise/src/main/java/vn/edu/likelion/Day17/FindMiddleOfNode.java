package vn.edu.likelion.Day17;

/**
 * FindMiddleOfNode -
 *
 * @param
 * @return
 * @throws
 */
public class FindMiddleOfNode {


    //   1 2 3 4
    //  1
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode current = head ;
        int length = 0;
        while(current.next != null) {
            length++;
            if (length%2 ==0) {
                middle = middle.next;
            }
            current = current.next;
        }

            if (length % 2 ==1 ) {
                middle = middle.next;
            }
        return middle;
    }
}
