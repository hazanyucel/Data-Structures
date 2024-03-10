
import java.util.Scanner;

class Ogrenci {
    String ad, soyad, no;
    int veri;
    Ogrenci next;
}

public class Listeler_1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Ogrenci bas = new Ogrenci(); // Listenin başını tutacak öğrenci
        Ogrenci yedek = bas; // Listenin başını kaybetmemek için yedek referans

        // İlk öğrencinin bilgilerini al
        bas.ad = k.next();
        bas.soyad = k.nextLine();
        bas.no = k.next();
        bas.veri = k.nextInt();
        bas.next = null; // İlk öğrencinin sonraki değeri null, çünkü liste henüz tek elemanlı

        // Diğer öğrenciler için bilgileri al ve listeye ekle
        for (int i = 1; i < 5; i++) {
            Ogrenci yeni = new Ogrenci(); // Yeni öğrenci oluştur
            yeni.ad = k.next();
            yeni.soyad = k.nextLine();
            yeni.no = k.next();
            yeni.veri = k.nextInt();
            bas.next = yeni; // Mevcut son öğrencinin sonrasına yeni öğrenciyi ekle
            bas = yeni; // Mevcut son öğrenciyi güncelle 
        }
        
        goruntule(yedek); // Listenin başından itibaren öğrencileri görüntüle

        k.close(); // Scanner nesnesini kapat
    }

    public static void goruntule(Ogrenci bir) {
        while (bir != null) {
            System.out.println(bir.ad + " " + bir.soyad + " " + bir.no + " " + bir.veri);
            bir = bir.next; // Sonraki öğrenciye geç
        }
    }
}
