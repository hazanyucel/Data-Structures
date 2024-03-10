
import java.util.Scanner;

/*
 20 elemanlı stack yapısı oluşturarak stackdeki elemanları listeleyip,yığıttan çıkaran kodu metot kullanarak yapınız.
 */
public class Soru2 {

    private static class Node {

        int icerik;
        Node next;

        public Node(int icerik) {
            this.icerik = icerik;
            next = null;
        }
    }
    Scanner k = new Scanner(System.in);
    Node top;
    int cnt, size, icerik;

    public Soru2(int size) {
        this.size = size;
        cnt = 0;
        top = null;

    }

    void push() { // ekleme
        System.out.print("icerik giriniz ");
        icerik = k.nextInt();
        Node eleman = new Node(icerik);
        if (isFull()) {
        } else {
            if (isEmpty()) {
                top = eleman;

            } else {
                eleman.next = top;
                top = eleman;
            }
            cnt++;
        }
    }

    void pop() {
        if (isEmpty()) {
        } else {
            top = top.next;
            cnt--;
        }
    }

    private boolean isFull() {
        return cnt == size;
    }

    private boolean isEmpty() {
        return cnt == 0;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("dugum bos");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(" " + temp.icerik + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Soru2 liste = new Soru2(20);
        for (int i = 0; i < 20; i++) {
            liste.push();
        }
        liste.print();
        System.out.println("");
        liste.pop();
        System.out.println("");
        liste.print();

    }

}
