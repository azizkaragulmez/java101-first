public class MongoDataBase extends AbstracteDataBase{
    @Override
    void get() {
        System.out.println("Mongo getirildi...");
    }

    @Override
    void update() {
        System.out.println("Mongo güncellendi...");
    }
}
