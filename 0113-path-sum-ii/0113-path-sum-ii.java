/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> cpath=new ArrayList<>();
        helper(root,targetSum,list,cpath);
        return list;
    }
    public void helper(TreeNode node, int target,List<List<Integer>> list,List<Integer> cpath) {
        if(node==null)return;
        cpath.add(node.val);
        target-=node.val;
        if(node.left==null&&node.right==null&&target==0)list.add(new ArrayList<>(cpath));
        else{
            helper(node.left,target,list,cpath);
            helper(node.right,target,list,cpath);
        }
        cpath.remove(cpath.size()-1);
    }
}