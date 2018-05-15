/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author dichha
 */
public class PathSum {
    private static class TreeNode{
        TreeNode left; 
        TreeNode right; 
        int val; 
        public TreeNode(int val){
            this.val = val; 
        }
    }
    public static boolean hasPathSum(TreeNode root, int sum){
        if (root == null)
            return false; 
        if (root.right == null && root.left == null && root.val == sum)
            return true; 
        return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum-root.val));
    }
    /*
    public static void main(String[] args){
        TreeNode root = new TreeNode(5); 
        TreeNode left = new TreeNode(4); 
        TreeNode right = new TreeNode(8); 
        root.left = left; 
        root.right = right; 
        TreeNode ll = new TreeNode(11); 
        TreeNode rl = new TreeNode(13); 
        TreeNode rr = new TreeNode(4); 
        root.right.right = rr; 
        root.left.left = ll; 
        root.right.left = rl; 
        TreeNode lll = new TreeNode(7); 
        root.left.left.left = lll;
        TreeNode llr = new TreeNode(2); 
        root.left.left.right = llr; 
        TreeNode rrr = new TreeNode(1); 
        root.right.right.right = rrr; 
        boolean ans = hasPathSum(root, 22);
        System.out.println(ans);
        
        
    } 
    */
}
