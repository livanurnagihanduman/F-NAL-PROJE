import java.util.Scanner;
public  class DemoUrun {
    private static  int girilenUrunSayisi;
    private  Urun[] urunListesi;

    public int getGirilenUrunSayisi() {
        return girilenUrunSayisi;
    }

    public static void baslikYazdir() {
        System.out.println("*********************************************\n" +
                "***STOK ÜRÜN GİRİŞ VE SORGULAMA PROGRAMI***\n" +
                "**********************************************");
    }

    public static void menuYazdir() {
        System.out.println("MENÜ:\n" +
                "(1) Ürün gir\n" +
                "(2) Ürün sorgula\n" +
                "(3) Ürün listesi sıfırla\n" +
                "(4) Programı sonlandır;");
    }

    public static void menuUrunSec() {
        System.out.println("----------------\n" +
                           "        Ürün giriş\n" +
                           "        (1) Cep Telefonu\n" +
                           "        (2) Fotoğraf Makinesi");
    }

    public void urunListesiSifirla() {
        girilenUrunSayisi = 0;
    }

    public static void main(String[] args) {

        CepTelefonu cepTelefonu = new CepTelefonu();
        FotografMakinesi fotografMakinesi = new FotografMakinesi();

        Scanner key = new Scanner(System.in);


        int secim = 0;
        int stok;
        boolean karar = true;

        baslikYazdir();

        System.out.print("Stoka girilecek ürün sayisi: ");
        stok = key.nextInt();



        Urun[] urunListesi = new Urun[stok];


        while (karar) {

            menuYazdir();
            System.out.print("İşlem seçiniz:");
            secim = key.nextInt();

            switch (secim) {
                case 1:
                    menuUrunSec();
                    System.out.println("        Ürün seçiniz:");
                    secim = key.nextInt();

                    if (secim == 1) {
                        cepTelefonu.urunGir(cepTelefonu);
                    }
                    else if (secim == 2){
                        fotografMakinesi.urunGir(fotografMakinesi);
                    }
                    else{
                        System.out.println("Maksimum ürün sayısı :  " + stok );
                        System.out.println("Girilen ürün sayisi : " + girilenUrunSayisi);
                        System.out.println("Yeni ürün girilemez!");
                    }
                    break;
                case 2:
                    menuUrunSec();
                    System.out.println("        Ürün seçiniz:");
                    secim = key.nextInt();

                    if(secim == 1){

                        cepTelefonu.urunSorgula(cepTelefonu);
                    }
                    else if(secim == 2){

                        fotografMakinesi.urunSorgula(fotografMakinesi);
                    }
                    else{
                        System.out.println("Ürün listesinde fotoğraf makinesi bulunamadı!");
                    }
                    break;

                case 3:
                  for(int x = 0; x < urunListesi.length; x++){
                      urunListesi[x] = null;
                  }
                  girilenUrunSayisi = 0;
                    break;

                default:
                    System.out.println("Program sonlandırıldı!");
                    System.exit(0);













            }


        }


    }


}



