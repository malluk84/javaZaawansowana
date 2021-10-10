package interfejsy;

public interface Spiewajacy {


    static int jakasmetoda() {
        return 0;
    }

    void spiewaj();

    int zwrocWiek();

    double obliczCos();

    default void nowaMetoda(int a, int b) {
        System.out.println(a + b);
    }

}
