import java.util.Scanner;
public class CepTelefonu extends  Urun{

    private int ekranYenilemeHizi;
    private int bellekKapasitesi;
    private int kameraCozunurluk;



    public int getEkranYenilemeHizi(){
        return ekranYenilemeHizi;
    }
    public void setEkranYenilemeHizi(int ekranYenilemeHizi){
        this.ekranYenilemeHizi = ekranYenilemeHizi;
    }
    public int getBellekKapasitesi(){
        return bellekKapasitesi;
    }
    public void setBellekKapasitesi(int bellekKapasitesi){
        this.bellekKapasitesi = bellekKapasitesi;
    }
    public int getKameraCozunurluk(){
        return kameraCozunurluk;
    }
    public void setKameraCozunurluk(int kameraCozunurluk){
        this.kameraCozunurluk = kameraCozunurluk;
    }

    public  Object urunGir(Object urun){
        Scanner keyx = new Scanner(System.in);
        System.out.print("      Marka giriniz: ");
        String marka = keyx.nextLine();
        setMarka(marka);
        System.out.print("      Ekran yenileme hızı giriniz (Hz): ");
        int ekranYenilemeHizi = keyx.nextInt();
        setEkranYenilemeHizi(ekranYenilemeHizi);
        System.out.print("      Bellek kapasitesi giriniz (GB): ");
        int bellekKapasitesi = keyx.nextInt();
        setBellekKapasitesi(bellekKapasitesi);
        System.out.print("      Kamera çözünürlüğü giriniz (MP): ");
        int kameraCozunurluk = keyx.nextInt();
        setKameraCozunurluk(kameraCozunurluk);
        System.out.print("      Fiyat giriniz (TL): ");
        int fiyat = keyx.nextInt();
        setFiyat(fiyat);
        System.out.print("      Adet gririniz: ");
        int adet = keyx.nextInt();
        setAdet(adet);

        return urun;
    }

    public void urunSorgula(Object urun){
        System.out.println("---------------------------"+ "\n" +
                           "Marka : " + getMarka() + " \n"+
                           "Ekran yenileme hızı : " + getEkranYenilemeHizi() + " \n"+
                           "Bellek kapasitesi : " + getBellekKapasitesi() + " \n"+
                           "Kamera çözünürlüğü : " + getKameraCozunurluk() + " \n"+
                           "Fiyat : " + getFiyat() + " \n"+
                           "Adet : " + getAdet());


    }
}
