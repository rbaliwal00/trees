package BinaryTree;

//Building a Binary Tree
public class BuildBT {
    static int index = -1;

    // builds a tree from given array nums
    public static Node buildBT(int[] nums) {
        index++;
        if (nums[index] == -1) {
            return null;
        }
        Node newNode = new Node(nums[index]);
        newNode.left = buildBT(nums);
        newNode.right = buildBT(nums);
        return newNode;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 7, -1, -1 };

        Node root = buildBT(nums);

        System.out.println(root.data);
    }
}