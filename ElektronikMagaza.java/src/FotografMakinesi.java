import java.util.Scanner;
public class FotografMakinesi extends  Urun {
    private int dijitalZoom;
    private int optikZoom;



    public int getDijitalZoom() {
        return dijitalZoom;
    }

    public void setDijitalZoom(int dijitalZoom) {
        this.dijitalZoom = dijitalZoom;
    }

    public int getOptikZoom() {
        return optikZoom;
    }

    public void setOptikZoom(int optikZoom) {
        this.optikZoom = optikZoom;
    }

    public Object urunGir(Object urun){
        Scanner keya = new Scanner(System.in);

        System.out.print("      Marka giriniz: ");
        String marka = keya.nextLine();
        setMarka(marka);
        System.out.print("      Dijital Zoom giriniz: ");
        int dijitalZoom = keya.nextInt();
        setDijitalZoom(dijitalZoom);
        System.out.print("      Optik Zoom giriniz: ");
        int optikZoom = keya.nextInt();
        setOptikZoom(optikZoom);
        System.out.print("      Fiyat giriniz: ");
        int fiyat = keya.nextInt();
        setFiyat(fiyat);
        System.out.print("      Adet giriniz: ");
        int adet = keya.nextInt();
        setAdet(adet);

        return urun;
    }

    public void urunSorgula(Object urun){
        System.out.println("---------------------------"+ "\n" +
                           "Marka : " + getMarka() + "\n" +
                           "Dijital zoom : " + getDijitalZoom()+ "\n" +
                           "Optik zoom  : " + getOptikZoom()+ "\n" +
                           "Fiyat : " + getFiyat()+ "\n" +
                           "Adet : " + getAdet());

    }


}