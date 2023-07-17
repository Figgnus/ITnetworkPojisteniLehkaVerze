package cz.itnetwork;

import java.util.ArrayList;
import java.util.List;

public class Evidence {
    private List<Pojisteny> seznamPojistenych;
    public Evidence(){
        seznamPojistenych = new ArrayList<>();
    }
    public void pridatPojisteneho(Pojisteny pojisteny){
        seznamPojistenych.add(pojisteny);
    }
    public List<Pojisteny> getSeznamPojistenych(){
        return seznamPojistenych;
    }
    public Pojisteny najdiPojisteneho(String jmeno, String prijimeni){
        for(Pojisteny p : seznamPojistenych){
            if(p.getJmeno().equalsIgnoreCase(jmeno) && p.getPrijimeni().equalsIgnoreCase(prijimeni)){
                return p;
            }
        }
        return null;
    }

}
