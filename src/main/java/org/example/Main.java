package org.example;

public class Main {
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    private TreeNode CreateBST(int[] nums, int l, int r) {
        if (l > r) return null;

        int mid = l + (r - l) / 2;

        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = CreateBST(nums, l, mid - 1);
        treeNode.right = CreateBST(nums, mid + 1, r);

        return treeNode;
    }
}