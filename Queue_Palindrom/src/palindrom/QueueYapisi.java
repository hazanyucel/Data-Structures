/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

/**
 *
 * @author Hazan
 */
public class QueueYapisi {

    Node front; //head
    Node rear; //tail
    int cnt; //sayaç
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;

    }

    void enQueue(char ch) {
        if (!isFull()) {
            Node eleman = new Node(ch);
            if (isEmpty()) {
                front = eleman;
                rear = eleman;
            } else {
                rear.next = eleman;
                rear = eleman;
            }
            cnt++;
        }
    }

    char deQueue() {
        if (!isEmpty()) {
            char ch=front.harf;
            front=front.next;
            cnt--;
            return ch;
        }
        else{
           return '+';
        }

    }

    private boolean isFull() {
        return cnt == size;

    }

    private boolean isEmpty() {
        return cnt == 0;
    }
}
