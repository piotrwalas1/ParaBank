package przykl;

public class Student1 {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndeksu;

    public void przedstawSie(){
        System.out.println("Nazywam sie : "+ imie + " "+nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguje sie za pomoca : " + nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Moj nr indeksu to : "+ nrIndeksu);
    }

}
