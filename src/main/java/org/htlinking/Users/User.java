package org.htlinking.Users;

import org.htlinking.Offers.Offers;

import java.security.PrivateKey;
import java.security.PublicKey;

public class User {

    private String name = null;
    private String email = null;
    private String password = null;
    private PublicKey pubKey = null;
    private PrivateKey priKey = null;

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
        if (password.equals(getPassword())){
            System.out.println("Ha sido registrado correctamente, mire las ofertas.");
            //ir a ofertas
        }else{
            System.out.println("Se ha equivocado de contraseña");
        }
    }

    public void loginValid(String email, String pass){
        if(Login.login(email,pass,this)){
            System.out.println("Bienvenido, " + getName() +"." + " \nDebería revisar las nuevas ofertas que ofrecemos");
        }else{
            System.out.println("Credenciales erroneas, por favor introduzca nuevamente");
        }
    }

    public void showOffers(Offers offers){
        System.out.println(offers.accesDB());
    }
}
