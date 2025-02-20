package przykl;

public class stud {
    public String imie;
    public  String nazwisko;
    public String email;
    public int nrIndeksu;

    public static String nazwauczelni = "AGH";

    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie +" "+ nazwisko);
    }
    public void emailNr(){
        System.out.println("Moj nr indeksu to : "+ nrIndeksu +"a email to : "+ email);
    }
}
