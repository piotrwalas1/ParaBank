package przyk2;

public class Student {
  public String imie;
  public String nazwisko;
  public String nick;
  public String email;
  public int nrindeksu;
public void przedstawsie(){
    System.out.println("nazywam sie :" + imie +nazwisko);
}
public void zalogujsie(){
    System.out.println("loguje sie za pomoca : "+ nick);
}
public void indeks(){
    System.out.println("moj nr indeksu : "+ nrindeksu);
}
}
