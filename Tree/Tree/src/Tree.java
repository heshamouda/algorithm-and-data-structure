public class Tree {

    private TreeNode root;

    public void insert(int vlaue) {
        if (root == null) {
            root = new TreeNode(vlaue);
        } else {
            root.insert(vlaue);
        }
    }

}
