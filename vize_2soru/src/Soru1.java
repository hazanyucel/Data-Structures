 
import java.util.Scanner;

/*
 * 40 elemanlı bir dairesel çift yönlü liste üzerinde 
 * a)bu listedeki en uzun karaktere sahip olan elemanı
 * b) en kısa karaktere sahip olan elemanı bulunuz.
 * c) en uzun ve en kısa karakterlerin yerlerini değiştiren kodu yazınız.(içerik değiştirmesi)
 * @author Hazan
 */
class Node {

    String icerik;
    Node next;
    Node back;

    public Node(String icerik) {
        this.icerik = icerik;
        next = null;
        back = null;
    }
}

public class Soru1 {

    Node head = null;
    Node tail = null;
    String icerik;
    Scanner k = new Scanner(System.in);

    public void daireselliste() {
        System.out.print("icerik giriniz: ");
        icerik = k.next();
        Node yeni = new Node(icerik);
        if (head == null) {
            head = yeni;
            tail = yeni;
            head.next = tail;
            tail.back = head;
            head.back = tail;
            tail.next = head; 
        } else {
            yeni.next = head;
            head.back = yeni;
            head = yeni;
            tail.next = head;
            head.back = tail;

        }

    }

    public void yazdir() {
        Node temp = head;
        while (temp != tail) {
            System.out.print(temp.icerik + " ");
            temp = temp.next;

        }
        System.out.print(tail.icerik);
    }

    public void maxminchar() {
        if (head == null) {
            return;
        }
        Node enuzun = head;
        Node enkısa = head;
        Node temp = head;
        do {
            if (temp.icerik.length() > enuzun.icerik.length()) {
                enuzun = temp;
            }
            if (temp.icerik.length() < enkısa.icerik.length()) {
                enkısa = temp;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("");
        System.out.println(" en uzun içerik: " + enuzun.icerik);
        System.out.println(" en kısa içerik: " + enkısa.icerik);
        String yedek = enuzun.icerik;
        enuzun.icerik = enkısa.icerik;
        enkısa.icerik = yedek;
        System.out.println("en uzun ve en kısa içeriklerin yerleri değiştirildi.. ");
    }
//    void yazdir1() {
//        
//    if (head != null) {
//        Node temp = head;
//        do {
//            System.out.println(temp.icerik);
//            temp = temp.next;
//        } while (temp != head); // Listenin başına dönünce döngüyü sonlandır
//    }
//}

    public static void main(String[] args) {
        Soru1 liste = new Soru1();
        for (int i = 0; i < 5; i++) {
            liste.daireselliste();

        }
        liste.yazdir();
        liste.maxminchar();
        liste.yazdir();

    }
}
