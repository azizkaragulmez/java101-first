public abstract class AbstracteDataBase {

    public void add(){
        System.out.println("Eklendi..");
    }
    public void delete(){
        System.out.println("Silindi...");
    }
    abstract void update();   //abstractlı olanlar diğer sınıflarda olması zorunlu olduğu için
    abstract void get();
    //Abstract kalıtımda UML diagramında ayrıştırmak için kullandığımız classların. bir atama olmaması gerekiği için
    //abstract kullanır yani soyutlama yapar. Burda kod düzenini ve okunurluğunu sağlamış oluruz.
}
