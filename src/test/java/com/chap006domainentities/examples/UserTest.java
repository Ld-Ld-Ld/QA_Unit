package com.chap006domainentities.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructorANewUser(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructorANewUserWithParameters(){
        User user = new User("admin", "123adm");

        assertEquals("given username expected", "username", user.getUsername());
        assertEquals("given password expected", "password", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();

        user.setPassword("PwD");

        assertEquals("set password expected", "PwD", user.getPassword());
            }
}
