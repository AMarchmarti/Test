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

}
