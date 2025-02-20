package przyk2;

public class stud {
    public static void main(String[] args) {
        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Nowak";
        adam.nrindeksu = 112856;
        adam.email = "adam@o2.pl";
        adam.nick = "adamski";

        Student kaja = new Student();
        kaja.imie = "Kaja";
        kaja.nazwisko = "Byjk";
        kaja.nrindeksu = 11245;
        kaja.email = "kaja@o2.pl";
        kaja.nick = "kajak";

        Student zenek = new Student();
        zenek.imie = "Zenek";
        zenek.nazwisko = "Zenkowy";
        zenek.nrindeksu = 666656;
        zenek.email = "zed@o2.pl";
        zenek.nick = "zenek";

        Student[] students = new Student[3];
        students[0]= adam;
        students[1]= kaja;
        students[2]= zenek;

        for(int i =0 ; i<students.length; i++){
            students[i].przedstawsie();
            students[i].zalogujsie();
            students[i].indeks();
        }
    }
}
