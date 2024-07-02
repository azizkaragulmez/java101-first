public class Kitap {
    public int sayfaSayisi;
    public String kitapAdi,yazar;

    Kitap(String kitapAdi,String yazar, int sayfaSayisi)
    {
        this.kitapAdi=kitapAdi;
        this.yazar=yazar;
        if(sayfaSayisi<1)
        {
            this.sayfaSayisi=10;
        }
        else
        {
            this.sayfaSayisi=sayfaSayisi;
        }
    }

    public void print()
    {
        System.out.println("kitap adı="+this.kitapAdi );
        System.out.println("yazar="+this.yazar );
        System.out.println("sayfa sayısı="+this.sayfaSayisi );


    }
}
