package veriyapılarıornek;

class dugum {
    int data;
    dugum next;
    public dugum(int data) {
        this.data = data;
        next = null;
    }
}

public class StackYigin {
    int size;
    int sayac;
    dugum top; //en üstü tutan head olarak düşünebilirsin.
    public StackYigin(int size){
        this.size=size;
        sayac=0;
        top=null;
    }
  void push(int data){
      dugum eleman=new dugum(data);
      if (isFull()) {
          System.out.println("stack dolu,ekleme yapılamadı");
      }
      else{
          if (isEmpty()) {
              top=eleman;
              System.out.println(top.data +" stack'e eklendi");
          }
          else{
              eleman.next=top;
              top=eleman;
              System.out.println(top.data+" stack'e eklendi");
          }
          sayac++;
      }
  }
  void pop(){
      if (isEmpty()) {
          System.out.println(" stack boş");
      }
      else{
          System.out.println(top.data+" çıkartıldı");
          top=top.next;
          sayac--;
      }
  }
  void print(){
      if (isEmpty()) {
          System.out.println("stack bos");
      }
      else{
          dugum temp=top;
          System.out.println("stack'deki veriler");
          while(temp!=null){
              System.out.println(temp.data);
              temp=temp.next;
      }
          System.out.println(" ");
      }
  }
  void topgoster(){
      if (isEmpty()) 
          System.out.println("bos");
      else
          System.out.println("en üstteki düğümün datası: "+top.data);
      
      
  }
  boolean isFull(){
      return sayac==size;
  }
 /*Bu metod, yığının dolu olup olmadığını kontrol eder. Yığın, belirli bir kapasiteyle (size) oluşturulur.
 isFull metodu, yığının bu kapasiteye ulaşıp ulaşmadığını kontrol eder. Bu kontrol, sayac değişkeninin size ile 
 karşılaştırılmasıyla yapılır. Eğer sayac (yani yığındaki eleman sayısı) size'a eşitse,
 bu yığının dolu olduğu anlamına gelir ve isFull metodu true döndürür. Aksi halde false döndürür.*/
  boolean isEmpty(){
      return sayac==0;
 /*Bu metod, yığının boş olup olmadığını kontrol eder. Yığın, dugum nesneleriyle temsil edilen verileri saklar. Yığının boş olması durumu, 
 yığında hiçbir elemanın olmaması anlamına gelir. Bu durum, sayac değişkeninin 0 olmasıyla kontrol edilir.
 sayac, yığına eklenen eleman sayısını tutar. Eğer sayac 0 ise, bu yığının boş olduğu anlamına gelir ve isEmpty metodu true döndürür. Aksi halde false döndürür.*/
  }
    public static void main(String[] args) {
        StackYigin stack=new StackYigin(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        stack.pop();
        stack.print();
        stack.topgoster();
    } 
}
