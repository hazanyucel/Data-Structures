package veriyapılarıornek;

import java.util.Scanner;

/*
 * Tek yönlü dairesel listeye isminizin harflerini yazdıran kodu yazınız.
 * @author Hazan
 */
class Node {

    String data;
    Node next; //referans.

    public Node(String data) {
        this.data = data;
        next = null;
    }
}

public class VERİYAPILARIORNEK {
    Node head = null;
    Node tail = null;

    void liste(String data) {     
    Node yeni = new Node(data);
    if (head == null) {
        head = yeni;
        tail = yeni;
        tail.next = head;
    } else {
        tail.next = yeni;//head den değil kuyruktan ekleme yapmamız gerekiyor aksi takdirde sürekli baş tekraren güncellenmiş olucak ve yeni düğüm eklenemicek
        tail = yeni;
        tail.next = head;
    }
}

void yazdir() {
    if (head == null) {
        System.out.println("liste boş");
    } else {
        Node temp = head;
        do {
            System.out.print(temp.data);
            temp = temp.next;
        } while(temp != head);
    }
}
public static void main(String[] args) {
        VERİYAPILARIORNEK liste = new VERİYAPILARIORNEK();

        // 'hazan' isminin harflerini listeye ekleyin
        liste.liste("h");
        liste.liste("a");
        liste.liste("z");
        liste.liste("a");
        liste.liste("n");

        // Listeyi yazdır
        liste.yazdir();
        System.out.println(" ");
    }
    }

   

