public class Kitap {
    private int sayfaSayisi;
    private String kitapAdi,yazar;

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


    public int getSayfaSayisi() {   //depişkenimizde ulaşmamızı sağlıyor.
        return this.sayfaSayisi;
    }

    public void  setSayfaSayisi( int sayfaSayisi){
        if(sayfaSayisi<1)
        {
            this.sayfaSayisi=333;
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
//getSayfaSayisi ında çağırmaya ulaşmaya yarıyor biz eğer this.sayfaSayisi derken ifleri kullanmazsak getSayfaSayisi
//dediğimizde direk eksili bir şekilde gelicek. - bir değer girdiğinde hata verecek bir şekildede yapabiliriz işlemimizi.