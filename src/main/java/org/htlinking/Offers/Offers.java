package org.htlinking.Offers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offers {

    private String name = null;
    private String description = null;
    private String prefix = null;
    private String[] ofertas = new String[2];
    private Map<String, String[]> dataBase = new HashMap<>();

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrefix() {
        return prefix;
    }

    public String[] getOfertas() {
        return ofertas;
    }

    public Map<String, String[]> getDataBase() {
        return dataBase;
    }

    public void addOffers(String name, String description){
        getOfertas()[0] = name;
        getOfertas()[1] = description;
    }

    public void addDataBase(String prefix, String[] ofertas){
        getDataBase().putIfAbsent(prefix, ofertas);
    }
}
