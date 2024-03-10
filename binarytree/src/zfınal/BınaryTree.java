package zfınal;

/*
 * @author Hazan
 */
public class BınaryTree {

    Node root;

    public BınaryTree() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        System.out.println(" ");
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                System.out.println(data + " kökün soluna eklendi");
                root.left = insert(root.left, data);

            } else {
                System.out.println(data + " kökün sağına eklendi");
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }
}
