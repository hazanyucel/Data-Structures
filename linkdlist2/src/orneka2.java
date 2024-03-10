
import java.util.Scanner;

class ogrenci {

    String ad, soyad, no;
    int veri;
    ogrenci next;
}

public class orneka2 {

    public static void main(String[] args) {
        ogrenci bir = new ogrenci();
        ogrenci yedek = bir;
        Scanner k = new Scanner(System.in);
        bir.next = null;
        bir.ad = k.next();
        bir.soyad = k.next();
        bir.no = k.next();
        bir.veri = k.nextInt();
        for (int i = 1; i < 5; i++) {
            bir.next = new ogrenci();
            bir.next.next = null;
            bir = bir.next;
            bir.ad = k.next();
            bir.soyad = k.next();
            bir.no = k.next();
            bir.veri = k.nextInt();
        }
        bir = yedek;
        while (bir.next != null) {
            System.out.println(bir.ad + bir.soyad + bir.no + bir.veri);
            bir = bir.next;
        }
        bir = yedek;
    }
}
