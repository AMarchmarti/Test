package org.htlinking.Offers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offers {

    private String oferta = null;
    private String prefix = null;
    private Map<String, String> dataBase = new HashMap<>();

    //Setters


    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    //Getters


    public String getOferta() {
        return oferta;
    }

    public String getPrefix() {
        return prefix;
    }

    public Map<String, String> getDataBase() {
        return dataBase;
    }


    public void addDataBase(String prefix, String offer){
        getDataBase().putIfAbsent(prefix, offer);
    }

    public String accesDB(){
        String total = "Ofertas: \n";
        for(String offer : getDataBase().values()){
            total += offer + "\n";
        }
        return total;
    }

}
