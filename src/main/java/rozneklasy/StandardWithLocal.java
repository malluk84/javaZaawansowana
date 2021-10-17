package rozneklasy;

public class StandardWithLocal {

    public void doSth() {

        if (true) { // klasa lokalna nie musi byc w ifie - moze byc w dowolnej sekcji kodu

            class LocalClass {
                int wiek;

                public LocalClass(int wiek) {
                    this.wiek = wiek;
                }
            }

            LocalClass lc = new LocalClass(5);
        }

        // LocalClass lc; <- Blad! Ta klasa nie jest dostepna juz za blokiem kodu, w ktorym zostala zdefinowana
    }
}
