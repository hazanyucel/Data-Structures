/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapılarıornek;

/**
 *
 * @author Hazan
 */
class node {

    int data;
    node next;

    public node(int data) {
        this.data = data;
        next = null;
    }
}

public class KuyrukYapisi {

    node front; //head
    node rear; //tail
    int cnt; //sayaç
    int size;

    public KuyrukYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;

    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("kuyruk dolu");
        } else {

            node eleman = new node(data);
            if (isEmpty()) {
                System.out.println(data+" eklenecek");
                front = eleman;
                rear = eleman;
                System.out.println(data + " kuyruğa eklenen ilk eleman oldu");
            } else {
                System.out.println(data+" eklenecek");
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " eklendi");
            }
            cnt++; 
        }
    }
    void deQueue(){
        if (isEmpty()) {
            System.out.println("kuyruk boş");
        }
        else{
            System.out.println(""+front.data+" çıkartıldı");
            front=front.next;
            cnt--;
        }
    }

    private boolean isFull() {
        return cnt == size;

    }

    private boolean isEmpty() {
        return cnt == 0;
    }
    void print(){
        if (isEmpty()) {
            System.out.print("kuyruk boş");
        } else{
            node temp=front;
            System.out.print("baş ");
            while(temp!=null){
                System.out.print("-"+temp.data +"-");
                temp=temp.next;
            }
            System.out.println("  son");
        }
    }
    public static void main(String[] args) {
        KuyrukYapisi kuyruk=new KuyrukYapisi(5);
        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        kuyruk.enQueue(60);
        kuyruk.print();
        kuyruk.deQueue();
        kuyruk.print();
    }
}
