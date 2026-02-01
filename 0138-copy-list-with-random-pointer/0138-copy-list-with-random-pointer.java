/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node temp = head;
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }

        temp = head;
        while (temp != null) {
            Node node = temp.next;
            if (temp.random != null) {
                node.random = temp.random.next;
            } else {
                node.random = null;
            }
            temp = node.next;
        }

        temp = head;
        Node dummyNode = head.next;
        while (temp != null) {
            Node node = temp.next;
            temp.next = node.next;

            if (node.next != null) {
                node.next = node.next.next;
            }

            temp = temp.next;
        }

        return dummyNode;
    }
}
