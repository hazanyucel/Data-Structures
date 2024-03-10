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
public class StackYapisi {

    int size;
    int sayac;
    Node top; //en üstü tutan head olarak düşünebilirsin.

    public StackYapisi(int size) {
        this.size = size;
        sayac = 0;
        top = null;
    }

    void push(char ch) {

        if (!isFull()) {
            Node eleman = new Node(ch);
            if (isEmpty()) {
                top = eleman;
            } else {
                eleman.next = top;
                top = eleman;
            }
            sayac++;
        }

    }

    char pop() {
        if (!isEmpty()) {
            char harf = top.harf;
            top = top.next;
            sayac--;
            return harf;
        } else {
            return '-';
        }

    }

    boolean isFull() {
        return sayac == size;
    }

    boolean isEmpty() {
        return sayac == 0;
    }
}
