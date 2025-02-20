package przyk2;

public class stud2 {
    public static void main(String[] args) {
        Student zet = new Student();
        zet.imie = "zenek";
        zet.nazwisko = "Nowak";
        zet.nick= "zetton";
        zet.nrindeksu= 112455;
        zet.email= "onet@onet.pl";

        Student Maniek = new Student();
        Maniek.imie = "maniek";
        Maniek.nazwisko = "mankowska";
        Maniek.nick= "mankoooo";
        Maniek.nrindeksu= 1155555;
        Maniek.email= "man@onet.pl";

        zet.indeks();
        zet.zalogujsie();
        zet.przedstawsie();

        Maniek.przedstawsie();
        Maniek.zalogujsie();
        Maniek.indeks();
    }
}
