package przykl;

public class stud2 {
    public static void main(String[] args) {

        stud arek = new stud();
        arek.imie = "Arek";
        arek.nazwisko = "Wlodarczyk";
        arek.email = "arkus@o2.pl";
        arek.nrIndeksu= 125455;
String uczelniaarka = stud.nazwauczelni;

        stud marta = new stud();
        marta.imie = "Marta";
        marta.nazwisko = "Olaf";
        marta.email = "olaff@o2.pl";
        marta.nrIndeksu= 154665;

        stud bart = new stud();
        bart.imie = "Bartek";
        bart.nazwisko = "Mozil";
        bart.email = "bartolomino@o2.pl";
        bart.nrIndeksu= 6666455;

        stud[] student = new stud[3];
        student[0]=arek;
        student[1]=marta;
        student[2]=bart;
        for(int i=0; i<student.length; i++){
            student[i].przedstawSie();
            student[i].emailNr();
        }


    }
}
