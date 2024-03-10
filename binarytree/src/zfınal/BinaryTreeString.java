package zfınal;

/*
 * @author Hazan
 */
public class BinaryTreeString {

    Node root;

    public BinaryTreeString() {
        root = null;
    }

    Node newNode(String isim) {
        root = new Node(isim);
        System.out.println(" ");
        return root;

    }

    Node insert(Node root, String isim) {
        if (root == null) {
            return newNode(isim);
        }

        if (isLessThan(isim, root.isim)) {
            System.out.println(isim+" kökün soluna eklendi");
            root.left = insert(root.left, isim);
        } else {
            System.out.println(isim+" kökün sağına eklendi");
            root.right = insert(root.right, isim);
        }

        return root;
    }

    boolean isLessThan(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return true;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return false;
            }
        }

        return len1 < len2;
    }
}
