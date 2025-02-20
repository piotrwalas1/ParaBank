package przykl;

public class autoTest {
    public static void main(String[] args) {
        auto mercedes = new auto("mercedes", "c", 1999,2000000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        auto audi = new auto("audi", "a6", 20024, 21500);
        audi.jedz();
        audi.hamuj();
        audi.info();

        auto fiat = new auto("fiat", "tipo", 2020, 120000);
        fiat.jedz();
        fiat.hamuj();
        fiat.info();
    }
}
