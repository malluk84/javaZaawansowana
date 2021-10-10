package generyczne;

public class Garage<T> {

    private T one;
    private T two;

    public Garage(T one, T two) {
        this.one = one;
        this.two = two;
    }

    public void park(T something) {
        if (this.one == null) {
            this.one = something;
        } else if (this.two == null) {
            this.two = something;
        } else {
            System.out.println("Garage is full, can't park.");
        }
    }

    public T getSthOut(T sthToGetOut) {
        if (sthToGetOut != null) {
            if (sthToGetOut.equals(this.one)) {
                T temp = this.one;
                this.one = null;
                return this.one;
            } else if (sthToGetOut.equals(this.two)) {
                T temp = this.two;
                this.two = null;
                return temp;
            } else {
                System.out.println("No such object in a garage.");
            }
        } else {
            System.out.println("I don't know what you want.");
        }
        return sthToGetOut;
    }

}
