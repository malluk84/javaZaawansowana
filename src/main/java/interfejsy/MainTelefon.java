package interfejsy;

public class MainTelefon {

    public static void main(String[] args) {
        Telefon telefon = new Telefon("123");
        Dzwoni aparat = new Telefon("312");


        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwon("555");
        telefon.zadzwonNaNumerAlarmowy();
        System.out.println(telefon.getLacznyCzasRozmow());

    }
}
