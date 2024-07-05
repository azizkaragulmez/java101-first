public class MysqlDataBase extends AbstracteDataBase{
    @Override
     void update() {
        System.out.println("Mysql güncellendi..");
    }

    @Override
     void get() {
        System.out.println("Mysql getirildi");
    }
}
//add ve delete hepsinde ortak olduğu için diğer ata sınıfta tanımlı.
//diğer update ve get parametrelerine olmazsa olmaz gibi düşünerek hepsine şart oyduk ama hangi sınıftan extends etmekte önemli
//(Sen mantığını anladın gerisi önemsiz)
