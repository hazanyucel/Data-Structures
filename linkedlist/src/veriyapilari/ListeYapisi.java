package veriyapilari;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    void ekle(int x) {
        Node eleman = new Node();//eklenecek eleman
        eleman.data = x; //ekledik
        eleman.next = null;//sonraki basamağı null yaptık
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk obje eklendi");
        } else {
            tail.next = eleman; //listenin sonuna yeni düğüm eklendi
            tail = eleman; //son eleman güncellendi
            System.out.println("Listenin sonuna yeni bir eleman eklendi");
        }
    }

    void bastansil() {
        if (head == null) {
            System.out.println("liste bos");

        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede tek bir eleman vardı.Silindi");

        } else {
            head = head.next;
            System.out.println("bastaki eleman silindi");
        }
    }

    void sondansil() {
        if (head == null) {
            System.out.println("liste bos");

        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede tek bir eleman vardı.Silindi");

        } else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("sondan eleman silindi");
        }
    }
    
    void aradansil(int indis){
        if (head == null) {
            System.out.println("liste bos");

        } else if (head.next == null&& indis==0) {
            head = null;
            tail = null;
            System.out.println("Listede tek bir eleman vardı.Silindi");

        } else if(head.next!=null&& indis==0){
            head=head.next;
            System.out.println("bastaki eleman silindi");
        }else{
        int i=0;
        Node temp=head;
        Node temp2=head;
        while(temp!=null){
        i++;
        temp2=temp;
        temp=temp.next;
        
    }
        if (i==indis) {
            temp2.next=null;
            tail=temp2;
            System.out.println("sondaki eleman silindi");
        }
        else{
            temp=head;
            temp2=head;
            int j=0;
            while(j!=indis){
                temp2=temp;
                temp=temp.next;
                j++;
                
            }
            temp2.next=temp.next;
            System.out.println("aradaki nesne silindi");
        }
    }
    }
    void yazdir() {
        if (head == null) {
            System.out.println("liste yapisi bos");
        } else {
            Node temp = head;
            System.out.print(" baş-> ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print("<-son");
        }
    }

    public static void main(String[] args) {
        ListeYapisi liste = new ListeYapisi();
        liste.ekle(11);
        liste.ekle(12);
        liste.ekle(13);
        liste.yazdir();
        System.out.println("");
//        liste.bastansil();
//        liste.bastansil();
//        liste.bastansil();
//        liste.bastansil();
        liste.aradansil(2);
        liste.yazdir();
    }
}
