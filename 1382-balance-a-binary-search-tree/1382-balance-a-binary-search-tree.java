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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>inorder = new ArrayList<Integer>();
        getInorder(root,inorder);
        return getBalanceBst(root, inorder, 0, inorder.size()-1);
    }
    public TreeNode getInorder(TreeNode root, ArrayList<Integer>inorder){
        if(root == null){
        return null;
        }
        getInorder(root.left,inorder);
        inorder.add(root.val);// adding nodes in Arraylist;
        getInorder(root.right, inorder);
         return root;
       }
    
      public TreeNode getBalanceBst(TreeNode root,ArrayList<Integer>inorder,int low,int high){
        if(low<=high){
          int mid = (low+high)/2;
          TreeNode newroot = new TreeNode (inorder.get(mid));
          newroot.left = getBalanceBst(root,inorder,low,mid-1);
          newroot.right = getBalanceBst(root,inorder,mid+1,high);
          return newroot;
       }
        return null;
    }
}