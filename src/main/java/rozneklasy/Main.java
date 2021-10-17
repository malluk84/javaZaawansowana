package rozneklasy;

public class Main {
    public static void main(String[] args) {
        // 'klasyczne' kasy wewnetrzne
        Standard standard = new Standard();
        Standard.InnerClass innerClass = standard.new InnerClass();


        // statyczne klasy wewnetrzne
        StandardWithStatic swc = new StandardWithStatic();
        StandardWithStatic.InnerStaticClass isc = new StandardWithStatic.InnerStaticClass();


        // lokalna klasa wewnetrzna
        StandardWithLocal swl = new StandardWithLocal();
        swl.doSth();
    }

}
