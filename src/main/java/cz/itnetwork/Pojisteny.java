package cz.itnetwork;

public class Pojisteny {
    private String jmeno;
    private String prijimeni;
    private int vek;
    private String telefon;

    public Pojisteny(String jmeno, String prijimeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijimeni = prijimeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    public String getJmeno(){
        return jmeno;
    }
    public String getPrijimeni(){
        return prijimeni;
    }
    public int getVek(){
        return vek;
    }
    public String getTelefon(){
        return telefon;
    }
    @Override
    public String toString(){
        return "Jméno: "+jmeno+ "\n"+
                "Přijímení: "+prijimeni+"\n"+
                "Věk: "+vek+"\n"+
                "Telefon: "+telefon+"\n";
    }
}
