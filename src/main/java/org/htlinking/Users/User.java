package org.htlinking.Users;

import java.security.PrivateKey;
import java.security.PublicKey;

public class User {

    private String name = null;
    private String email = null;
    private String password = null;
    private PublicKey pubKey = null;
    private PrivateKey priKey = null;

    //Constructor
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Setters


    public void setPubKey(PublicKey pubKey) {
        this.pubKey = pubKey;
    }

    public void setPriKey(PrivateKey priKey) {
        this.priKey = priKey;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public PublicKey getPubKey() {
        return pubKey;
    }

    public PrivateKey getPriKey() {
        return priKey;
    }

    public void generateKeyPair() {
        setPubKey(GenSig.generateKeyPair().getPublic());
        setPriKey(GenSig.generateKeyPair().getPrivate());
    }


    public void registerUser(String pass, Register register){
        register.register(this);
        validateUser(pass);

    }

    public void validateUser(String password){
        if (password == getPassword()){
            System.out.println("Ha sido registrado correctamente, mire las ofertas.");
            //ir a ofertas
        }else{
            System.out.println("Se ha equivocado de contraseña");
        }
    }
}
