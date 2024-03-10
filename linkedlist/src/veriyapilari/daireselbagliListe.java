/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilari;

/**
 *
 * ÇİFT YÖNLÜ DAİRESEL BAĞLI LİSTE
 */
class Eleman2 {

    Eleman2 ileri, geri;
    int icerik;

    Eleman2(int icerik) {
        this.icerik = icerik;
        ileri = null;
        geri = null;
    }
}

public class daireselbagliListe {

    Eleman2 bas;

    public daireselbagliListe() {
        bas = null;
    }

    void ekle(Eleman2 yeni) {
        if (bas == null) {
            bas = yeni;
            bas.ileri = yeni;
            bas.geri = yeni;
        } else {
            yeni.ileri = bas;
            yeni.geri = bas.geri;
            bas.geri.ileri = yeni;
            bas.geri = yeni;
        }
    }

    void sil() {
        if (bas.ileri == null) {
            bas = null;
        } else {
            bas.geri.ileri = bas.ileri;
            bas.ileri.geri = bas.geri;
            bas = bas.ileri;
        }
    }

    void yazdir() {
        Eleman2 tmp = bas;
        do {
            System.out.println(tmp.icerik);
            tmp = tmp.ileri;
        } while (tmp != bas);
    }

    public static void main(String[] args) {
        daireselbagliListe liste = new daireselbagliListe();
        Eleman2 yeni = new Eleman2(1);
        liste.ekle(yeni);
        yeni = new Eleman2(2);
        liste.ekle(yeni);
        yeni = new Eleman2(3);
        liste.ekle(yeni);
        yeni = new Eleman2(4);
        liste.ekle(yeni);
        yeni = new Eleman2(5);
        liste.ekle(yeni);
        liste.yazdir();
        liste.sil();
        liste.yazdir();
    }
}
