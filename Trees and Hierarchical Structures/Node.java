import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    void inorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result);
        result.add(node.data);
        inorder(node.right, result);
    }

    void preorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.data);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    void postorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.data);
    }

    List<Integer> levelOrder(Node node) {
        List<Integer> result = new ArrayList<>();

        if (node == null) {
            return result;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            result.add(current.data);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

   
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(7);

        tree.root.right.left = new Node(12);

        List<Integer> inorderResult = new ArrayList<>();
        List<Integer> preorderResult = new ArrayList<>();
        List<Integer> postorderResult = new ArrayList<>();

        tree.inorder(tree.root, inorderResult);
        tree.preorder(tree.root, preorderResult);
        tree.postorder(tree.root, postorderResult);

        System.out.println("Inorder: " + inorderResult);
        System.out.println("Preorder: " + preorderResult);
        System.out.println("Postorder: " + postorderResult);
        System.out.println("Level Order: " + tree.levelOrder(tree.root));
    }
}
