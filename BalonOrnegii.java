
package com.mycompany.balonornegii;

//konsol veya dosyadan girdi okumak için gerekli kütüphane importu
import java.util.Scanner ;

public class BalonOrnegii {

    public static void balonPozisyonuBul(int m, int n) {
        NodeClass baslangıcNoktası= null;
        NodeClass sonDügüm = null;
    
    /*
    for döngüsü 0'dan n-1'e kadar olan sayılar için bir Node oluşturacak ve 
    bunları dairesel bağlı listeye ekleyecek. Bu döngüde Node sınıfından bir 
    yeniDügüm nesnesi oluşturulur ve Node'un data alanına i+1 degeri atanır.
    Bu nesnenin başka bir düğüme bağlanalabilmesi için bağ sahaları ayarlamış
    olur.
    */
     for (int i = 1; i <= n; i++) {
            NodeClass yeniDügüm = new NodeClass(i);
            if (baslangıcNoktası == null) {
                baslangıcNoktası = yeniDügüm;
                 sonDügüm = yeniDügüm;
            } else {
                sonDügüm .sonrakiDügüm = yeniDügüm;
                sonDügüm  = yeniDügüm;
            }
        }
        sonDügüm.sonrakiDügüm = baslangıcNoktası;

        NodeClass gezici= baslangıcNoktası;
        NodeClass öncekiDügüm = null;
        int count = 0;

    
    /*
    Dairesel bağlı listede son kalan balonu bulmak için while döngüsünden 
    faydaldık.Gezici düğüm bir sonraki düğüme(sonrakiDügüm) eşit olmadığı sürece
    döngü devam edecek.Her çalıştığında for döngüsünü de başlatacak ve m-1 kadar 
    geziciyi bir sonraki düğüme taşıyacak. Daha sonra gezici silinecek ve bir 
    sonraki düğüm gezici olarak atanacak.Bu işlem tek bir balon kalan kadar 
    devam edecek.
    */
   
   while (gezici.sonrakiDügüm!= gezici) {
            count++;
            if (count == m) {
                öncekiDügüm.sonrakiDügüm= gezici.sonrakiDügüm;
                count = 0;
            } else {
                öncekiDügüm = gezici;
            }
            gezici = gezici.sonrakiDügüm;
        }
    
  //Son kalan balonun pozisyonunu ekrana yazdıralım
  System.out.println("Son kalan balonun pozisyonu: " + gezici.data);
    }
    
    
    //Main metot içinde kullanıcının n ve m degerlerini girmesini isteyelim
   public static void main(String[] args) {
        Scanner degerler= new Scanner(System.in);

        System.out.print("N değerini giriniz: ");
        int n = degerler.nextInt();

        System.out.print("M değerini giriniz: ");
        int m = degerler.nextInt();
    
        //bu değerler ile balonPozisyonuBul metodunu çağırıyoruz
        balonPozisyonuBul(m, n);
    }
}

