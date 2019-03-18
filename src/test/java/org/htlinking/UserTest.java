package org.htlinking;

import static org.junit.Assert.*;

import org.htlinking.Users.User;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{
    private User user = null;

    @Before
    public void __init__()
    {
        user = new User("Antoni", "test@gmail.com", "12345678");

    }

    @Test
    public void constructorTest(){
        assertNotNull(user);
    }
}
