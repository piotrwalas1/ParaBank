package przykl;

public class auto {
    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public auto(){

    }
    public auto(String marka, String model, Integer rok, Integer przebieg){
this.marka=marka;
this.model=model;
this.rok=rok;
this.przebieg=przebieg;
    }
    public void jedz(){
        System.out.println("jedz "+ marka);
    }
    public void hamuj(){
        System.out.println("hamuj "+ marka);
    }
    public void info(){
        System.out.println("marka : "+ marka);
        System.out.println("model : "+ model);
        System.out.println("rok : "+ rok);
        System.out.println("przebieg : "+przebieg);
    }
}
