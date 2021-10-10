package interfejsy.comparables;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableClass porownywalny1 = new ComparableClass(10);
        ComparableClass porownywalny2 = new ComparableClass(100);
        ComparableClass porownywalny3 = new ComparableClass(1);

        ComparableClass[] porownywalne = new ComparableClass[]{porownywalny1, porownywalny2, porownywalny3};

        NotComparable nieporownywalny1 = new NotComparable(10);
        NotComparable nieporownywalny2 = new NotComparable(100);
        NotComparable nieporownywalny3 = new NotComparable(1);


        NotComparable[] nieporownywalne = new NotComparable[]{nieporownywalny1, nieporownywalny2, nieporownywalny3};

        Arrays.sort(porownywalne);
        Arrays.sort(nieporownywalne);
    }
}
