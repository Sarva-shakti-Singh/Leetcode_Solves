/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head)
     {
        ListNode node=head;
        List<Integer>list=new ArrayList<>();
        while(node!=null)
        {
            list.add(node.val);
            node=node.next;
        }
        Collections.sort(list);
        ListNode start=null;
        ListNode end=null;
        for(int i:list)
        {
            ListNode n=new ListNode(i);
            if(start==null)
        {
            start=n;
            end=n;
        }
        else
        {
            end.next=n;
            end=n;
        }
        }
        return start;
    }
}