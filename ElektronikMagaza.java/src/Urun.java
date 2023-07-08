//OgrenciNo = o220706003
//OgrenciAd = Livanur Nagihan
//OgrenciSoyad = Duman


public abstract class Urun {
    private String tur;
    private String marka;
    private double fiyat;
    private int adet;

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public abstract Object urunGir(Object urun);

    public abstract void  urunSorgula(Object urun);


}