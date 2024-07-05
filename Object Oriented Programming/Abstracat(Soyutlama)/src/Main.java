public class Main {
    public static void main(String[] args)
    {
       // AbstracteDataBase abstracteDataBase=new abstracteDateBase();  //görüldüğü gibi eklenemiyor abstract sınıf soyutlandı doğrudan erişim yok.

          AbstracteDataBase abstracteDataBase=new MysqlDataBase();
          AbstracteDataBase abstracteDataBase2=new MongoDataBase();

          //İkisininde aynı çıkması ikisinde de add ortak ata sınıfta
          abstracteDataBase.add();
          abstracteDataBase2.add();
          abstracteDataBase.delete();
          abstracteDataBase2.delete();

          //Ata sınıfta abstract yapılmış ve kendi özelliği eklenmiş
          abstracteDataBase.update();
          abstracteDataBase2.update();
          abstracteDataBase.get();
          abstracteDataBase2.get();


    }
}