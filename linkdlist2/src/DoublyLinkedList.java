
public class DoublyLinkedList {

    private Node head;
    private Node tail;

    private class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Listeye başa eleman ekleme
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { //listede eleman yoksa.
            head = tail = newNode;
            System.out.println("listenin ilk elemanı oluşturuldu");
        } else {
            newNode.next = head; //yeni eleman başa geldi
            head.prev = newNode;
            head = newNode; //baş = yeni eleman
        }
    }

    // Listeye sona eleman ekleme
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Belirli bir konuma eleman ekleme
    public void addAtPosition(int position, int data) {
        if (position <= 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int index = 0;

        while (current != null && index < position) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addLast(data);
        } else {
            newNode.prev = current.prev;
            newNode.next = current;
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                head = newNode;
            }
            current.prev = newNode;
        }
    }

    // Listeden eleman silme
    public void remove(int data) {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == data) {//current.data == data ifadesi, current düğümünün veri alanının (data), aranan değerle (data) eşit olup olmadığını kontrol eder. 
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    // Liste elemanlarını yazdırma
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addAtPosition(1, 15); // 10, 15, 20
        list.addFirst(5);
        list.addLast(25);

        System.out.println("Liste elemanları:");
        list.printList(); // 5, 10, 15, 20, 25

        list.remove(15);
        System.out.println("15 silindikten sonra liste elemanları:");
        list.printList(); // 5, 10, 20, 25
    }
}
