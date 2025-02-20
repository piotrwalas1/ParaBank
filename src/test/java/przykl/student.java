package przykl;

public class student {
    public static void main(String[] args) {
        Student1 adam = new Student1();
        adam.imie = "Adam";
        adam.nazwisko = "Nowak";
        adam.nick = "adamus";
        adam.nrIndeksu = 112544;
        adam.email= "nowak@o2.pl";

        Student1 magda = new Student1();
        magda.imie = "Magda";
        magda.nazwisko = "Kowalaska";
        magda.nick = "Madziakowal";
        magda.nrIndeksu = 6666;
        magda.email= "madzia@o2.pl";

        Student1 zenek = new Student1();
        zenek.imie = "Zenon";
        zenek.nazwisko = "Wawryla";
        zenek.nick = "Zenus";
        zenek.nrIndeksu = 66522566;
        zenek.email= "zenus@o2.pl";

        Student1[] students = new Student1[3];
        students[0]=adam;
        students[1]=magda;
        students[2]=zenek;
        for(int i=0; i<students.length; i++){
            students[i].przedstawSie();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }
    }

}
