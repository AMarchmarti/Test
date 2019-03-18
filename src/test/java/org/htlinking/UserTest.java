package org.htlinking;

import static org.junit.Assert.*;

import org.htlinking.Users.Login;
import org.htlinking.Users.Register;
import org.htlinking.Users.User;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{
    private User user = null;
    private Register regis = null;

    @Before
    public void __init__()
    {
        user = new User();
        regis = new Register();
        user.setName("Edu");
        user.setEmail("Toni");
        user.setPassword("12345678");

    }



    @Test
    public void getTest(){
        assertNotNull(user.getName());
        assertNotNull(user.getEmail());
        assertNotNull(user.getPassword());
    }

    @Test
    public void regisTest(){
        String pass = "12345678";
        user.validateUser(pass);
        //Caso test v{alido pasado
        String word = "12345634";
        user.validateUser(word);
        //Pasa los casos perfectamente
        user.registerUser(pass,regis);
        assertNotNull(regis);
    }

    @Test
    public void loginTest(){
        regis.register(user);
        assertTrue(Login.login(user.getEmail(), user.getPassword(), user));}
}
