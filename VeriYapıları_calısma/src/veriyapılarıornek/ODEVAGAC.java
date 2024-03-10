/*
 *rastgele girilen 10 ile 100 arasındaki sayıları (toplam 10 adet) kendi oluşturacağınız ağaca yerleştiriniz.
 *daha sonra bu ağaç üzerinde preorder inorder postorder gezinme yöntemleriyle sayı dizilerini veriniz.
 */
package veriyapılarıornek;

import java.util.Random;
import java.util.Scanner;

class Node1 {

    int data;
    Node1 left;
    Node1 right;

    public Node1(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class ODEVAGAC {

    Node1 kok;

    public ODEVAGAC() {
        kok = null;
    }

    void agacekle(Node1 yeni) {
        Node1 y = null;
        Node1 x = kok;
        while (x != null) {
            y = x;
            if (yeni.data < x.data) {
                System.out.println(yeni.data + "," + x.data + " soluna eklendi");
                x = x.left;
            } else {
                System.out.println(yeni.data + "," + x.data + " sağına eklendi");
                x = x.right;
            }
        }
        if (y == null) {
            kok = yeni;
        } else if (yeni.data < y.data) {
            y.left = yeni;
        } else {
            y.right = yeni;
        }

    }

    void preorder(Node1 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void inorder(Node1 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void postorder(Node1 node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        ODEVAGAC a = new ODEVAGAC();
        int rastgeleTamSayi = r.nextInt((100 - 10) + 1) + 10;
        System.out.println(rastgeleTamSayi);
        Node1 d = new Node1(rastgeleTamSayi);
        a.agacekle(d);
        System.out.println("Ağacın kökü: " + a.kok.data);
        for (int i = 0; i < 9; i++) {
            int rastgeleTamSayi2 = r.nextInt((100 - 10) + 1) + 10;
            Node1 d2 = new Node1(rastgeleTamSayi2);
            a.agacekle(d2);
            System.out.println(" ");

        }
        System.out.println("Ağaç oluşturuldu, arama yöntemi seçiniz: ");
        System.out.println("1- PreOrder");
        System.out.println("2- InOrder");
        System.out.println("3- PostOrder");
        int secilensayi = k.nextInt();

        switch (secilensayi) {
            case 1:
                a.preorder(d);
                break;
            case 2:
                a.inorder(d);
                break;
            case 3:
                a.postorder(d);
                break;

        }
    }

}
